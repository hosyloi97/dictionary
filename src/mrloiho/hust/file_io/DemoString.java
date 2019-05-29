/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrloiho.hust.file_io;

import static mrloiho.hust.file_io.FileIO.checkType;
import mrloiho.hust.model.Dictionary;

/**
 *
 * @author Mr Loi Ho
 */
public class DemoString {

    public static void demoString(String string) {
        String wordOrigin = "";
        String wordSpelling = "";
        String wordType = "";
        String wordMean = "";
        String temp = string;
        while (temp != null) {
            int index = 0;
            index = temp.indexOf("##");
            if (index >= 0) {
                wordOrigin = temp.substring(0, index);
                temp = temp.substring(index + 2, temp.length());
                temp = temp.trim();
                wordOrigin = wordOrigin.trim();
            } else {
                temp = null;
            }
            System.out.println("meo co gi de lam ca");
        }
    }

    public static void testInput(String line) {
        Dictionary d = new Dictionary();
        int index = 0;
        String temp = new String();
        if ((index = line.indexOf("##")) >= 0) {
            d.setWordOrigin(line.substring(0, index).trim());
            line = line.substring(index + 2, line.length()).trim();
        }
        if ((index = line.indexOf("#*")) >= 0) {
            d.setWordSpelling(line.substring(0, index).trim());
            line = line.substring(index + 2, line.length()).trim();
        }

        if (checkType(line)) {
            index = line.indexOf("|-");
            temp = line.substring(0, index).trim();
            line = line.substring(index, line.length()).trim();
            d.setWordType(temp);
        }
        while (!line.isEmpty()) {
            if ((index = line.lastIndexOf("|-")) >= 0) {
//                int newIndex = line.indexOf(";");
//                if (newIndex >= 0) {
                    temp = line.substring(index+2, line.length());
                    line = line.substring(0, index);
                    d.wordMeans.add(temp);
            }
 else {
                temp = line.substring(0, line.length()).trim();
                d.wordMeans.add(temp);
                line = "";
            }
        }
    }

    public static void main(String[] args) {

        String temp1 = "a-going##[ə'gouiɳ]#*  tính từ & phó từ|- đang chạy, đang chuyển động, đang hoạt động, đang tiến hành";
        String temp2 = "a-power##['ei'pauə]#*  danh từ|- năng lượng nguyên tử|- cường quốc nguyên tử";
        String temp3 = "abandonment##[ə'bændənmənt]#*  danh từ|- sự bỏ, sự từ bỏ, sự bỏ rơi, sự ruồng bỏ|- tình trạng bị bỏ rơi, tình trạng bị ruồng bỏ|- sự phóng túng, sự tự do, sự buông thả";
//        testInput(temp5);
//        testInput(temp4);
        testInput(temp3);
        testInput(temp2);
        testInput(temp1);
    }
}

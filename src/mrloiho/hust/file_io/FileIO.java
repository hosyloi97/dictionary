/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrloiho.hust.file_io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import mrloiho.hust.model.Dictionary;

/**
 *
 * @author Mr Loi Ho
 */
public class FileIO {

//    Main main = new Main
    private static ArrayList<Dictionary> listDics = new ArrayList<Dictionary>();

    public static Boolean checkType(String string) {
        Boolean check = true;
        if ((string.indexOf("danh từ")) == -1
                && (string.indexOf("tính từ")) == -1) {
            if ((string.indexOf("động từ")) == -1
                    && (string.indexOf("trạng từ")) == -1) {
                if ((string.indexOf("phó từ") == -1)
                        && (string.indexOf("giới từ")) == -1) {
                    {
                        check = false;
                    }
                }
            }
        }
        System.out.println("check" + check);
        return check;
    }

    public static ArrayList<Dictionary> readFile(String fileName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
        BufferedReader br = new BufferedReader(inputStreamReader);
        String line = new String();
        int i = 0;
        while ((line = br.readLine()) != null) {
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
                if ((index = line.indexOf("|-")) >= 0) {
                    int newIndex = line.indexOf(";");
                    if (newIndex >= 0) {
                        temp = line.substring(2, newIndex);
                        line = line.substring(newIndex + 1, line.length());
                        d.wordMeans.add(temp);
                    } else {
                        temp = line.substring(2, line.length()).trim();
                        d.wordMeans.add(temp);
                        line = "";
                    }
                } else {
                    temp = line.substring(0, line.length()).trim();
                    d.wordMeans.add(temp);
                    line = "";
                }
            }
            i = i + 1;
            System.out.println("i: " + i);
            listDics.add(d);
//            }
        }
        fileInputStream.close();
        br.close();
        System.out.println("import data done");
        return listDics;
    }

//    public static void printDics(ArrayList<Dictionary> list) {
//        for (int i = 0; i < list.size(); i++) {
//            printDic(list.get(i));
//        }
//    }
//
//    public static void printDic(Dictionary dictionary) {
//        System.out.println(dictionary.getWordOrigin() + "  "
//                + dictionary.getWordType() + "  " + dictionary.getWordMean());
//    }
//    public static void main(String[] args) throws Exception {
//        String dirName = "F://PROJECT/EasyDictionary/Eng-Vie_database.txt";
//        readFile(dirName);
////        printDics(listDics);
//
//    }
}

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

    public static void readFile(String fileName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
        BufferedReader br = new BufferedReader(inputStreamReader);
        String line = new String();
        while ((line = br.readLine()) != null) {
            if (line.equals("1")) {
                Dictionary d = new Dictionary();
                d.setWordOrigin(br.readLine());
                d.setWordType(br.readLine());
                d.setWordMean(br.readLine());
                listDics.add(d);
            }
        }
        fileInputStream.close();
        br.close();
        System.out.println("nap thong tin thanh cong");
    }

    public static void printDics(ArrayList<Dictionary> list) {
        for (int i = 0; i < list.size(); i++) {
            printDic(list.get(i));
        }
    }

    public static void printDic(Dictionary dictionary) {
        System.out.println(dictionary.getWordOrigin() + "  "
                + dictionary.getWordType() + "  " + dictionary.getWordMean());
    }

    public static void main(String[] args) throws Exception {
        String dirName = "F://PROJECT/EasyDictionary/Eng-Vie_database.txt";
        readFile(dirName);
        printDics(listDics);

    }
}

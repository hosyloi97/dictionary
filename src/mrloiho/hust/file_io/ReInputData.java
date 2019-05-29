/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrloiho.hust.file_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import mrloiho.hust.model.Dictionary;

/**
 *
 * @author Mr Loi Ho
 */
public class ReInputData {

    public static void reInputFile(String fileNameIn, String fileNameOut) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fileNameIn);
        FileOutputStream fileOutputStream = new FileOutputStream(fileNameOut);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
        BufferedReader br = new BufferedReader(inputStreamReader);
        Writer out = new BufferedWriter(outputStreamWriter);
        String line = new String();
        int i = 0;
        while ((line = br.readLine()) != null) {
            int index = line.indexOf(";;");
//            if (index >= 0) {
//                out.write(line.substring(0, index));
//                out.write("\n");
//            } else {
//                out.write(line);
//                out.write("\n");
//ghi lai file text tru cac hang co ky tu ";;"
//            if (index == -1) {
//                out.write(line);
//                out.write("\n");
//            }
//ghi lai file text co index dau dong
            {
                i++;
                out.write(i + "   ");
                out.write(line);
                out.write("\n");
            }
        }
        fileInputStream.close();
        br.close();
        fileOutputStream.close();
        out.flush();
        out.close();
        System.out.println("nap thong tin thanh cong");
    }

    public static void main(String[] args) throws IOException {
        String fileIn = "F://PROJECT/EasyDictionary/Eng-Vie_database.txt";
        String fileOut = "F://PROJECT/EasyDictionary/Eng-Vie_database_new1.txt";
        reInputFile(fileIn, fileOut);
    }
}

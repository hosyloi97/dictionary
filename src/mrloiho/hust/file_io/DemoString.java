/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrloiho.hust.file_io;

/**
 *
 * @author Mr Loi Ho
 */
public class DemoString {
    public static void demoString(String string){
        String wordOrigin= "";
        String wordSpelling = "";
        String wordType="";
        String wordMean="";
        String temp= string;
        while(temp!=null){
            int index=0;
            index=temp.indexOf("##");
            if(index >=0){
                wordOrigin= temp.substring(0, index);
                temp=temp.substring(index+2,temp.length());
                temp=temp.trim();
                wordOrigin=wordOrigin.trim();
            }
            else temp=null;
            System.out.println("meo co gi de lam ca");
        }
    }
    public static void main(String[] args) {
       String st = "        codpiec  asdasdasd     ##         danh từ|- túi hoặc nắp che phần trước quần của nam giới";
        demoString(st);
    }
}

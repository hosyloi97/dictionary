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
public class CheckType {

    public static Boolean checkType1(String string) {
        Boolean check = true;
        if ((string.indexOf("danh từ")) == -1
                && (string.indexOf("tính từ")) == -1) {
            if ((string.indexOf("động từ")) == -1
                    && (string.indexOf("trạng từ")) == -1) {
                if ((string.indexOf("phó từ") == -1) 
                     && (string.indexOf("giới từ") )== -1)
                
                {
                    {
                        check = false;
                    }
                }
            }
        }
        System.out.println("check" + check);
        return check;
    }

//    public static void main(String[] args) {
//         String temp1 = "abelmosk##['eibəlmɔsk]#*  danh từ|- (thực vật học) cây vông vàng";
//        String temp2 = "aberrance##[æ'berəns]#*  danh từ|- sự lầm lạc|- (sinh vật học) sự khác thường";
//        String temp3 = "abet##[ə'bet]#*  ngoại động từ|- xúi bẩy, xúi giục, khích|- tiếp tay (ai làm bậy)";
////        String temp4 = "abhorrently###- xem abhorrent";
////        String temp5 = "aasvogel##['ɑ:sfougəl]#*  danh từ|- (động vật học) con kên kên (nam phi)";
//        checkType1(temp3);
////        checkType1(temp4);
//        checkType1(temp1);
//        checkType1(temp2);
//                
//    }
}

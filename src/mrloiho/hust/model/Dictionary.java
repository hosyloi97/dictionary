/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrloiho.hust.model;

import java.util.ArrayList;

/**
 *
 * @author Mr Loi Ho
 */
public class Dictionary {

    private String wordOrigin;
    private String wordSpelling;
    private String wordType;
    public ArrayList<String> wordMeans = new ArrayList<String>();

    public Dictionary(String wordOrigin, String wordSpelling) {
        this.wordOrigin = wordOrigin;
        this.wordSpelling = wordSpelling;
    }

    public Dictionary() {
    }

    public String getWordOrigin() {
        return wordOrigin;
    }

    public void setWordOrigin(String wordOrigin) {
        this.wordOrigin = wordOrigin;
    }

    public String getWordSpelling() {
        return wordSpelling;
    }

    public void setWordSpelling(String wordSpelling) {
        this.wordSpelling = wordSpelling;
    }

    public String getWordType() {
        return wordType;
    }

    public void setWordType(String wordType) {
        this.wordType = wordType;
    }
}

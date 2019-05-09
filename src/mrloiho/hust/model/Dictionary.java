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
    private ArrayList<String> wordTypes = new ArrayList<String>();
    private ArrayList<String> wordEquals = new ArrayList<String>();
    private ArrayList<String> wordMeans = new ArrayList<String>();
    private ArrayList<WordEqual> wordEqualList= new ArrayList<WordEqual>();

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

    public ArrayList<String> getWordTypes() {
        return wordTypes;
    }

    public void setWordTypes(ArrayList<String> wordTypes) {
        this.wordTypes = wordTypes;
    }

    public ArrayList<String> getWordEquals() {
        return wordEquals;
    }

    public void setWordEquals(ArrayList<String> wordEquals) {
        this.wordEquals = wordEquals;
    }

    public ArrayList<String> getWordMeans() {
        return wordMeans;
    }

    public void setWordMeans(ArrayList<String> wordMeans) {
        this.wordMeans = wordMeans;
    }

    public ArrayList<WordEqual> getWordEqualList() {
        return wordEqualList;
    }

    public void setWordEqualList(ArrayList<WordEqual> wordEqualList) {
        this.wordEqualList = wordEqualList;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrloiho.hust.model;

/**
 *
 * @author Mr Loi Ho
 */
public class Dictionary {
    private String wordOrigin;
    private String wordMean;
    private String wordType;

    public Dictionary(String wordOrigin, String wordMean, String wordType) {
        this.wordOrigin = wordOrigin;
        this.wordMean = wordMean;
        this.wordType = wordType;
    }

    public Dictionary() {
    }

    public String getWordOrigin() {
        return wordOrigin;
    }

    public String getWordMean() {
        return wordMean;
    }

    public String getWordType() {
        return wordType;
    }

    public void setWordOrigin(String wordOrigin) {
        this.wordOrigin = wordOrigin;
    }

    public void setWordMean(String wordMean) {
        this.wordMean = wordMean;
    }

    public void setWordType(String wordType) {
        this.wordType = wordType;
    }
    
}

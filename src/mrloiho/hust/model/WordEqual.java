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
public class WordEqual {
    private String wordEqual;
    private String wordEqualMean;

    public WordEqual(String wordEqual, String wordEqualMean) {
        this.wordEqual = wordEqual;
        this.wordEqualMean = wordEqualMean;
    }

    public WordEqual() {
    }

    public String getWordEqual() {
        return wordEqual;
    }

    public String getWordEqualMean() {
        return wordEqualMean;
    }

    public void setWordEqual(String wordEqual) {
        this.wordEqual = wordEqual;
    }

    public void setWordEqualMean(String wordEqualMean) {
        this.wordEqualMean = wordEqualMean;
    }
    
}

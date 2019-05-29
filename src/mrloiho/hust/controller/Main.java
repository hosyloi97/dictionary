/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrloiho.hust.controller;

import java.util.ArrayList;
import mrloiho.hust.model.Dictionary;
import mrloiho.hust.file_io.FileIO;

/**
 *
 * @author Mr Loi Ho
 */
public class Main {

    private ArrayList<Dictionary> listDics = new ArrayList<Dictionary>();

    public ArrayList<Dictionary> getListDics() {
        return listDics;
    }

    public void setListDics(ArrayList<Dictionary> listDics) {
        this.listDics = listDics;
    }

    public Main() {
    }
}

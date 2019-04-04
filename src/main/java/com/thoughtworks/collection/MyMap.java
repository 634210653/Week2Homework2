package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MyMap {

    List<Integer> array;
    private String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private List<String> letterList = Arrays.asList(letters);

    public MyMap(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> getTriple() {

        List<Integer> res = new ArrayList<Integer>();
        for(int num : array){
           res.add(num*3);
        }
        return res;
    }

    public List<String> mapLetter() {

        List<String> res = new ArrayList<String>();
        for(int num : array){
            res.add(letters[num-1]);
           // res.add(new Character((char)(num+96)).toString());
        }
        return res;
    }

    public List<String> mapLetters() {
        List<String> res = new ArrayList<String>();
        for(int num : array){
            StringBuffer str = new StringBuffer();
            for(int cur = num; cur != 0; ){
                int key = (cur-1)%26;
                str.insert(0, letters[key]);
                cur = (cur-1)/26;
            }
            res.add(str.toString());
        }
        return res;
    }

    public List<Integer> sortFromBig() {

        ArrayList<Integer> res = new ArrayList<Integer>();
        res.addAll(array);
        res.sort(Comparator.reverseOrder());
        return res;

    }

    public List<Integer> sortFromSmall() {

        ArrayList<Integer> res = new ArrayList<Integer>();
        res.addAll(array);
        res.sort(Comparator.naturalOrder());
        return res;
    }
}

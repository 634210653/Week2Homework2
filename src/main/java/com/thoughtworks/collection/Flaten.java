package com.thoughtworks.collection;

import com.thoughtworks.utility.Condition;

import java.util.ArrayList;
import java.util.List;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> res   = new ArrayList<Integer>();
        for(int i=0; i<array.length;i++){
            for(int j=0; j<array[i].length;j++){
                res.add(array[i][j]);
            }
        }
        return  res;
    }
    public List<Integer> transformToUnrepeatedOneDimesional() {
        List<Integer> res   = new ArrayList<Integer>();
        for(int i=0; i<array.length;i++){
            for(int j=0; j<array[i].length;j++){
                if( !res.contains(array[i][j]) ) {
                    res.add(array[i][j]);
                }
            }
        }
        return  res;
    }
}

package com.thoughtworks.utility;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static boolean isEvens(int number){
        return  number%2 == 0 ? true : false;
    }

    public static List<Integer> sortBorder(int left,int right){
        List<Integer>res = new ArrayList<>();
        if(left >right){
            res.add(right);
            res.add(left);
        }else{
            res.add(left);
            res.add(right);
        }
        return res;
    }
}

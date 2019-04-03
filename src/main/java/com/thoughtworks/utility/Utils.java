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

    public static List<Integer> range(int start,int end,Condition<Integer> con){

        int step = start>end?-1:1;
        List<Integer> res = new ArrayList<Integer>();
        for(int i=start;i!=end+step; i=i+step){
            if(con.getCondition(i)){
                res.add(i);
            }
        }
        return res;
    }

    public static List<Integer> getEvens(List<Integer> arrayList){
        //get all even or get indexes
        List<Integer> evens = new ArrayList<Integer>();
        for(int num : arrayList){
            if(Utils.isEvens(num)){
                evens.add(num);
            }
        }
        return evens;
    }
}

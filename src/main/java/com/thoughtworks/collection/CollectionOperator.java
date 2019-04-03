package com.thoughtworks.collection;

import com.thoughtworks.utility.Condition;
import com.thoughtworks.utility.Utils;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionOperator {


    public List<Integer> getListByInterval(int left, int right) {
        //create condition
        Condition<Integer> con = new Condition<Integer>() {
            @Override
            public boolean getCondition(Integer num) {
                return true;
            }
        };
        //create range
        return Utils.range(left,right,con);
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {

        //create condition
        Condition<Integer> con = new Condition<Integer>() {
            @Override
            public boolean getCondition(Integer num) {
                return Utils.isEvens(num);
            }
        };
        //create range
        return Utils.range(left,right,con);
    }

    public List<Integer> popEvenElments(int[] array) {

        List<Integer> res = new ArrayList<Integer>( Arrays.stream(array).boxed().collect(Collectors.toList()));
        return  Utils.getEvens(res);
    }

    public int popLastElment(int[] array) {
        if(array.length == 0)
            return -1;
        return array[array.length-1];
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {

        List<Integer> arr1  = Arrays.stream(firstArray).boxed().collect(Collectors.toList());
        List<Integer> arr2  = Arrays.stream(secondArray).boxed().collect(Collectors.toList());
        arr1.retainAll(arr2);
        return arr1 ;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {

        List<Integer> arr1  = new ArrayList<Integer>(Arrays.asList(firstArray));
        List<Integer> arr2  = new ArrayList<Integer>(Arrays.asList(secondArray));
        arr2.removeAll(arr1);
        arr1.addAll(arr2);
        return arr1 ;
    }
}

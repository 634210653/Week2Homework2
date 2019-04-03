package com.thoughtworks.collection;

import com.thoughtworks.utility.Utils;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {

        return Utils.getEvens(array);
    }

    public List<Integer> filterMultipleOfThree() {

        List<Integer> res  = new ArrayList<Integer>();
        for(int num : array){
            if(num%3 == 0){
                res.add(num);
            }
        }
        return res;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {

        int [] arr1 = firstList.stream().mapToInt(Integer::valueOf).toArray();
        int [] arr2 = secondList.stream().mapToInt(Integer::valueOf).toArray();
        return  new CollectionOperator().popCommonElement(arr1,arr2);
    }

    public List<Integer> getDifferentElements() {

        HashSet<Integer> set = new HashSet<>(array);
        return  new ArrayList<Integer>(set);
    }
}
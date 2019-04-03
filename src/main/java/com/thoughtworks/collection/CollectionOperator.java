package com.thoughtworks.collection;

import com.thoughtworks.utility.Utils;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class CollectionOperator {


    public List<Integer> getListByInterval(int left, int right) {

        List<Integer>borders = Utils.sortBorder(left,right);
        List<Integer> res  = new ArrayList<Integer>();
        for(int i=borders.get(0);i<=borders.get(1);i++){
            res.add(i);
        }
        return res;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        throw new NotImplementedException();
    }

    public List<Integer> popEvenElments(int[] array) {
        throw new NotImplementedException();
    }

    public int popLastElment(int[] array) {
        throw new NotImplementedException();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}

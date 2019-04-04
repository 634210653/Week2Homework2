package com.thoughtworks.collection;

import com.thoughtworks.utility.Utils;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
       return Collections.max(arrayList);
    }

    public double getMinimum() {
        return Collections.min(arrayList);
    }

    public double getAverage() {
        return arrayList.stream().mapToInt(Integer::valueOf).average().getAsDouble();
    }

    public double getOrderedMedian() {

        arrayList.sort(Comparator.naturalOrder());
        int idx = arrayList.size()/2 ;
        if(arrayList.size()%2 ==0){
           return  (arrayList.get(idx-1)+arrayList.get(idx))/2.0;
        }else {
           return  arrayList.get(idx);
        }
    }

    public int getFirstEven() {

        for(int num : arrayList){
           if(Utils.isEvens(num))
               return  num;
       }
        return -1;
    }

    public int getIndexOfFirstEven() {

        for(int idx =0; idx<arrayList.size();idx++){
            if(Utils.isEvens(arrayList.get(idx))){
                return idx;
            }
        }
        return -1;
    }

    public boolean isEqual(List<Integer> arrayList) {

       if(this.arrayList.size() != arrayList.size())
           return  false;

       for(int i=0; i< arrayList.size(); i++){
           if(this.arrayList.get(i) != arrayList.get(i)){
               return  false;
           }
       }
       return  true;
    }

    public Double getMedianInLinkList(SingleLink<Integer> singleLink) {
        int size = 0;
        for(Integer num : arrayList){
           singleLink.addTailPointer(num);
           size++;
        }
        int idx = size/2 ;
        if(size%2 ==0){
            return  (singleLink.getNode(idx)+singleLink.getNode(idx+1))/2.0;
        }else {
            return  singleLink.getNode(idx+1)*1.0;
        }

    }

    public int getLastOdd() {

        for(int idx =arrayList.size()-1; idx>=0;idx--){
            if(!Utils.isEvens(arrayList.get(idx))){
                return arrayList.get(idx);
            }
        }
        return -1;
    }

    public int getIndexOfLastOdd() {

        for(int idx =arrayList.size()-1; idx>=0;idx--){
            if(!Utils.isEvens(arrayList.get(idx))){
                return idx;
            }
        }
        return -1;
    }
}

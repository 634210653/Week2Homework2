package com.thoughtworks.collection;

import com.thoughtworks.utility.Utils;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Add {

    public int getSumOfEvens(int leftBorder, int rightBorder) {

        List<Integer>borders = Utils.sortBorder(leftBorder,rightBorder);
        int sum = 0;
        for(int i = borders.get(0);i<=borders.get(1);i++) {
            if(Utils.isEvens(i)){
                sum += i;
            }
        }
        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {

        List<Integer>borders = Utils.sortBorder(leftBorder,rightBorder);
        int sum = 0;
        for(int i = borders.get(0);i<=borders.get(1);i++) {
            if(!Utils.isEvens(i)){
                sum += i;
            }
        }
        return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {

        int sum = 0;
        for (int i: arrayList) {
            sum += i*3+2;
        }
        return sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {

        for (int i=0;i<arrayList.size();i++) {
            int num = arrayList.get(i);
            if (!Utils.isEvens(num)) {
                arrayList.set(i, num * 3 + 2);
            }
        }
        return arrayList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {

        int sum = 0;
        for(int num : arrayList){
            if(!Utils.isEvens(num)){
                sum += num*3+5;
            }
        }
        return sum;
    }

    public double getMedianOfEven(List<Integer> arrayList) {

         List<Integer> evens = Utils.getEvens(arrayList);
         //get median
        int idx = evens.size()/2;
        if(Utils.isEvens(evens.size())){
           return (evens.get(idx-1)+evens.get(idx))/2.0;
        }else{
           return evens.get(idx);
        }
    }

    public double getAverageOfEven(List<Integer> arrayList) {

        List<Integer> evens = Utils.getEvens(arrayList);
        double avg = 0.0;
        for(int i=0;i<evens.size();i++){
            avg = (avg * i+ evens.get(i))/ (i+1);
        }
        return avg;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        return Utils.getEvens(arrayList).contains(specialElment);
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        //get Set
         HashSet<Integer> set =  new HashSet<Integer>(Utils.getEvens(arrayList));
        return new ArrayList<Integer>(set);
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        LinkedList<Integer> evens = new LinkedList<Integer>();
        LinkedList<Integer> odds = new LinkedList<Integer>();
        for(int num : arrayList){
            if(Utils.isEvens(num)){
                int idx = 0;
                while(idx<evens.size()){
                    if(evens.get(idx)>=num)
                        break;
                    idx++;
                }
                evens.add(idx,num);
            }else{
                int idx = 0;
                while(idx<odds.size()){
                    if(odds.get(idx)<=num)
                        break;
                    idx++;
                }
                odds.add(idx,num);
            }
        }
        evens.addAll(odds);
        odds.clear();
        return evens;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {

        List<Integer> res = new ArrayList<Integer>();
        for(int i=0;i<arrayList.size()-1;i++){
           res.add((arrayList.get(i)+ arrayList.get(i+1))*3);
        }
        return res;
    }
}

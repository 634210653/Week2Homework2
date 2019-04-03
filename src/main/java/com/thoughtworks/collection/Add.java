package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Add {

    public  boolean isEvens(int number){
        return  number%2 == 0 ? true : false;
    }

    public int getSumOfEvens(int leftBorder, int rightBorder) {

        int low = leftBorder<rightBorder? leftBorder:rightBorder;
        int high = leftBorder>rightBorder? leftBorder:rightBorder;
        int sum = 0;
        for(int i = low;i<=high;i++){
            if(this.isEvens(i)){
                sum += i;
            }
        }
        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {

        int low = leftBorder<rightBorder? leftBorder:rightBorder;
        int high = leftBorder>rightBorder? leftBorder:rightBorder;
        int sum = 0;
        for(int i = low;i<=high;i++) {
            if(!isEvens(i)){
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
            if (!isEvens(num)) {
                arrayList.set(i, num * 3 + 2);
            }
        }
        return arrayList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {

        int sum = 0;
        for(int num : arrayList){
            if(!isEvens(num)){
                sum += num*3+5;
            }
        }
        return sum;
    }

    public List<Integer> getEvens(List<Integer> arrayList){
        //get all even or get indexes
        List<Integer> evens = new ArrayList<Integer>();
        for(int num : arrayList){
            if(isEvens(num)){
                evens.add(num);
            }
        }
        return evens;
    }

    public double getMedianOfEven(List<Integer> arrayList) {

         List<Integer> evens = getEvens(arrayList);
         //get median
        int idx = evens.size()/2;
        if(isEvens(evens.size())){
           return (evens.get(idx-1)+evens.get(idx))/2.0;
        }else{
           return evens.get(idx);
        }
    }

    public double getAverageOfEven(List<Integer> arrayList) {

        List<Integer> evens = getEvens(arrayList);
        double avg = 0.0;
        for(int i=0;i<evens.size();i++){
            avg = (avg * i+ evens.get(i))/ (i+1);
        }
        return avg;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        return getEvens(arrayList).contains(specialElment);
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        //get Set
         HashSet<Integer> set =  new HashSet<Integer>(getEvens(arrayList));
        return new ArrayList<Integer>(set);
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        LinkedList<Integer> evens = new LinkedList<Integer>();
        LinkedList<Integer> odds = new LinkedList<Integer>();
        for(int num : arrayList){
            if(isEvens(num)){
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

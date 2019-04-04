package com.thoughtworks.collection;

import java.util.LinkedList;
import java.util.List;

public class SingleLinkImp<T> implements SingleLink<T> {

    private  LinkedList<T> datas = new LinkedList<T>();

    @Override
    public void addTailPointer(T item){
      datas.addLast(item);
    }

    @Override
    public T getNode(int index){

        return datas.get(index-1);
    }
}

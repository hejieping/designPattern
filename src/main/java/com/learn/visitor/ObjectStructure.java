package com.learn.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jieping.hjp on 2017/7/13.
 */
public class ObjectStructure {
    private List<Element> list = new ArrayList<>();
    public void attach(Element element){
        list.add(element);
    }
    public void delete(Element element){
        list.remove(element);
    }
    public void accept(Visitor visitor){
        for(Element e : list){
            e.accept(visitor);
        }
    }
}

package com.learn.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jieping.hjp on 2017/7/7.
 */
public class Product {
    List<String> parts = new ArrayList<String>();
    public void add(String part){
        parts.add(part);
    }
    public void show(){
        for(String part : parts){
            System.out.println(part);
        }
    }
}

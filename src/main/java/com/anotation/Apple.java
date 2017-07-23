package com.anotation;

import java.util.HashMap;

/**
 * Created by jieping.hjp on 2017/7/22.
 */
public class Apple {
    HashMap

    @FruitName("Apple")
    private String appleName;

    @FruitColor(fruitColor= FruitColor.Color.RED)
    private String appleColor;




    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }
    public String getAppleColor() {
        return appleColor;
    }


    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }
    public String getAppleName() {
        return appleName;
    }

    public void displayName(){
        System.out.println("水果的名字是：苹果");
    }


}
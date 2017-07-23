package com.algorithm;

/**
 * Created by jieping.hjp on 2017/7/23.
 */
public class Sum_Solution {
    public int Sum_Solution1(int n) {
        int a = (int)Math.pow((double) n,(double) 2);
        int result = a + n;
        result = result >> 1;
        return result;
    }

}

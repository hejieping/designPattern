package com.algorithm;

import org.apache.commons.lang.StringUtils;

/**
 * Created by jieping.hjp on 2017/7/17.
 */
public class LeftRotateString {
    public String LeftRotateString1(String str,int n) {
        if(n<=0||str.equals("")){
            return str;
        }
        int finalN = n%str.length();
        StringBuilder stringBuilder = new StringBuilder(str.substring(finalN,str.length()));
        stringBuilder.append(str.substring(0,finalN));
        return stringBuilder.toString();
    }
    public static void main(String[] args){
        String str1 = "";
        String str2 = null;
        String str3 = "  ";
        String str4 = "test";
        System.out.println(StringUtils.isNotBlank(str1));
        System.out.println(StringUtils.isNotBlank(str2));
        System.out.println(StringUtils.isNotBlank(str3));
        System.out.println(StringUtils.isNotBlank(str4));

    }
}

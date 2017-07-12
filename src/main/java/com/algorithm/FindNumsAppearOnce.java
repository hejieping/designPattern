package com.algorithm;

import java.util.Arrays;

/**
 * Created by jieping.hjp on 2017/7/12.
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字
 */
public class FindNumsAppearOnce {
    public void FindNumsAppearOnce1(int [] array,int num1[] , int num2[]) {
        //排序
        Arrays.sort(array);
        int index = 0;
        int result[]  = new int[2];
        int positon = 0;
        //一次比较两个相邻数字
        while(array.length-1>=index+1&&positon<=1){
            if(array[index]!=array[index+1]){
                //判断两个数字是否唯一
                if(array.length-1>=index+2&&array[index+2]==array[index+1]){
                    //此次判断只存在一个唯一数字
                    result[positon] = array[index];
                    positon++;
                    index++;
                    continue;
                }
                //此次判断两个数字都是唯一
                else {
                    result[positon++] = array[index];
                    result[positon++] = array[index+1];
                    break;
                }
            }
            index+=2;
        }
        //唯一数字在末尾的情况
        if(positon==1){
            result[positon] = array[array.length-1];
        }
        num1[0] = result[0];
        num2[0] = result[1];
    }
    public static void main(String[] args){
        int[] array1 = new int[]{1,1,2,2,3,4,4,5,6,6};
        int[] array2 = new int[]{1,1,2,2,3,3,4,5,6,6};
        int[] array3 = new int[]{2,4,3,6,3,2,5,5};
        int[] num1 = new int[1];
        int[] num2 = new int[2];
        new FindNumsAppearOnce().FindNumsAppearOnce1(array3,num1,num2);
        System.out.print(num1[0]+"  "+num2[0]);

    }
}

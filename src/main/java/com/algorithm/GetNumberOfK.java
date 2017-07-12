package com.algorithm;

/**
 * Created by jieping.hjp on 2017/7/12.
 * 统计一个数字在排序数组中出现的次数
 */
public class GetNumberOfK {
    public int GetNumberOfK1(int [] array , int k) {
        if(array.length==0){
            return 0;
        }
        //是否找到
        boolean find = false;
        int head = 0;
        int tail = array.length-1;
        int temp = 0;

        //二分法查找是否存在k
        while(head<tail){
            temp = (head+tail)>>1;
            if(array[temp]>k){
                tail = temp-1;
            }
            else if(array[temp]<k){
                head = temp+1;
            }
            else {
                find = true;
                break;
            }

        }
        if(head==tail&&array[head]!=k){
            return 0;
        }
        //如果存在，从查找的位置向左右扩散，统计k的数量
        int conut = 1;
        int left = find==true?temp-1:head-1;
        int right = find==true?temp+1:head+1;
        while(left>=0&&array[left]==k)
        {
            left--;
            conut++;
        }
        while(right<array.length&&array[right]==k){
            right++;
            conut++;
        }
        return conut;
    }
    public static void main(String[] args){
        int[] array = new int[]{1,2,3,3,3,3,4,4,4,5,5,6,6,7,8};
        System.out.print(new GetNumberOfK().GetNumberOfK1(array,8));
    }
}

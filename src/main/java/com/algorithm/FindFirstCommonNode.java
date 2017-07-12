package com.algorithm;

/**
 * Created by jieping.hjp on 2017/7/12.
 * 输入两个链表，找出它们的第一个公共结点
 */
public class FindFirstCommonNode {
    public ListNode FindFirstCommonNode1(ListNode pHead1, ListNode pHead2) {
        if(pHead1==null||pHead2==null){
            return null;
        }
        //先求出两链表长度
        int length1 = 0;
        int length2 = 0;
        ListNode tempNode1 = pHead1;
        ListNode tempNode2 = pHead2;
        while(tempNode1!=null){
            length1++;
            tempNode1 = tempNode1.next;
        }
        while(tempNode2!=null){
            length2++;
            tempNode2 = tempNode2.next;
        }
        //将长的链表链表头移动至两链表长度相等的地方
        if(length1>length2){
            while(length1>length2){
                pHead1 = pHead1.next;
                length1--;
            }
        }
        else
        {
            while(length2>length1){
                pHead2 = pHead2.next;
                length2--;
            }
        }
        //从长度相等的地方开始比较，不相等同时前进一步
        while(pHead1!=pHead2){
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return pHead1;
    }
}

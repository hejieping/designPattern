package com.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jieping.hjp on 2017/8/16.
 */
public class EntryNodeOfLoop {
    public ListNode EntryNodeOfLoop1(ListNode pHead) {

        Map<Integer,Integer> map = new HashMap<>();
        while (pHead != null){
            if(map.get(pHead.hashCode()) == null){
                map.put(pHead.hashCode(),1);
            }
            else {
                return pHead;
            }
            pHead = pHead.next;
        }
        return null;
    }
}

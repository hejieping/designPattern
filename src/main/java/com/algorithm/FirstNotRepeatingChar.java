package com.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by jieping.hjp on 2017/7/11.
 * 在一个字符串(1<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置
 */
public class FirstNotRepeatingChar {
    public int FirstNotRepeatingChar1(String str) {
        if(str.length()<=1){
            return str.length()==0?-1:0;
        }
        char[] cstr = str.toCharArray();
        List<Position> list = new ArrayList<>();
        HashMap<Character,Position> hashMap = new HashMap<>();
        int index = 0;
        char content = cstr[0];

        for(int i = 0;i<cstr.length;i++){
            Position target = hashMap.get(cstr[i]);
            if(null==target){
                Position position = new Position(cstr[i],i);
                hashMap.put(cstr[i],position);
                list.add(position);
            }
            else {
                list.remove(target);
            }
        }
        return list.get(0).index;


    }
}
class Position{
    public Integer index;
    public Character content;
    public Position(Character content,Integer index){
        this.content = content;
        this.index = index;
    }
}

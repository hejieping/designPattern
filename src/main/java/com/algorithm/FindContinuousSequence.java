package com.algorithm;

import java.util.ArrayList;


/**
 * Created by jieping.hjp on 2017/7/13.
 */



import java.util.Collections;
import java.util.Comparator;

/**
 * Created by jieping on 2017-07-16.
 * 小明很喜欢数学,有一天他在做数学作业时,
 * 要求计算出9~16的和,他马上就写出了正确答案是100。
 * 但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 * 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。现在把问题交给你,
 * 你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 *
 * 思路：设count为满足条件的连续序列的个数
 *  count 为奇数时，sum/count = 连续序列最中间数字，
 *  count 为偶数时，sum*2/count = 连续序列最小值与最大值之和
 *  count最大值：1+2+...count < sum ,又因为count为偶数时 start = sum/count -count/2 必须大于0 ，
 *  所以 sum/count -count/2 > 0,即count<Math.sqrt(2*sum)
 */
public class FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence1(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(sum<3){
            return result;
        }
        int count = 2;
        while(count<Math.sqrt(2*sum)){
            if(count%2==0){
                if(sum % count != 0 && sum % (count/2) == 0){
                    int start = sum/count -count/2+1;
                    result.add(getContinueNumber(start,count));
                }
            }
            else {
                if(sum%count==0){
                    int start = sum/count -count/2;
                    result.add(getContinueNumber(start,count));
                }
            }
            count++;
        }
        Collections.sort(result,new ArraylistComp());
       // result.sort(new ArraylistComp());
        return result;
    }
    public ArrayList<Integer> getContinueNumber(int start,int count){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < count; i++,start++){
            result.add(start);
        }
        return result;
    }
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> results = new FindContinuousSequence().FindContinuousSequence1(3);
        for(ArrayList<Integer> result :results){
            System.out.println(result.toString());
        }

    }
}
class ArraylistComp implements  Comparator<ArrayList<Integer>>{
    @Override
    public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
        return o1.get(0).compareTo(o2.get(0));
    }

}

package com.algorithm;

/**
 * Created by jieping.hjp on 2017/7/23.
 * LL今天心情特别好,因为他去买了一副扑克牌,
 * 发现里面居然有2个大王,2个小王(一副牌原本是54张^_^)...
 * 他随机从中抽出了5张牌,想测测自己的手气,看看能不能抽到顺子,
 * 如果抽到的话,他决定去买体育彩票,嘿嘿！！“红心A,黑桃3,小王,大王,方片5”,
 * “Oh My God!”不是顺子.....LL不高兴了,他想了想,决定大\小 王可以看成任何数字,
 * 并且A看作1,J为11,Q为12,K为13。上面的5张牌就可以变成“1,2,3,4,5”(大小王分别看作2和4),
 * “So Lucky!”。LL决定去买体育彩票啦。 现在,要求你使用这幅牌模拟上面的过程,
 * 然后告诉我们LL的运气如何。为了方便起见,你可以认为大小王是0
 *
 * 先求出最小值，申请一个数组作为连续值的标记，然后遍历数组
 * 1， 值不为 0 ，当值在最小值到最小值+4时，在连续值数组中标记（若已标记则不再进行标记）
 * 2， 值为0 ，记录 0
 * 比较连续值数组中未标记的数量和0的数量，当未标记数<0数量，则可以用0替换成未标记数量
 */
public class isContinuous {
    public boolean isContinuous1(int [] numbers) {
        if(numbers.length<5){
            return false;
        }
        int minNumber = min(numbers);
        int[] continus = new int[5];
        int count = 5;
        int zeroCount = 0;
        for(int i = 0; i < 5; i++){
            continus[i] = 0;
        }

        for(int i = 0; i < 5; i++){
            if(numbers[i] == 0){
                zeroCount++;
                continue;
            }
            int position = numbers[i] - minNumber;
            if(position >= 0 && position < 5){
                if(continus[position] == 0){
                    continus[position] = 1;
                    count--;
                }
            }
        }
        boolean result = count <= zeroCount? true : false;
        return result;

    }
    public int min(int[] numbers){
        int min = 14;
        for(int number : numbers){
            if(min>number && number!=0){
                min = number;
            }
        }
        return min;
    }
    public static void main(String[] args){
        int [] a = new int[]{0,3,2,6,4};
        new isContinuous().isContinuous1(a);
    }
}

package com.algorithm;

/*
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示
 */

/*
 * 当n & n-1 时 结果是 二进制n去除最右边的1 的结果，计算n&（n-1）的次数直到n=0
 */
public class NumberOf1
{
	public int NumberOf12(int n)
	{
		int count = 0;
		while (n != 0)
		{
			n = n & (n - 1);
			count++;
		}
		return count;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		NumberOf1 n = new NumberOf1();
		System.out.println(n.NumberOf12(4));

	}

}

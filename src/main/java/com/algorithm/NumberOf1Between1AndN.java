package com.algorithm;

/*
 * 
 * 求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？
 * 为此他特别数了一下1~13中包含1的数字有1、10、11、12、13因此共出现6次
 * ,但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化,
 * 可以很快的求出任意非负整数区间中1出现的次数
 *
 *
 * 规律：
 *       0~9  0~99 0~999 0~9999  0~ k9
 * 1个数： 1    20    300   4000   k*10^k-1
 * 所以
 * NK0~NK9 ： k*10^k-1(N!=1)
 *         ： k*10^k-1+ 10^k
 * 例如：20000~29999的1数量 :4000
 *       10000~29999的1数量 :4000 + 10000
 *
 * 例子：求0到21345中1数量：
 * 21345 = 0~9999 + 10000~19999 + 20000~20999 +21000~21099 +....
 *
 * 算法复杂度O（logn）
 *  
 */
public class NumberOf1Between1AndN
{
	static int number;

	public static int NumberOf1Between1AndN1(int n)
	{
		number = n;
		int result = 0;
		char[] numCtr = String.valueOf(n).toCharArray();
		int k = numCtr.length;
		for (int i = 0; i < numCtr.length; i++)
		{
			result += function2((int) (numCtr[i] - 48), k - 1);
			k--;
		}
		return result;
	}

	public static int getSum1(int i, int k)
	{
		int sum = k;
		for (int j = 0; j < k - 1; j++)
		{
			sum *= 10;
		}
		if (i == 1)
		{
			int temp = 1;
			for (int j = 0; j < k; j++)
			{
				temp *= 10;
			}
			sum += temp;
		}
		return sum;
	}

	public static int function2(int n, int k)
	{

		int result = 0;
		for (int i = 0; i < n; i++)
		{
			result += getSum1(i, k);
		}
		if (n == 1)
		{
			result += 1;
			int temp = 1;
			for (int i = 0; i < k; i++)
			{
				temp *= 10;
			}
			result += k != 0 ? number % temp : 0;
		}
		return result;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println(NumberOf1Between1AndN1(12));
		// int a = (int) '0';
		// System.out.println(a);

	}

}

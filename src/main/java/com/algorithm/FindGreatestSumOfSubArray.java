package com.algorithm;

/*
 * 求数组中子数组最大和，时间复杂度为O（n）
 *
 * 设cursum为目前最大值，maxsum为所求结果，
 * 遍历数组
 * 代码太简单，还是自己看吧
 *
 * 动态规划：
 * f(i) =  data[i]           (i =0 or f(i-1)<=0)
 *         f(i-1) + data[i]  (f(i-1) >0)
 */
public class FindGreatestSumOfSubArray
{
	public int FindGreatestSumOfSubArray1(int[] array)
	{
		if (array == null || array.length == 0)
		{
			return 0;
		}
		int curSum = 0;
		int maxSUm = array[0];
		for (int i = 0; i < array.length; i++)
		{
			if (curSum <= 0)
			{
				curSum = array[i];
			} else
			{
				curSum += array[i];
			}
			if (curSum > maxSUm)
			{
				maxSUm = curSum;
			}
		}
		return maxSUm;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}

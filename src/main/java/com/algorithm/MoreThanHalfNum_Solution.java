package com.algorithm;

/*
 * 数组中有一个数字出现的次数超过数组长度的一半，
 * 请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0
 *
 * 设置result 和count  初始设置为array[0] 0
 * 遍历array 如果result == array[i] 那么count++ 否则count--
 * count == 0 时，result = array[i]
 * 遍历完后如果存在result.length > array.length/2，那么最后一个的肯定是答案,
 * 遍历结束需再验证一边result出现次数是不是大于数组大小的一半
 * 关键：result.count > (其余数据).count
 */
public class MoreThanHalfNum_Solution
{

	public int MoreThanHalfNum_Solution1(int[] array)
	{
		if (array == null || array.length == 0)
		{
			return 0;
		}
		int result = array[0];
		int count = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (result == array[i])
			{
				count++;
			} else
			{
				count--;
				if (count == 0)
				{
					result = array[i];
					count = 1;
				}
			}
		}
		return chechMoreHalf(array, result) ? result : 0;
	}

	public boolean chechMoreHalf(int[] array, int result)
	{
		int count = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (result == array[i])
			{
				count++;
			}
		}
		return count * 2 > array.length ? true : false;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}

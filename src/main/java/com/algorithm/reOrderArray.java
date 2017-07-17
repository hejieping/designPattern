package com.algorithm;

import java.util.LinkedList;

/*
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组
 * 的后半部分。
 * 考虑快速排序的算法，申请两个指针head,tail指向数组头和尾,
 * head++直到array[head] != 奇数
 * tail--直到array[tail] != 偶数
 * 然后array[head] array[tail] 值交换，直到head = tail
 * 期间需要考虑head tail相等情况
 */
public class reOrderArray
{
	public void reOrderArray1(int[] array)
	{
		if (array.length <= 1 || array == null)
		{
			return;
		}
		int head = 0;
		int tail = array.length - 1;
		while (head != tail)
		{
			while ((array[head] & 0x1) == 1 && (head != tail))
			{
				head++;
			}
			while ((array[tail] & 0x1) == 0 && (head != tail))
			{
				tail--;
			}
			if (head != tail)
			{
				int temp = array[head];
				array[head] = array[tail];
				array[tail] = temp;
			}
		}
	}

	// 保证奇数和奇数，偶数和偶数之间的相对位置不变。
	// 申请两个queue，一个保存奇数，一个保存偶数，遍历一遍数组，然后依次在array里填充queneOdd和queueEven的值
	public void reOrderArray2(int[] array)
	{
		if (array.length <= 1 || array == null)
		{
			return;
		}
		LinkedList<Integer> queneOdd = new LinkedList<Integer>();
		LinkedList<Integer> queneEven = new LinkedList<Integer>();
		for (int i = 0; i < array.length; i++)
		{
			if ((array[i] & 0x1) == 1)
			{
				queneOdd.add(array[i]);
			} else
			{
				queneEven.add(array[i]);
			}
		}
		int oddSize = queneOdd.size();
		int evenSize = queneEven.size();
		for (int i = 0; i < oddSize; i++)
		{
			array[i] = queneOdd.remove();
		}
		for (int i = oddSize; i < oddSize + evenSize; i++)
		{
			array[i] = queneEven.remove();
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] a =
				{ 1, 2, 3, 4, 5, 6, 7 };
		reOrderArray reOrder = new reOrderArray();
		reOrder.reOrderArray2(a);
		System.out.println(a.toString());

	}

}

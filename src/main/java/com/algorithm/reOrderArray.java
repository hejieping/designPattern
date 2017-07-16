package com.algorithm;

import java.util.LinkedList;

/*
 * ����һ���������飬ʵ��һ�����������������������ֵ�˳��
 * ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ��λ������
 * �ĺ�벿�֡�
 * ���ǿ���������㷨����������ָ��head,tailָ������ͷ��β,
 * head++ֱ��array[head] != ����
 * tail--ֱ��array[tail] != ż��
 * Ȼ��array[head] array[tail] ֵ������ֱ��head = tail
 * �ڼ���Ҫ����head tail������
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

	// ��֤������������ż����ż��֮������λ�ò��䡣
	// ��������queue��һ������������һ������ż��������һ�����飬Ȼ��������array�����queneOdd��queueEven��ֵ
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

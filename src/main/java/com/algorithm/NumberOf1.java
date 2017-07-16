package com.algorithm;

/*
 * ����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ
 */

/*
 * ��n & n-1 ʱ ����� ������nȥ�����ұߵ�1 �Ľ��������n&��n-1���Ĵ���ֱ��n=0
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

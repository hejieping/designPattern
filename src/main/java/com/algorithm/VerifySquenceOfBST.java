package com.algorithm;

/*
 * ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ��������������Yes,�������No���������������������������ֶ�������ͬ
 * �ݹ�˼· 
 * ��start endΪҪ����������β����ȻendΪ���ڵ�
 * ��start��end-1�����ҵ�һ������end�ĵ�pivot
 * start��pivot-1���Ϊ��������pivot��end-1Ϊ������
 * �ж��������ڵ��Ƿ�ȫ�����ڸ��ڵ㣨�������ڲ���pivot���Ѿ��жϹ�����
 * �ж���ȷ����ͬ�������ݹ����������������������򷵻ش���
 * �ڼ���Ҫ���Խ�绹��end<=start�����
 */
public class VerifySquenceOfBST
{
	public boolean VerifySquenceOfBST1(int[] sequence)
	{
		if (sequence.length == 0)
		{
			return false;
		}
		return Verify(sequence, 0, sequence.length - 1);
	}

	public boolean Verify(int[] sequence, int start, int end)
	{
		if (start >= end)
		{
			return true;
		}
		int pivot = start;
		while (pivot < end)
		{
			if (sequence[pivot] < sequence[end])
			{
				pivot++;
			} else
			{
				break;
			}
		}
		for (int i = pivot; i < end; i++)
		{
			if (sequence[i] < sequence[end])
			{
				return false;
			}
		}
		return Verify(sequence, start, pivot - 1)
				&& Verify(sequence, pivot, end - 1);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] a =
		{ 7, 6, 4, 5 };
		System.out.println(new VerifySquenceOfBST().VerifySquenceOfBST1(a));

	}

}

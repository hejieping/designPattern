package com.algorithm;
/*
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء�
��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 */

/*
 * ���ö��ֲ��ң���array[mid] > array[end] ��Сֵ��mid�ұߣ����������
 * ��array[mid] = array[end] =array[start] ˳�����
 * �迼�������СΪ1 ������ǵ����ǵݼ���� ��{1��1��1��1��1��1��1��0��1} or {1��0��1��1��1��1��1��1��1}
 */

public class getMinInArray
{
	public int minNumberInRotateArray(int[] array)
	{
		if (array.length == 0)
		{
			return 0;
		}
		int mid = 0;
		int start = 0;
		int end = array.length - 1;
		while (start < end)
		{
			mid = (start + end) / 2;
			if (array[mid] == array[end] && array[end] == array[start])
			{
				return getMin(array);
			}
			if (array[mid] > array[end])
			{
				start = mid + 1;
			} else
			{
				end = mid;
			}
		}
		return array[start];

	}

	public int getMin(int[] array)
	{
		int min = array[0];
		for (int i = 0; i < array.length - 1; i++)
		{
			if (min > array[i])
			{
				min = array[i];
			}
		}
		return min;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		getMinInArray program = new getMinInArray();
		int[] a =
		{ 1, 1, 0, 1, 1, 1, 1 };
		System.out.println(program.minNumberInRotateArray(a));

	}

}

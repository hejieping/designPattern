package com.algorithm;
/*
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */

/*
 * 利用二分查找，当array[mid] > array[end] 最小值在mid右边，否则在左边
 * 当array[mid] = array[end] =array[start] 顺序查找
 * 需考虑数组大小为1 ，数组非递增非递减情况 ：{1，1，1，1，1，1，1，0，1} or {1，0，1，1，1，1，1，1，1}
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

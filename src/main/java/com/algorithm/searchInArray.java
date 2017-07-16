package com.algorithm;

/*
 * ��һ����λ�����У������ң����ϵ��µ�����дһ�����Һ������жϸ������Ƿ����һ������
 */
public class searchInArray
{
	public boolean Find(int target, int[][] array)
	{
		if (array == null)
		{
			return false;
		}
		return find(target, array, 0, array[0].length - 1, true);

	}

	// ���Ӷ�O(array.row + array.column)
	public boolean find(int target, int[][] array)
	{
		if (array == null)
		{
			return false;
		}
		int row = 0;
		int column = array[0].length - 1;
		while (row <= array.length - 1 && column >= 0)
		{
			if (array[row][column] > target)
			{
				column--;
			} else if (array[row][column] < target)
			{
				row++;
			} else
			{
				return true;
			}
		}
		return false;
	}

	// ���Ӷ�logn ����ȷ������Ϊ��������̫С
	public boolean find(int target, int[][] array, int row, int column,
			boolean direction)
	{
		int head;
		int tail;
		while (true)
		{
			if (row == array.length - 1 && column == 0
					&& array[row][column] != target)
			{
				return false;
			}
			if (direction)
			{
				head = 0;
				tail = column;
				while (head <= tail)
				{
					if (array[row][(head + tail) / 2] > target)
					{
						tail = (head + tail) / 2 - 1;
					} else if (array[row][(head + tail) / 2] < target)
					{
						head = (head + tail) / 2 + 1;
					} else
					{
						return true;
					}
				}
				if (head == 0)
				{
					return false;
				}
				column = head - 1;
				direction = !direction;
			} else
			{
				head = row;
				tail = array.length - 1;
				while (head <= tail)
				{
					if (array[(head + tail) / 2][column] > target)
					{
						tail = (head + tail) / 2 - 1;
					} else if (array[(head + tail) / 2][column] < target)
					{
						head = (head + tail) / 2 + 1;
					} else
					{
						return true;
					}
				}
				if (head == array.length)
				{
					return false;
				}
				row = head;
				direction = !direction;
			}
		}
	}

	public static void main(String[] args)
	{
		searchInArray s = new searchInArray();
		int[][] a =
		{
				{ 1, 2, 8, 10 },
				{ 2, 7, 9, 19 } };
		System.out.println(s.find(20, a));
	}
}

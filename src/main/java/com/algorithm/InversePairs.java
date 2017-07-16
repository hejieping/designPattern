package com.algorithm;

import java.util.LinkedList;

public class InversePairs
{
	public static int InversePairs(int[] data)
	{
		if (data == null || data.length <= 1)
		{
			return 0;
		}
		LinkedList<Integer[]> queue = new LinkedList<Integer[]>();
		int count = 0;
		for (int i = 0; i < data.length; i++)
		{
			Integer[] temp = new Integer[1];
			temp[0] = data[i];
			queue.add(temp);
		}
		while (queue.size() != 1)
		{

			Integer[] temp1 = queue.remove();
			Integer[] temp2 = queue.remove();
			Integer[] sortArray = new Integer[temp1.length + temp2.length];
			int p1 = temp1.length - 1;
			int p2 = temp2.length - 1;
			int p3 = p1 + p2 + 1;
			while (p1 >= 0 && p2 >= 0)
			{
				if (temp1[p1] > temp2[p2])
				{
					count += p2 + 1;
					sortArray[p3] = temp1[p1];
					p3--;
					p1--;
				} else
				{
					sortArray[p3] = temp2[p2];
					p3--;
					p2--;
				}
			}
			if (p1 > p2)
			{
				while (p1 >= 0)
				{
					sortArray[p3] = temp1[p1];
					p3--;
					p1--;
				}
			} else
			{
				while (p2 >= 0)
				{
					sortArray[p3] = temp2[p2];
					p3--;
					p2--;
				}
			}
			queue.add(sortArray);

		}
		return count;
	}

	public static void main(String[] args)
	{
		int[] data =
		{ 7, 5, 6, 4 };
		System.out.println(InversePairs(data));

	}

}

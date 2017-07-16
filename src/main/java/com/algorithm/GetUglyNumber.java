package com.algorithm;

public class GetUglyNumber
{
	public static int GetUglyNumber_Solution(int index)
	{

		if (index == 0)
		{
			return 0;
		}
		int[] uglyNumbers = new int[index];
		uglyNumbers[0] = 1;
		int ugly2 = 0;
		int ugly3 = 0;
		int ugly5 = 0;
		int nextUgly = 1;
		while (nextUgly < index)
		{
			uglyNumbers[nextUgly] = min(uglyNumbers[ugly2] * 2,
					uglyNumbers[ugly3] * 3, uglyNumbers[ugly5] * 5);
			while (uglyNumbers[ugly2] * 2 <= uglyNumbers[nextUgly])
			{
				ugly2++;
			}
			while (uglyNumbers[ugly3] * 3 <= uglyNumbers[nextUgly])
			{
				ugly3++;
			}
			while (uglyNumbers[ugly5] * 5 <= uglyNumbers[nextUgly])
			{
				ugly5++;
			}
			nextUgly++;
		}
		return uglyNumbers[nextUgly - 1];
	}

	public static int min(int a, int b, int c)
	{
		int result = a;
		result = b > result ? result : b;
		result = c > result ? result : c;
		return result;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println(GetUglyNumber_Solution(0));

	}

}

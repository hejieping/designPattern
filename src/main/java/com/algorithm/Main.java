package com.algorithm;

public class Main
{

	/*
	 * 从一个数组寻找m1,m2,m3数组坐标，将数组切分四等分，每份数组总整数相等。
	 * 0<m1  m1+1<m2  m2+1<m3
	 * N为数组长度
	 * [0]+..[m1-1] = [m1+1]+..[m2-1] = [m2+1]+..[m3-1] = [m3+1] +.. [N-1]
	 * 要求计算复杂度为O（n），空间复杂度为O(n)
	 */

	/*
	 * 解题思路：设被m1,m2,m3切开的四个块为sum1,sum2,sum3,sum4,m1为数组头，m3为数组尾,m2为m1+2
	 * 1，将m1,m3 往数组里面前进,即m1++,m3--，直到sum1 = sum4
	 * 2，将m2往数组末尾推进，即m2++,直到 sum2>=sum1
	 * 3, 如果sum2=sum1=sum3=sum4 返回正确，否则重复1，2，3步骤
	 * m1 , m2 ,m3推进期间注意检查是否 0<m1 m1+1<m2 m2+1<m3 以及sum1,sum2,sum3,sum4的变化
	 */
	static boolean resolve(int[] A)
	{
		if (A.length < 7)
		{
			return false;
		}
		int m1 = 0;
		int m2 = m1 + 2;
		int m3 = A.length - 1;
		long sum1 = 0;
		long sum2 = A[m1 + 1];
		long sum3 = 0;
		long sum4 = 0;
		for (int i = m2 + 1; i < m3; i++)
		{
			sum3 += A[i];
		}
		while (true)
		{
			m1++;
			sum1 += A[m1 - 1];
			sum2 -= A[m1];
			if (m2 - m1 < 2)
			{
				m2++;
				sum2 += A[m2 - 1];
				sum3 -= A[m2];
			}
			while (sum1 != sum4 && (m3 - m1 > 4))
			{
				if (sum1 > sum4)
				{
					m3--;
					if (m3 - m2 <= 2)
					{
						m2--;
						sum3 += A[m2 + 1];
						sum2 -= A[m2];
					}
					sum4 += A[m3 + 1];
					sum3 -= A[m3];
				} else
				{
					m1++;
					if (m2 - m1 < 2)
					{
						m2++;
						sum2 += A[m2 - 1];
						sum3 -= A[m2];
					}
					sum1 += A[m1 - 1];
					sum2 -= A[m1];
				}
			}
			if ((m3 - m1 < 4))
			{
				return false;
			}
			while (sum2 < sum1 && (m3 - m2 >= 2))
			{
				m2++;
				sum2 += A[m2 - 1];
				sum3 -= A[m2];
			}
			if (m3 - m2 < 2)
			{
				return false;
			}
			if (sum3 == sum2 && sum3 == sum1)
			{
				return true;
			}

		}

	}

	public static void main(String[] args)
	{
		int[] array =
				{ 2, 5, 4, 1, 5, 6, 8, 4, 7, 1, 2, 2, 7 };
		System.out.println(resolve(array));
	}
}
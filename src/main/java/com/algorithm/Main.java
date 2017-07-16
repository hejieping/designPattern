package com.algorithm;

public class Main
{

	/*
	 * ��һ������Ѱ��m1,m2,m3�������꣬�������з��ĵȷ֣�ÿ��������������ȡ�
	 * 0<m1  m1+1<m2  m2+1<m3
	 * NΪ���鳤��
	 * [0]+..[m1-1] = [m1+1]+..[m2-1] = [m2+1]+..[m3-1] = [m3+1] +.. [N-1]
	 * Ҫ����㸴�Ӷ�ΪO��n�����ռ临�Ӷ�ΪO(n)
	 */

	/*
	 * ����˼·���豻m1,m2,m3�п����ĸ���Ϊsum1,sum2,sum3,sum4,m1Ϊ����ͷ��m3Ϊ����β,m2Ϊm1+2
	 * 1����m1,m3 ����������ǰ��,��m1++,m3--��ֱ��sum1 = sum4
	 * 2����m2������ĩβ�ƽ�����m2++,ֱ�� sum2>=sum1
	 * 3, ���sum2=sum1=sum3=sum4 ������ȷ�������ظ�1��2��3����
	 * m1 , m2 ,m3�ƽ��ڼ�ע�����Ƿ� 0<m1 m1+1<m2 m2+1<m3 �Լ�sum1,sum2,sum3,sum4�ı仯
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
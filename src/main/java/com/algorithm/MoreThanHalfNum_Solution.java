package com.algorithm;

/*
 * ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬
 * ���ҳ�������֡���������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}��
 * ��������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2����������������0
 * 
 * ����result ��count  ��ʼ����Ϊarray[0] 0
 * ����array ���result == array[i] ��ôcount++ ����count--
 * count == 0 ʱ��result = array[i]
 * ��������������result.length > array.length/2����ô���һ���Ŀ϶��Ǵ�,
 * ��������������֤һ��result���ִ����ǲ��Ǵ��������С��һ��
 * �ؼ���result.count > (��������).count
 */
public class MoreThanHalfNum_Solution
{

	public int MoreThanHalfNum_Solution1(int[] array)
	{
		if (array == null || array.length == 0)
		{
			return 0;
		}
		int result = array[0];
		int count = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (result == array[i])
			{
				count++;
			} else
			{
				count--;
				if (count == 0)
				{
					result = array[i];
					count = 1;
				}
			}
		}
		return chechMoreHalf(array, result) ? result : 0;
	}

	public boolean chechMoreHalf(int[] array, int result)
	{
		int count = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (result == array[i])
			{
				count++;
			}
		}
		return count * 2 > array.length ? true : false;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}

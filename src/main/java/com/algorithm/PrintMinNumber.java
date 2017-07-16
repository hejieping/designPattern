package com.algorithm;

/*
 * ����һ�����������飬����������������ƴ�������ų�һ��������ӡ��ƴ�ӳ���������������С��һ����
 * ������������{3��32��321}�����ӡ���������������ųɵ���С����Ϊ321323
 * 
 * дһ�������comparator��Ȼ������������������������鼴Ϊ������
 * �Ƚ���������ת����string
 * compare(String a, String b)
 * {
 *    return  1  ab>ba;
 *            -1 ab<ba;
 *            0  ab=ba;
 * }
 */
import java.util.Arrays;
import java.util.Comparator;

class comp implements Comparator<String>
{
	public int compare(String o1, String o2)
	{
		String mn = o1 + o2;
		String nm = o2 + o1;
		char[] mnch = mn.toCharArray();
		char[] nmch = nm.toCharArray();
		for (int i = 0; i < mn.length(); i++)
		{
			if (mnch[i] != nmch[i])
			{
				return mnch[i] > nmch[i] ? 1 : -1;
			}
		}
		return 0;

	}

}

public class PrintMinNumber
{

	public String solution(int[] arrays)
	{
		if (arrays == null || arrays.length == 0)
		{
			return "";
		}
		String[] strings = new String[arrays.length];
		for (int i = 0; i < arrays.length; i++)
		{
			strings[i] = String.valueOf(arrays[i]);
		}
		Arrays.sort(strings, new comp());
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < strings.length; i++)
		{
			buffer.append(strings[i]);
		}
		return buffer.toString();
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] arrays =
		{ 3334, 3, 3333332 };
		int a = new comp().compare("3334", "3");
		System.out.println(new PrintMinNumber().solution(arrays));

	}
}
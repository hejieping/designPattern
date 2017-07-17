package com.algorithm;
import java.util.Arrays;
import java.util.Comparator;

/*
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323
 *
 * 写一个特殊的comparator，然后对数组进行排序，依次输出数组即为所求结果
 * 先将两个数组转换成string
 * compare(String a, String b)
 * {
 *    return  1  ab>ba;
 *            -1 ab<ba;
 *            0  ab=ba;
 * }
 */

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
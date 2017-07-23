package com.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * 题目描述 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。 输入描述:
 * 输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母
 *
 * 递归 f(char[] ch ,i) 将ch[i]依次换成i后面的字符 然后执行 f(char[] ch,i+1)
 * 直到i到达数组尾，然后添加到hashSet里面，再转换为list
 */
public class Permutation
{
	private ArrayList<String> list = new ArrayList<String>();
	private HashSet<String> set = new HashSet<String>();

	public ArrayList<String> Permutation1(String str)
	{
		if (str.length() == 0 || str == null)
		{
			return list;
		}

		PermuTationHelper(str.toCharArray(), 0);
		Object[] result = set.toArray();
		for (Object s : result)
		{
			list.add((String) s);
		}
		Collections.sort(list);
		return list;

	}

	public static void swap(char[] cs, int i, int j)
	{
		char temp = cs[i];
		cs[i] = cs[j];
		cs[j] = temp;
	}

	public void PermuTationHelper(char[] cs, int i)
	{
		if (i == cs.length - 1)
		{
			set.add(String.valueOf(cs));
		} else
		{
			for (int j = i; j < cs.length; j++)
			{
				swap(cs, i, j);
				PermuTationHelper(cs, i + 1);
				swap(cs, i, j);
			}
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println(new Permutation().Permutation1("abc"));
		int a = 0;
		int c = a;

	}

}

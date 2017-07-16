package com.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * ��Ŀ���� ����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С�
 * ���������ַ���abc,���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba�� ��������:
 * ����һ���ַ���,���Ȳ�����9(�������ַ��ظ�),�ַ�ֻ������Сд��ĸ
 * 
 * �ݹ� f(char[] ch ,i) ��ch[i]���λ���i������ַ� Ȼ��ִ�� f(char[] ch,i+1)
 * ֱ��i��������β��Ȼ����ӵ�hashSet���棬��ת��Ϊlist
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

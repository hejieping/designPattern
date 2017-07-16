package com.algorithm;

import java.util.Scanner;

public class Main1
{
	public static String lower(String string)
	{
		char[] ch = string.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			if (ch[i] >= 'A' && ch[i] <= 'z')
			{
				ch[i] = Character.toLowerCase(ch[i]);
			} else
			{
				ch[i] = '0';
			}
		}
		String result = "";
		for (int i = 0; i < ch.length; i++)
		{
			if (ch[i] >= 'a' && ch[i] <= 'z')
			{
				result += ch[i];
			}
		}
		return result;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (in.hasNext())
		{
			String string = in.nextLine();
			System.out.println(lower(string));
		}

	}

}

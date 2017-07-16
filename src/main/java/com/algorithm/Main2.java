package com.algorithm;

import java.util.Scanner;

public class Main2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] sumCard = new int[5];
		while (in.hasNext())
		{
			String string = in.nextLine();
			char[] ch = string.toCharArray();
			for (int i = 0; i < 5; i++)
			{
				if (ch[i] == '1')
				{
					sumCard[i]++;
				}
			}
		}
		int min = sumCard[0];
		for (int i = 1; i < 5; i++)
		{
			if (min > sumCard[i])
			{
				min = sumCard[i];
			}
		}
		System.out.println(min);
	}

}

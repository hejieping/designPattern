package com.algorithm;

import java.util.HashMap;

public class findFisrtChar
{
	public static char findFisrtChar(char[] data)
	{
		if (data == null || data.length <= 1)
		{
			return 'a';
		}
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		for (int i = 0; i < data.length; i++)
		{
			if (hashMap.containsKey(data[i]))
			{
				hashMap.put(data[i], hashMap.get(data[i]) + 1);
			} else
			{
				hashMap.put(data[i], 1);
			}
		}
		for (int i = 0; i < data.length; i++)
		{
			if (hashMap.get(data[i]) == 1)
			{
				return data[i];
			}
		}
		return 'a';
	}

	public static void main(String[] args)
	{
		String test = "abaccdeff";
		System.out.println(findFisrtChar(test.toCharArray()));

	}

}

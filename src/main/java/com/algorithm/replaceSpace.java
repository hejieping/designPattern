package com.algorithm;

/*
 * �� str����Ŀո��滻��%20
 * ���� "we are happy" �ĳ� "we%20are%20happy"
 */
public class replaceSpace
{
	public static String replaceSpaces(StringBuffer str)
	{
		if (str == null)
		{
			return null;
		}
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < str.length(); i++)
		{

			if (str.charAt(i) == ' ')
			{
				result.append("%20");
			} else
			{
				result.append(str.charAt(i));
			}
		}
		return result.toString();
	}

	public static void main(String[] args)
	{
		System.out.println(replaceSpaces(new StringBuffer("we are happy")));
	}
}

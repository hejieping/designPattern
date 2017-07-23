package com.algorithm;

/*
 * 将 str里面的空格替换成%20
 * 例如 "we are happy" 改成 "we%20are%20happy"
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

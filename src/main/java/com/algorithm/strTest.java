package com.algorithm;
/*
 * java会建立一个常量池，当申请常量时，先查看常量池里面有没有，有就直接引用常量池里面，没有就申请一个，放在常量池
 * 使用new的话
 */
public class strTest
{
	public static void main(String[] args)
	{
		// StringBuffer a = new StringBuffer("hello");
		// StringBuffer b = new StringBuffer("hello");
		String a = new String("hello");
		String b = new String("hello");
		String aString = "hello";
		String bString = "hello";
		if (a == b)
		{
			System.out.println("a == b");
		}
		if (aString == bString)
		{
			System.out.println("astring == bstring");
		}
	}
}

package com.algorithm;

import java.util.Stack;

public class Main3
{
	public static int postfixCalc(char[] input)
	{
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < input.length; i++)
		{
			if (input[i] >= '0' && input[i] <= '9')
			{
				int temp = input[i] - 48;
				stack.push(temp);
			} else if (input[i] >= 'A' && input[i] <= 'F')
			{
				int temp = input[i] - 55;
				stack.push(temp);
			} else
			{
				int pre = stack.pop();
				int next = stack.pop();
				int result = 0;
				switch (input[i])
				{
				case '+':
					result = next + pre;
					break;
				case '-':
					result = next - pre;
					break;
				case '*':
					result = next * pre;
					break;
				}
				stack.push(result);
			}
		}
		return stack.pop();
	}

	public static void main(String[] args)
	{
		// Scanner in = new Scanner(System.in);
		// while (in.hasNext())
		// {
		// String string = in.nextLine();
		// System.out.println(postfixCalc(string.toCharArray()));
		// }
		String string = "AB+5-";
		System.out.println(postfixCalc(string.toCharArray()));

	}

}

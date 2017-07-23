package com.algorithm;

import java.util.Stack;

/*
 * 用两个stack实现quene
 */

class Solution
{
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public Solution()
	{

	}

	public void push(int node)
	{

		stack1.push(node);
	}

	public int pop()
	{
		if (!stack2.empty())
		{
			return stack2.pop();
		} else
		{
			while (!stack1.empty())
			{
				stack2.push(stack1.pop());
			}
			return stack2.pop();
		}
	}
}

public class realizeQueneByStack
{

	public static void main(String[] args)
	{
		Solution solution = new Solution();
		for (int i = 0; i < 10; i++)
		{
			solution.push(i);
		}
		for (int i = 0; i < 10; i++)
		{
			System.out.println(solution.pop());
		}
	}
}

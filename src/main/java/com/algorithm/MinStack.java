package com.algorithm;

/*
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数 ，min,pop,push时间复杂度都为O(l)
 * 可以申请一个辅助stack，里面记录min变化过程，
 * 1 push 时，检查push值，小于min，则min变为push 值 ，    辅助stack push min
 * 2 pop stack pop 辅助stack pop ,然后min = 辅助stack.peak()
 */
import java.util.Stack;

public class MinStack
{
	private Stack<Integer> stack = new Stack<Integer>();
	private int min = Integer.MAX_VALUE;
	private Stack<Integer> mStack = new Stack<Integer>();

	public void push(int node)
	{
		if (node < min)
		{
			min = node;
		}
		mStack.push(min);
		stack.push(node);
	}

	public void pop()
	{
		stack.pop();
		mStack.pop();
		min = mStack.peek();

	}

	public int top()
	{
		return stack.peek();
	}

	public int min()
	{
		return min;
	}

	public static void main(String[] args)
	{

	}
}
package com.algorithm;

/*
 * ����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��СԪ�ص�min���� ��min,pop,pushʱ�临�Ӷȶ�ΪO(l)
 * ��������һ������stack�������¼min�仯���̣�
 * 1 push ʱ�����pushֵ��С��min����min��Ϊpush ֵ ��    ����stack push min
 * 2 pop stack pop ����stack pop ,Ȼ��min = ����stack.peak()
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
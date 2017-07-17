package com.algorithm;

import java.util.Stack;

/*输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4，5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * （注意：这两个序列的长度是相等的）
 * 设置指针 push数组point，pop数组pointB
 * 1 stack push 直到栈顶遇到pointB指向的数据
 * 2 stack pop 然后重复 1
 * push完一次需要pointA++ pop一次需要pointB++
 * 当pointA超出数组指向范围且 栈顶数组！= pointB指向的数据，返回false
 * pointB超出数组指向范围，则已经完成序列，返回true
 */
public class IsPopOrder
{
	public static boolean IsPopOrder1(int[] pushA, int[] popA)
	{
		if (pushA.length <= 0)
		{
			return true;
		}
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(pushA[0]);
		int pointA = 1;
		int pointB = 0;
		while (pointB <= popA.length - 1)
		{
			while (stack.peek() != popA[pointB] && pointA <= pushA.length - 1)
			{
				stack.push(pushA[pointA]);
				pointA++;
			}
			if (stack.peek() != popA[pointB] && pointA > pushA.length - 1)
			{
				return false;
			} else
			{
				stack.pop();
				pointB++;
			}
		}
		return true;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] a =
				{ 1 };
		int[] b =
				{ 4 };
		int[] c =
				{ 4, 3, 5, 1, 2 };
		System.out.println(IsPopOrder1(a, b));
		System.out.println(IsPopOrder1(a, c));

	}

}

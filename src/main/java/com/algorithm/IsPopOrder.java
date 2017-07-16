package com.algorithm;

import java.util.Stack;

/*���������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳��
 * ����ѹ��ջ���������־�����ȡ���������1,2,3,4,5��ĳջ��ѹ��˳��
 * ����4��5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У���4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С�
 * ��ע�⣺���������еĳ�������ȵģ�
 * ����ָ�� push����point��pop����pointB
 * 1 stack push ֱ��ջ������pointBָ�������
 * 2 stack pop Ȼ���ظ� 1
 * push��һ����ҪpointA++ popһ����ҪpointB++
 * ��pointA��������ָ��Χ�� ջ�����飡= pointBָ������ݣ�����false
 * pointB��������ָ��Χ�����Ѿ�������У�����true
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

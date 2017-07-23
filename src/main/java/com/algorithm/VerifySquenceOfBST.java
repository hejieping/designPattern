package com.algorithm;

/*
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同
 * 递归思路
 * 设start end为要检查的数组首尾，显然end为根节点
 * 从start到end-1，查找第一个大于end的点pivot
 * start到pivot-1左边为左子树，pivot到end-1为右子树
 * 判断右子树节点是否全部大于根节点（左子书在查找pivot中已经判断过），
 * 判断正确，则同样方法递归检查左子树和右子树，否则返回错误
 * 期间需要检查越界还有end<=start等情况
 */
public class VerifySquenceOfBST
{
	public boolean VerifySquenceOfBST1(int[] sequence)
	{
		if (sequence.length == 0)
		{
			return false;
		}
		return Verify(sequence, 0, sequence.length - 1);
	}

	public boolean Verify(int[] sequence, int start, int end)
	{
		if (start >= end)
		{
			return true;
		}
		int pivot = start;
		while (pivot < end)
		{
			if (sequence[pivot] < sequence[end])
			{
				pivot++;
			} else
			{
				break;
			}
		}
		for (int i = pivot; i < end; i++)
		{
			if (sequence[i] < sequence[end])
			{
				return false;
			}
		}
		return Verify(sequence, start, pivot - 1)
				&& Verify(sequence, pivot, end - 1);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] a =
				{ 7, 6, 4, 5 };
		System.out.println(new VerifySquenceOfBST().VerifySquenceOfBST1(a));

	}

}

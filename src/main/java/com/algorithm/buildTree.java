package com.algorithm;



public class buildTree
{

	public static TreeNode reConstructBinaryTree(int[] pre, int[] in)
	{
		if (pre == null || pre.length <= 0)
		{
			return null;
		}
		return getComponetTree(pre, in, 0, 0, in.length - 1);
	}

	public static TreeNode getComponetTree(int[] pre, int[] in, int m,
			int start, int end)
	{
		if (end < start)
		{
			return null;
		}
		TreeNode node = new TreeNode(pre[m]);
		for (int i = start; i <= end; i++)
		{
			if (pre[m] == in[i])
			{
				node.left = getComponetTree(pre, in, m + 1, start, i - 1);
				node.right = getComponetTree(pre, in, m + i - start + 1, i + 1,
						end);
				return node;
			}
		}
		return null;

	}

	public static void print(TreeNode node)
	{
		if (node == null)
		{
			return;
		}
		System.out.print(node.val);
		System.out.print("  ");
		print(node.left);
		print(node.right);
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] pre =
		{ 1, 2, 4, 3, 5, 6 };
		int[] in =
		{ 4, 2, 1, 5, 3, 6 };
		TreeNode node = reConstructBinaryTree(pre, in);
		print(node);

	}

}

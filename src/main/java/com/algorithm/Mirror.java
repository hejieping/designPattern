package com.algorithm;


import java.util.LinkedList;

/*
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * 二叉树的镜像定义：源二叉树 
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	镜像二叉树
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7  5
 */
/*
 * 利用递归原则，交换左右子女
 * 非递归算法，运用队列
 * 1 左右子女加入队列，然后交换左右子女
 * 2 取出队列元素，重复 1 步骤
 */
public class Mirror
{
	public void Mirror1(TreeNode root)
	{
		swap2(root);
	}

	public void swap(TreeNode root)
	{
		if (root != null)
		{
			swap(root.left);
			swap(root.right);
			TreeNode tempNode = root.left;
			root.left = root.right;
			root.right = tempNode;
		}
	}

	public void swap2(TreeNode root)
	{
		LinkedList<TreeNode> quene = new LinkedList<TreeNode>();
		if (root == null)
		{
			return;
		}
		if (root.left != null)
		{
			quene.add(root.left);
		}
		if (root.right != null)
		{
			quene.add(root.right);
		}
		TreeNode tempNode = root.left;
		root.left = root.right;
		root.right = tempNode;
		while (!quene.isEmpty())
		{
			TreeNode treeNode = quene.remove();
			if (treeNode.left != null)
			{
				quene.add(treeNode.left);
			}
			if (treeNode.right != null)
			{
				quene.add(treeNode.right);
			}
			tempNode = treeNode.left;
			treeNode.left = treeNode.right;
			treeNode.right = tempNode;
		}
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
		TreeNode treeNode = new TreeNode(8);
		treeNode.left = new TreeNode(8);
		treeNode.right = new TreeNode(7);
		treeNode.left.left = new TreeNode(9);
		treeNode.left.right = new TreeNode(2);

		treeNode.left.right.right = new TreeNode(7);
		treeNode.left.right.left = new TreeNode(4);

		TreeNode root2 = new TreeNode(8);
		root2.left = new TreeNode(9);
		root2.right = new TreeNode(2);
		Mirror mirror = new Mirror();
		mirror.Mirror1(treeNode);
		print(treeNode);
	}

}

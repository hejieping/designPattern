package com.algorithm;

import java.util.LinkedList;

/*
 * ���������Ķ�����������任ΪԴ�������ľ���
 * �������ľ����壺Դ������ 
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	���������
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7  5
 */
/*
 * ���õݹ�ԭ�򣬽���������Ů
 * �ǵݹ��㷨�����ö���
 * 1 ������Ů������У�Ȼ�󽻻�������Ů
 * 2 ȡ������Ԫ�أ��ظ� 1 ����
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

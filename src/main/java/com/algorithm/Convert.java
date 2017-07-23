package com.algorithm;


/*
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向
 * 
 * 递归：设函数TreeNode Convert2(TreeNode pRootOfTree, boolean direction),该函数让pRootOfTree树变为双向链表
 * 并且 direction = true 返回链表头，direction = false 返回链表尾
 *  1 Convert2(pRootOfTree.left,false)
 *  2 Convert2(pRootOfTree.right,true)
 *  3 将处理好的左右子树的链表拼接起来
 * 
 */
public class Convert
{
	public TreeNode Convert1(TreeNode pRootOfTree)
	{
		if (pRootOfTree == null)
		{
			return null;
		}

		if (pRootOfTree.left != null)
		{
			TreeNode temp = Convert2(pRootOfTree.left, false);
			pRootOfTree.left = temp;
			temp.right = pRootOfTree;
		}
		if (pRootOfTree.right != null)
		{
			TreeNode temp = Convert2(pRootOfTree.right, true);
			pRootOfTree.right = temp;
			temp.left = pRootOfTree;
		}

		while (pRootOfTree.left != null)
		{
			pRootOfTree = pRootOfTree.left;
		}
		return pRootOfTree;

	}

	public TreeNode Convert2(TreeNode pRootOfTree, boolean direction)
	{
		if (pRootOfTree.left != null)
		{
			TreeNode temp = Convert2(pRootOfTree.left, false);
			pRootOfTree.left = temp;
			temp.right = pRootOfTree;
		}
		if (pRootOfTree.right != null)
		{
			TreeNode temp = Convert2(pRootOfTree.right, true);
			pRootOfTree.right = temp;
			temp.left = pRootOfTree;
		}
		if (direction)
		{
			while (pRootOfTree.left != null)
			{
				pRootOfTree = pRootOfTree.left;
			}
			return pRootOfTree;
		} else
		{
			while (pRootOfTree.right != null)
			{
				pRootOfTree = pRootOfTree.right;
			}
			return pRootOfTree;
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		TreeNode treeNode = new TreeNode(5);
		treeNode.left = new TreeNode(3);
		treeNode.right = new TreeNode(6);
		treeNode.left.left = new TreeNode(2);
		treeNode.left.right = new TreeNode(4);
		treeNode.right.right = new TreeNode(7);

	}

}

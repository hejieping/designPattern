package com.algorithm;

/*
 * ����һ�ö��������������ö���������ת����һ�������˫������Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
 * 
 * �ݹ飺�躯��TreeNode Convert2(TreeNode pRootOfTree, boolean direction),�ú�����pRootOfTree����Ϊ˫������
 * ���� direction = true ��������ͷ��direction = false ��������β
 *  1 Convert2(pRootOfTree.left,false)
 *  2 Convert2(pRootOfTree.right,true)
 *  3 ������õ���������������ƴ������
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

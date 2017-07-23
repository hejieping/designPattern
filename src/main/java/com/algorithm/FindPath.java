package com.algorithm;

/*
 * ����һ�Ŷ�������һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����
 * ·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����
 * �ݹ�
 */
import java.util.ArrayList;

public class FindPath
{
	public static ArrayList<ArrayList<Integer>> list;

	public ArrayList<ArrayList<Integer>> FindPath1(TreeNode root, int target)
	{
		list = new ArrayList<ArrayList<Integer>>();
		if (root == null)
		{
			return list;
		}
		ArrayList<Integer> path = new ArrayList<Integer>();
		FindPath2(root, target, 0, path);
		return list;
	}

	public void FindPath2(TreeNode root, int target, int nowCost,
			ArrayList<Integer> path)
	{
		if (root.val + nowCost > target)
		{
			return;
		}
		boolean isLeaf = ((root.left == null) && (root.right == null));
		if (!isLeaf && (root.val + nowCost < target))
		{
			path.add(root.val);
			if (root.left != null)
			{
				ArrayList<Integer> pathLeft = (ArrayList<Integer>) path.clone();
				FindPath2(root.left, target, nowCost + root.val, pathLeft);
			}
			if (root.right != null)
			{
				ArrayList<Integer> pathRight = (ArrayList<Integer>) path
						.clone();
				FindPath2(root.right, target, nowCost + root.val, pathRight);
			}
			return;
		}
		if (isLeaf)
		{
			if (root.val + nowCost == target)
			{
				path.add(root.val);
				list.add(path);
				return;
			}
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		TreeNode treeNode = new TreeNode(10);
		treeNode.left = new TreeNode(5);
		treeNode.right = new TreeNode(12);
		treeNode.left.left = new TreeNode(4);
		treeNode.left.right = new TreeNode(7);
		new FindPath().FindPath1(treeNode, 15);

	}

}

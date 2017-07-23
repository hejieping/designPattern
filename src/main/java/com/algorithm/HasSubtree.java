package com.algorithm;

/*
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 * 递归方法解决，注意null问题，还有是子结构不是子树
 *     8             8
 *   9   2         9   2     true
 * 9  7 6  8     #  # #  # 
 */
public class HasSubtree
{
	public static boolean HasSubtree1(TreeNode root1,
			TreeNode root2)
	{
		if (root2 == null || root1 == null)
		{
			return false;
		}
		if (root1.val == root2.val)
		{
			if (isSameTree(root1, root2))
			{
				return true;
			}
		}
		return HasSubtree1(root1.left, root2)
				|| HasSubtree1(root1.right, root2);

	}

	public static boolean isSameTree(TreeNode root1,
			TreeNode root2)
	{
		if (root2 == null)
		{
			return true;
		}
		if (root1 == null)
		{
			return false;
		}
		return (root1.val == root2.val) ? (isSameTree(root1.left, root2.left)
				&& isSameTree(root1.right, root2.right)) : false;

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
		System.out.println(HasSubtree1(treeNode, root2));
	}

}

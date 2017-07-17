package com.algorithm;



/**
 * Created by jieping.hjp on 2017/7/12.
 */
public class IsBalanced_Solution {
    public boolean IsBalanced_Solution1(TreeNode root) {
        if(root==null){
            return true;
        }
        int result = depth(root.left)-depth(root.right);
        //判断左右子节点长度是否符合平衡二叉树
        if(result>=-1&&result<=1){
            //递归判断左右子节点
            return IsBalanced_Solution1(root.right)&&IsBalanced_Solution1(root.left);
        }
        return false;
    }
    //递归求树的深度
    public int depth(com.algorithm.TreeNode root){
        if(root==null){
            return 0;
        }
        int leftLength = depth(root.left);
        int rightLength = depth(root.right);
        return leftLength>=rightLength?leftLength+1:rightLength+1;
    }
}

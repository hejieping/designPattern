package com.algorithm;

// class ListNode {
//    int val;
//    ListNode next = null;
//
//    ListNode(int val) {
//        this.val = val;
//    }
//}
/*
 * ����һ����������������е�����k�����
 * �迼��k<=0 �� head.length <k�����
 */
public class FindKthToTail
{
	public ListNode FindKthToTail1(ListNode head, int k)
	{
		if (k <= 0)
		{
			return null;
		}
		ListNode targrtNode = head;
		while (k > 1 && (head != null))
		{
			head = head.next;
			k--;
		}
		if (head == null)
		{
			return null;
		}
		while (head.next != null)
		{
			head = head.next;
			targrtNode = targrtNode.next;
		}
		return targrtNode;

	}

	public static void main(String[] args)
	{

	}

}

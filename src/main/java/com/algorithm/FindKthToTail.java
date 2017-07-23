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
 * 输入一个链表，输出该链表中倒数第k个结点
 * 需考虑k<=0 和 head.length <k的情况
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

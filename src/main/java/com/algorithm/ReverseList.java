package com.algorithm;

/*
 * ����һ��������ת�����������������Ԫ��
 */
public class ReverseList
{
	public ListNode ReverseList1(ListNode head)
	{
		if (head == null || head.next == null)
		{
			return head;
		}
		ListNode nextNode = head.next;
		ListNode nowNode = head;
		ListNode preNode = head;
		head.next = null;
		nowNode = nextNode;
		nextNode = nextNode.next;
		while (nextNode != null)
		{
			nowNode.next = preNode;
			preNode = nowNode;
			nowNode = nextNode;
			nextNode = nextNode.next;
		}
		nowNode.next = preNode;
		return nowNode;

	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}

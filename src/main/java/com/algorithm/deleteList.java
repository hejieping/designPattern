package com.algorithm;

/*
 * 在O（l）时间内删除链表中的一个节点
 * 考虑将toBeDeleted.next的值复制到toBeDeleted 然后删除toBeDeleted.next
 */
public class deleteList
{
	public void deleteNode(ListNode head, ListNode toBeDeleted)
	{
		if (head == toBeDeleted)// 删除对象是头部
		{
			head = null;
		}
		if (toBeDeleted.next == null) // 删除对象是尾部
		{
			ListNode tempNode = head;
			while (tempNode.next != toBeDeleted)
			{
				tempNode = tempNode.next;
			}
			tempNode.next = null;
		}
		toBeDeleted.val = toBeDeleted.next.val;
		toBeDeleted.next = toBeDeleted.next.next;
	}
}

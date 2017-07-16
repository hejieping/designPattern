package com.algorithm;

/*
 * ��O��l��ʱ����ɾ�������е�һ���ڵ�
 * ���ǽ�toBeDeleted.next��ֵ���Ƶ�toBeDeleted Ȼ��ɾ��toBeDeleted.next
 */
public class deleteList
{
	public void deleteNode(ListNode head, ListNode toBeDeleted)
	{
		if (head == toBeDeleted)// ɾ��������ͷ��
		{
			head = null;
		}
		if (toBeDeleted.next == null) // ɾ��������β��
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

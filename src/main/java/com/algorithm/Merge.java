package com.algorithm;

/*
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则
 * 
 * lsit1: node->node->node->node->null;
 * list2: node->node->node->node->null;
 * 1 对于list1 list2 中未排序部分的两个头指针，设定headBig headLittle，使headBig.val >= headLittle.val 
 * 2 headLittle不断迭代前进，找到大于headBig的引用 tempNode
 * 3 将tempNode的前一引用Node的next指向headBig,然后
 * 4 headLittle = headBig, headBig = tempNode，重复1步骤直到有一个链表达到尽头
 */
public class Merge
{
	public static ListNode Merge1(ListNode list1, ListNode list2)
	{
		if (list1 == null || list2 == null)
		{
			if (list1 == null && list2 == null)
			{
				return null;
			} else
			{
				return list1 == null ? list2 : list1;
			}
		}
		ListNode headBig;
		ListNode headLittle;
		if (list1.val >= list2.val)
		{
			headBig = list1;
			headLittle = list2;
		} else
		{
			headBig = list2;
			headLittle = list1;
		}
		ListNode resultNode = headLittle;
		while (headBig != null)
		{
			while (headLittle.next != null && headLittle.next.val < headBig.val)
			{
				headLittle = headLittle.next;
			}
			ListNode tempNode = headLittle.next;
			headLittle.next = headBig;
			headLittle = headBig;
			headBig = tempNode;
		}
		return resultNode;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(3);
		list1.next.next = new ListNode(5);
		ListNode list2 = new ListNode(2);
		list2.next = new ListNode(4);
		list2.next.next = new ListNode(6);
		ListNode result = Merge1(list1, list2);
		while (result.next != null)
		{
			System.out.println(result.val);
			result = result.next;
		}
	}

}

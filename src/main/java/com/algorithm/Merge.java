package com.algorithm;

/*
 * ���������������������������������ϳɺ��������Ȼ������Ҫ�ϳɺ���������㵥����������
 * 
 * lsit1: node->node->node->node->null;
 * list2: node->node->node->node->null;
 * 1 ����list1 list2 ��δ���򲿷ֵ�����ͷָ�룬�趨headBig headLittle��ʹheadBig.val >= headLittle.val 
 * 2 headLittle���ϵ���ǰ�����ҵ�����headBig������ tempNode
 * 3 ��tempNode��ǰһ����Node��nextָ��headBig,Ȼ��
 * 4 headLittle = headBig, headBig = tempNode���ظ�1����ֱ����һ������ﵽ��ͷ
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

package com.algorithm;

/*
 * 将listnode逆序输出到arraylist中
 */
import java.util.ArrayList;
import java.util.Stack;



public class printList
{
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode)
	{
		Stack<Integer> stack = new Stack<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (listNode != null)
		{
			stack.push(listNode.val);
			listNode = listNode.next;
		}
		while (!stack.isEmpty())
		{
			list.add(stack.pop());
		}
		return list;

	}

	public static void main(String[] args)
	{
		ListNode node = new ListNode(0);
		ListNode temp = node;
		for (int i = 1; i < 10; i++)
		{
			node.next = new ListNode(i);
			node = node.next;
		}
		// printListFromTailToHead(temp);
		printListFromTailToHead(null);
	}
}

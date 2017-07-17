package com.algorithm;

/*
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，
 * 另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 *
 *
 * 1 简单复制节点（只复制label和next节点),并把复制的节点接在原节点的后面
 *  简单复制前：node1->node2->node3->node4->node5->null
 *  简单复制后: node1->node1Copy->node2->node2Copy->node3->node3Copy->node4->node4Copy->node5->node5Copy->null
 * 2 因为node的next是nodeCopy,所以nodeCopy.random = node.random.next，遍历一次，给nodeCopy赋值random
 * 3 将从链表中提取出复制的链表
 * 算法时间复杂度O(n)，
 * 
 */
class RandomListNode
{
	int label;
	RandomListNode next = null;
	RandomListNode random = null;

	RandomListNode(int label)
	{
		this.label = label;
	}
}

public class Clone
{
	public RandomListNode Clone1(RandomListNode pHead)
	{
		copyNext(pHead);
		copyRandom(pHead);
		return extractCopy(pHead);
	}

	private void copyNext(RandomListNode pHead)
	{
		while (pHead != null)
		{
			RandomListNode temp = new RandomListNode(pHead.label);
			temp.next = pHead.next;
			pHead.next = temp;
			pHead = temp.next;
		}
	}

	private void copyRandom(RandomListNode phead)
	{
		while (phead != null)
		{
			RandomListNode NodeCopy = phead.next;
			if (phead.random != null)
			{
				NodeCopy.random = phead.random.next;
			}
			phead = NodeCopy.next;
		}
	}

	private RandomListNode extractCopy(RandomListNode phead)
	{
		if (phead == null)
		{
			return null;
		}
		RandomListNode CopyHead = phead.next;
		RandomListNode CopyNode = CopyHead;
		while (phead != null && phead.next.next != null)
		{
			phead.next = phead.next.next;
			phead = phead.next;
			CopyNode.next = phead.next;
			CopyNode = CopyNode.next;
		}
		phead.next = null;
		return CopyHead;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		RandomListNode node1 = new RandomListNode(1);
		RandomListNode node2 = new RandomListNode(2);
		RandomListNode node3 = new RandomListNode(3);
		RandomListNode node4 = new RandomListNode(4);
		RandomListNode node5 = new RandomListNode(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node1.random = node3;
		node2.random = node5;
		node4.random = node2;
		new Clone().Clone1(node1);

	}

}

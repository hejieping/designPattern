package com.algorithm;

/*
 * ����һ����������ÿ���ڵ����нڵ�ֵ���Լ�����ָ�룬һ��ָ����һ���ڵ㣬
 * ��һ������ָ��ָ������һ���ڵ㣩�����ؽ��Ϊ���ƺ��������head��
 * ��ע�⣬���������벻Ҫ���ز����еĽڵ����ã�������������ֱ�ӷ��ؿգ�
 * 
 * 
 * 1 �򵥸��ƽڵ㣨ֻ����label��next�ڵ�),���Ѹ��ƵĽڵ����ԭ�ڵ�ĺ���
 *  �򵥸���ǰ��node1->node2->node3->node4->node5->null
 *  �򵥸��ƺ�: node1->node1Copy->node2->node2Copy->node3->node3Copy->node4->node4Copy->node5->node5Copy->null
 * 2 ��Ϊnode��next��nodeCopy,����nodeCopy.random = node.random.next������һ�Σ���nodeCopy��ֵrandom
 * 3 ������������ȡ�����Ƶ�����
 * �㷨ʱ�临�Ӷ�O(n)��
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

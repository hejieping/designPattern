package com.algorithm;

class findFirstCommonNode
{
    public ListNode findFirstCommonNode(ListNode node1, ListNode node2)
    {
        int length1 = 0;
        int length2 = 0;
        ListNode temp1 = node1;
        ListNode temp2 = node2;
        while (temp1 != null)
        {
            length1++;
            temp1 = temp1.next;
        }
        while (temp2 != null)
        {
            length2++;
            temp2 = temp2.next;
        }
        if (length1 > length2)
        {
            for (int i = 0; i < length1 - length2; i++)
            {
                node1 = node1.next;
            }
        } else if (length1 < length2)
        {
            for (int i = 0; i < length2 - length1; i++)
            {
                node2 = node2.next;
            }
        }
        while (node1 != node2 && node1 != null)
        {
            node1 = node1.next;
            node2 = node2.next;
        }
        return node1;
    }

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

    }

}

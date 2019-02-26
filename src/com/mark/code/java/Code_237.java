package com.mark.code.java;

/**
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
 * <p>
 * 链表至少包含两个节点。
 * 链表中所有节点的值都是唯一的。
 * 给定的节点为非末尾节点并且一定是链表中的一个有效节点。
 * 不要从你的函数中返回任何结果。
 */


public class Code_237 {


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    public void deleteNode(ListNode node) {
        //这个题的意思就是,给定的这个node,给定的节点为非末尾节点,所以直接将它变成它的下一个就好了.
        ListNode nextNode = node.next;
        node.next = nextNode.next;
        node.val = nextNode.val;
    }
}

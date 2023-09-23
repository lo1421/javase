import java.util.*;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param head ListNode类
     * @param m    int整型
     * @param n    int整型
     * @return ListNode类
     */

    //我们把[m,n]之间的节点当做是子链表
    public ListNode reverseBetween(ListNode head, int m, int n) {
        //虚拟头结点
        ListNode newHead = new ListNode(-1);
        newHead.next = head;//把虚拟头结点连入链表中

        //找到子链表的起始节点left和终止节点right(要求记录下左子链表左节点的前驱节点)

        ListNode leftPre = newHead;
        while (m > 1) {
            leftPre = leftPre.next;
            m--;
        }
        //while结束之后保留的leftPre即起始节点的前驱结点
        ListNode left = leftPre.next;//子链表的起始节点

        ListNode right = newHead;
        while (n > 0) {
            right = right.next;
            n--;
        }
        ListNode rightNext = right.next;//保留的rightNext即终止节点的后继结点

        //子链表进行头插
        ListNode subHead = left;//子链表的头结点
        ListNode cur = subHead.next;
        while (cur != rightNext) {
            ListNode curNext = cur.next;
            cur.next = subHead;
            subHead = cur;
            cur = curNext;
        }

        //开始链接子链表
        leftPre.next = subHead;
        left.next = rightNext;

        return newHead.next;//返回链表原头结点
    }

    static class ListNode {
        int val;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
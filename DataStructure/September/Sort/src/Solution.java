package src;

import java.util.*;

class ListNode {
    int val;
    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param head ListNode类 the head node
     * @return ListNode类
     */
    public ListNode sortInList(ListNode head) {

        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o2.val - o1.val;
            }
        });

        ListNode cur = head;
        while (cur != null) {
            queue.offer(cur);
            cur = cur.next;
        }
        ListNode dummy = new ListNode(-1); // 虚拟头节点
        ListNode tail = dummy; // 尾节点
        while (!queue.isEmpty()) {
            ListNode node = queue.poll();
            tail.next = node;
            tail = tail.next;
        }
        tail.next = null; // 断开最后一个节点的next引用，防止出现循环链表

        return dummy.next; // 返回排好序的链表
    }
}
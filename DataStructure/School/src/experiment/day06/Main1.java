package experiment.day06;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        ListNode head = create();
        head = reverse(head);
        display(head);
    }

    //翻转链表的方法
    public static ListNode reverse(ListNode head) {
        if (head == null) {
            System.out.print("NULL");
        }

        ListNode cur = head.next;
        //将原始头结点的next域滞空
        head.next = null;
        while (cur != null) {
            ListNode curNext = cur.next;
            cur.next = head;
            head = cur;
            cur = curNext;
        }
        return head;
    }

    //创建链表的方法
    public static ListNode create() {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        //虚拟节点
        ListNode newHead = new ListNode(-1);
        newHead.next = null;
        ListNode cur = newHead;
        while (size > 0) {
            ListNode node = new ListNode(s.nextInt());
            cur.next = node;
            cur = cur.next;
            size--;
        }
        return newHead.next;
    }

    //遍历链表的方法
    public static void display(ListNode head) {
        if (head == null) {
            System.out.print("NULL");
        }
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val);
            if (cur.next != null) {
                System.out.print(" ");
            }
            cur = cur.next;
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

}


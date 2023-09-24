package experiment.day06;

import java.util.*;

//输入  4 1 2 3 4 5 6 7 8 9 0 -1
//输出  7
public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        ListNode head = create(scanner);
        int result = findKthFromEnd(head, k);

        if (result != -1) {
            System.out.println(result);
        } else {
            System.out.println("NULL");
        }
    }

    //找到倒数第K个节点
    public static int findKthFromEnd(ListNode newHead, int k) {
        if (k <= 0) {
            return -1; // 不合法的 k 值，返回 -1 或者其他合适的值
        }

        ListNode fast = newHead;
        ListNode slow = newHead;

        // 快指针先走 k 步
        for (int i = 0; i < k; i++) {
            if (fast == null) {
                return -1; // k 大于链表长度，返回 -1 或者其他合适的值
            }
            fast = fast.next;
        }

        // 快慢指针同时前进，直到快指针到达链表末尾
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow.val;
    }

    //创建链表
    public static ListNode create(Scanner s) {

        ListNode newHead = new ListNode(-1);
        newHead.next = null; // 初始化为一个空节点
        ListNode cur = newHead;

        while (true) {
            int val = s.nextInt();
            if (val == -1) break;
            ListNode newNode = new ListNode(val);
            cur.next = newNode;
            cur = cur.next;
        }
        return newHead;
    }

    //ListNode类
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}

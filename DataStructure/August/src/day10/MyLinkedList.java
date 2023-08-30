package day10;

public class MyLinkedList {
    int size;
    ListNode head;

    //头插法
    public void addFirst(int key) {
        ListNode newHead = new ListNode(key);
        newHead.next = head;
        head = newHead;
    }

    //尾插法
    public void addLast(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
        } else {
            ListNode cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = newNode;
        }
    }
    //任意位置插入


    //遍历打印链表
    public void display() {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.var + " ");
            cur = cur.next;
        }
    }

    /*要求：输入一个链表，然后返回链表中指定的倒数第k个的节点*/
    public ListNode FideKthToTail(int k) {
        //先判断输入的k是否合法
        if (k <= 0 || head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        //fast要先与slow拉开k-1的距离
        while ((k - 1) != 0) {
            fast = fast.next;
            if (fast == null) {
                return null;//k>链表的长度，是不合法的k
            }
            k--;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    //获得链表的长度
    public int size() {
        ListNode cur = head;
        int size = 0;
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        return size;
    }

    //快慢指针
    public ListNode middleNode() {
        if (head == null) {
            return null;
        }
        int length = 0;
        ListNode cur = head;
        while (cur != null) {
            cur = cur.next;
            length++;
        }
        int size2 = length / 2;
        cur = head;
        while (size2 != 0) {
            cur = cur.next;
            size2--;
        }
        return cur;
    }

    public ListNode middleNode1() {
        if (head == null) {
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}

class ListNode {
    public int var;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int var) {
        this.var = var;
    }
}

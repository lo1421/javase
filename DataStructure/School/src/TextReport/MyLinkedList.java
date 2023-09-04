package TextReport;

//封装一个单向链表非循环的数据结构
public class MyLinkedList {
    //头节点
    private ListNode head;
    private int size;

    //打印链表的方法
    public void display() {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if (head == null) {
            head = node;
        }
        node.next = head;
        head = node;
    }

    //尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        ListNode cur = head;
        if (head == null) {
            head = node;
        }
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    //任意位置插入
    public void add(int data, int index) {
        //判断所索引是否合法
        

        if (index == 0) {
            //直接调用头插法

        }


    }


    //静态内部类，封装一个节点类
    static class ListNode {
        public int val;
        public ListNode next;

        //构造方法
        public ListNode(int val) {
            this.val = val;
        }
    }
}

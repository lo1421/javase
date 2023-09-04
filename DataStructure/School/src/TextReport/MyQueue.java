package TextReport;
/*
1、用单向链表的结构来实现队列
2、队列既可以使用链式的存储方式，又可以使用顺序的存储方式

3、使用链式的存储方式的时候，有两种选择：单向链表和双向链表
3.1
但是如果使用平常的单向链表的话，选择头节点作为队头，尾节点作为队尾的话，出队的时间复杂度是O(1) ，入队的时间复杂度是O(n);
                          选择头结点作为队尾，尾节点作为队头的话，出队的时间复杂度是O(n) ，入队的时间复杂度是O(1);
但是如果给单向链表添加一个last指针始终指向尾节点的话，那么选择头节点作为队头，尾节点作为队尾，这样不论是出队还是入队的时间复杂度都是O（1）
3.2
如果使用双向链表的话，就非常方便，不仅可以实现单端队列queue，而且可以实现双端队列deque

4、选择顺序存储方式的时候同样也要考虑如何让入队和出队的时间复杂度都变为O(1)
 */

public class MyQueue {
    private Node head;
    private Node tail;


    /**
     * 从队尾入队的方法
     *
     * @param val 入队的数据
     */

    public void offer(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = tail.next;
    }

    /**
     * 从队头出队方法
     *
     * @return 返回出队的数据
     */
    public int poll() {
        if (head == null) {
            return -1;//这里也可以自己定义一个异常，因为空队列无法返回数据
        }
        int oldValue = head.val;
        if (head.next == null) {
            head = tail = null;
        } else {
            head = head.next;
        }
        return oldValue;
    }

    /**
     * 查看当前队头元素
     *
     * @return 返回的队头的元素
     */
    public int peek() {
        if (head == null) {
            return -1;
        }
        return head.val;
    }

    /**
     * 获取队列大小的方法
     *
     * @return 队列的大小
     */
    public int getSize() {
        Node cur = head;
        int count = 0;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }

    /**
     * 遍历队列的方法
     */
    public void display() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //封装一个节点类
    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}

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
    public void add(int data, int pos) {
        //判断索引是否合法
        if (checkPos(pos)) {
            throw new PosIllegalException();
        }
        if (pos == 0) {
            //调用头插法
            addFirst(data);
        } else if (pos == size) {
            //调用尾插法
            addLast(data);
        } else {
            //代码如果执行到这里则表示是在中间插入元素
            ListNode node = new ListNode(data);
            ListNode cur = head;
            while (pos - 1 != 0) {
                cur = cur.next;
                pos--;
            }
            node.next = cur.next;
            cur.next = node;
        }
    }

    //从链表中删除一个节点的核心是找出需要删除节点的前驱结点
    //删除链表中key首次出现的节点
    public void remove(int key) {
        if (head.val == key) {
            //出现在了头结点的位置，则可以直接断掉
            head = head.next;
            return;
        }
        ListNode cur = searchPreKey(key);
        if (cur == null) {
            return;
        }
        //开始删除
        cur.next = cur.next.next;//这行代码同样适用于当key第一次出现的地方是尾节点的位置
    }

    //删除所有值为key的节点
    public void removeAllKey(int key) {
        if (head == null) {
            return;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.val == key) {
                pre.next = cur.next;
                cur = cur.next;
            } else {
                pre = cur; // 移动前驱节点
                cur = cur.next; // 移动当前节点
            }
        }
        //这个时候再来处理剩下的头结点
        if (head.val == key) {
            head = head.next;
        }

    }

    public void removeAllKey1(int key) {
        ListNode dummy = new ListNode(-1); // 创建一个虚拟头节点
        dummy.next = head; // 将虚拟头节点的下一个节点指向真实的头节点
        ListNode pre = dummy; // 初始化前驱节点为虚拟头节点
        ListNode cur = head; // 初始化当前节点为头节点

        while (cur != null) {
            if (cur.val == key) {
                pre.next = cur.next; // 删除当前节点
                cur = cur.next; // 继续检查下一个节点
            } else {
                pre = cur; // 移动前驱节点
                cur = cur.next; // 移动当前节点
            }
        }

        head = dummy.next; // 更新头节点
    }


    //封装一个返回查找首次出现关键字key的前驱节点的方法
    private ListNode searchPreKey(int key) {
        if (head == null) {
            return null;
        } else {
            int count = 0;
            ListNode cur = head;
            while (cur.next != null) {
                if (cur.next.val == key) {
                    return cur;
                }
                cur = cur.next;
            }
            return null;
        }
    }

    //判断索引合法的方法
    private boolean checkPos(int pos) {
        if (pos < 0 || pos > size) {
            return false;
        }
        return true;
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

class PosIllegalException extends RuntimeException {
    public PosIllegalException() {

    }

    public PosIllegalException(String msg) {
        super(msg);
    }
}
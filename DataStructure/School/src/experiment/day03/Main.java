package experiment.day03;

import java.util.Scanner;

class Main {
    //不带头的单向非循环链表
    Node head;
    //链表实际元素个数
    int size;
    Scanner scan = new Scanner(System.in);


    //创建一个构建链表的方法
    public Node creatLink() {
        int size = scan.nextInt();
        for (int i = 0; i < size; i++) {
            int val = scan.nextInt();
            //尾插进去
            addLast(val);
        }
        return head;
    }


    //主方法
    public static void main(String[] args) {
        Main main = new Main();
        main.creatLink();

        main.operator();
        main.display();
    }

    //删除方法
    public void remove(int x, int index) {
        if (isEmpty()) {//判空
            return;
        }
        if (index < 0 || index >= size) {//不合法的下标
            return;
        }
        if (index == 0) {
            return;
        }
        //获取index的前驱节点
        Node pre = findPreIndex(index);
        //开始删除节点
        Node removeNode = pre.next;
        pre.next = removeNode.next;
        size--;
    }

    //插入方法
    public void insert(int x, int index, int data) {
        if (index < 0 || index > size) {//非法位置
            return;
        }
        Node newNode = new Node(data);
        Node cur = findCurIndex(index);
        //要求是在这里进行在cur的后面插入一个新节点
        if (index == 0) {
            addFirst(data);
        } else {//在除节点之外的合法地方插入
            Node curNext = cur.next;
            cur.next = newNode;
            newNode.next = curNext;
            size++;
        }
    }

    //传入下标返回链表中当前下标对应的节点对象
    public Node findCurIndex(int index) {
        Node cur = head;
        while (index > 1) {
            cur = cur.next;
            index--;
        }
        //代码执行这里就表示cur已经指向index对应的节点对象了,返回即可
        return cur;
    }

    //传入下标返回下标的前驱节点
    public Node findPreIndex(int index) {
        Node cur = head;
        while (index > 2) {
            cur = cur.next;
            index--;
        }
        return cur;
    }

    //addLast方法
    public void addLast(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            //代码如果走到这里表示cur已经指向尾节点了,进行插入操作
            cur.next = newNode;
        }
        //更新链表的长度
        size++;
    }

    //addFirst头插入
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }


    //判空的方法
    public boolean isEmpty() {
        return size == 0;
    }

    //输入方法
    public void input() {
        int x = scan.nextInt();
        if (x == 0) {
            //表示插入
            int index = scan.nextInt();
            int data = scan.nextInt();
            insert(x, index, data);
        } else if (x == 1) {
            //表示删除
            int index = scan.nextInt();
            remove(x, index);
        } else {
            return;
        }
    }

    //操作执行次数的方法
    public void operator() {
        int time = scan.nextInt();
        for (int i = 0; i < time; i++) {
            input();
        }
    }

    //遍历的方法
    public void display() {
        if (head == null) {
            return;
        }
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
    }

    //封装的节点类
    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
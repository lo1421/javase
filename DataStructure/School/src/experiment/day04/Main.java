package experiment.day04;

import java.util.Scanner;

class Main {
    public int size;
    public Node head;


    //主方法
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Node head1 = realList(scan);
        Node head2 = realList(scan);
        Node mergeHead = merge(head1, head2);
        displayList(mergeHead);
    }

    //构建链表的方法返回链表的头结点
    public static Node realList(Scanner scan) {
        Node dummy = new Node(-1);
        Node current = dummy;
        while (true) {
            int num = scan.nextInt();
            if (num == -1) {
                break;
            }
            Node newNode = new Node(num);
            current.next = newNode;
            current = newNode;
        }
        return dummy.next;//返回真实的头节点
    }


    //合并两个表的方法
    public static Node merge(Node l1, Node l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        if (l1.val < l2.val) {
            l1.next = merge(l1.next, l2);        //递归l1下一个结点再比较
            return l1;
        } else {
            l2.next = merge(l1, l2.next);        //递归l2下一个结点再比较
            return l2;
        }
    }


    public static void displayList(Node head) {
        if (head == null) {
            System.out.print("NULL");
            return;
        }

        Node cur = head;
        while (cur != null) {
            System.out.print(cur.val);
            cur = cur.next;
            if (cur != null) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    //封装的节点类
    static class Node {
        int val;
        Node next;

        //构造方法
        public Node(int val) {
            this.val = val;
        }
    }
}
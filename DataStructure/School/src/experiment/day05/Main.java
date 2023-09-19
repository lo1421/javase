package experiment.day05;

import java.util.Scanner;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取第一个链表
        Node head1 = null;
        Node tail1 = null;
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            Node newNode = new Node(num);
            if (head1 == null) {
                head1 = newNode;
                tail1 = newNode;
            } else {
                tail1.next = newNode;
                tail1 = newNode;
            }
        }

        // 读取第二个链表
        Node head2 = null;
        Node tail2 = null;
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            Node newNode = new Node(num);
            if (head2 == null) {
                head2 = newNode;
                tail2 = newNode;
            } else {
                tail2.next = newNode;
                tail2 = newNode;
            }
        }

        // 合并两个链表
        Node merged = mergeSortedLists(head1, head2);

        // 输出合并后的链表
        printList(merged);
    }

    public static Node mergeSortedLists(Node l1, Node l2) {
        Node dummy = new Node(-1);
        Node current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null) {
            current.next = l1;
        }
        if (l2 != null) {
            current.next = l2;
        }

        return dummy.next;
    }

    public static void printList(Node head) {
        if (head == null) {
            System.out.println("NULL");
            return;
        }

        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.val).append(" ");
            current = current.next;
        }
        System.out.println(sb.toString().trim());
    }
}

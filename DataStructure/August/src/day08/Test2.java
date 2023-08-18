package day08;
/*
在这里我们又继续模拟一遍，链表数据结构的简单实现，我们模拟的是不带头单向非循环链表。因为这中模式就是LinkedList底层对应的数据结构。
 */
public class Test2 {
    public static void main(String[] args) {
        LinkedList1 linkedList1 = new LinkedList1();
        linkedList1.createLink();
        linkedList1.display();
    }
}
//这是一个封装好了的节点类
class Node{
    public int var ;
    public Node next;
    public Node(int var ){
        this.var = var;
    }
}
class LinkedList1{
Node head ;
    public void  createLink(){
        Node node1 = new  Node(2);
        Node node2 = new  Node(5);
        Node node3 = new  Node(10);
        Node node4 = new  Node(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        head = node1;
    }
    public void display(){
        Node cur = head;
        while(cur!= null){
            System.out.println(cur.var);
            cur = cur.next;
        }
    }
}
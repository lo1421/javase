package day10;

public class Test {
    public static void main(String[] args){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(10);
        myLinkedList.addFirst(23);
        myLinkedList.addLast(2);
        myLinkedList.addLast(53);
        myLinkedList.addLast(34);

        System.out.println( myLinkedList.middleNode().var);
        myLinkedList.display();

    }
}

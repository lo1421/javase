package day10;

public class Test {
    public static void main(String[] args){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(10);
        myLinkedList.addLast(23);
        myLinkedList.addLast(2);
        myLinkedList.addLast(23);
        myLinkedList.addLast(10);
        System.out.println(myLinkedList.chkPalindrome(myLinkedList.head));
    }
}

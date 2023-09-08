package experiment.day02.List;


/*
在测试类当中完成对两个非递减的链表的合并，合并的新链表同样是一个非递减的有序链表
 */
public class MyLinkedListTest {

    public static void main(String[] args) {
        //准备两个非递减的有序链表

        //创建链表对象
        MyLinkedList myLinkedList1 = new MyLinkedList();

        //添加元素
        myLinkedList1.addLast(3);
        myLinkedList1.addLast(6);
        myLinkedList1.addLast(7);
        myLinkedList1.addLast(57);

        //遍历链表
        System.out.println("================（链表一）===================");
        myLinkedList1.display();

        //创建链表对象
        MyLinkedList myLinkedList2 = new MyLinkedList();

        //添加元素
        myLinkedList2.addLast(1);
        myLinkedList2.addLast(4);
        myLinkedList2.addLast(9);
        myLinkedList2.addLast(45);
        myLinkedList2.addLast(51);
        myLinkedList2.addLast(53);
        myLinkedList2.addLast(59);
        myLinkedList2.addLast(67);

        //遍历链表
        System.out.println("================（链表二）==================");
        myLinkedList2.display();


        //调用合并两个非递减的有序链表的方法
        MyLinkedList.ListNode newList = mergeTwoLists(myLinkedList1.head, myLinkedList2.head);

        //遍历新的链表
        MyLinkedList newLinkedList = new MyLinkedList(newList);
        System.out.println("================（新链表）==================");
        newLinkedList.display();
    }

    //合并两个非递减链表，返回一个非递减的有序链表的方法
    public static MyLinkedList.ListNode mergeTwoLists(MyLinkedList.ListNode head1, MyLinkedList.ListNode head2) {
        MyLinkedList.ListNode newHead = new MyLinkedList.ListNode(-1);
        MyLinkedList.ListNode temp = newHead;
        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        if (head1 != null) {
            temp.next = head1;
        }
        if (head2 != null) {
            temp.next = head2;
        }
        return newHead.next;
    }
}

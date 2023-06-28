package june.selfStudy.SingleLinkedList;
/**
 * 以下是一个单向链表数据结构的增删的模拟，然后在测试类中进行对单向链表的储存元素和读取元素进行测试
 */
public class LinkedListTest01 {

    public static void main(String[] args) {
        System.out.println();
    }
}

/**
 * 单向链表的一个管理系统，链表数据结构具有高效插入和取出元素的特点，但是检索元素的效率较低
 */
class LinkedList{

}

/**
 * 模拟链表数据结构的基本单位：节点
 * 单向链表数据结构的基本单位节点中包含两个部分：date域和next域（储存下一个节点的内存地址）
 */
class StuNode<E,K>{
    private int size = 0;
    private E id;
    private K name;
    StuNode<E,K> next;
    public StuNode(E id,K name){
        this.id = id;
        this.name = name ;
    }
    public String toString(){
        return "id:"+id+","+"name:"+name;
    }
    public boolean equals(Object o){
        if(null==o||!(o instanceof StuNode)) return false;
        if(o==this) return true;
        StuNode sn = (StuNode)o;
        return id.equals(sn);
    }
}

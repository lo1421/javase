package june.selfStudy.Gather.Collection;
/*
链表数据结构分为：
 * 单向链表数据结构的节点分为两个部分，第一个是储存数据的属性，一个是储存下一个节点内储存下一个节点的内存地址
 * 双向链表数据结构的节点分为三个部分，第一个是储存上一个 节点的内存地址，第二个是储存数据的属性，第三个是储存下一个节点的内存地址
 */

import java.util.LinkedList;
import java.util.List;

/**
 * 对 Link 链表数据结构的测试，要求是往链表数据结构中添加元素，链表数据结构的基本单元是节点！！！！！
 */
public class LinkedListTest01 {
    public static void main(String[] args) {
        //创建LinkedList集合对象
        List<String> list = new LinkedList<>();//导入集合接口和实现类的包
        //往集合中添加元素
        list.add("a");
        list.add("b");
        //list.add(1);
        //这里报错的原因就是我使用了泛型机制，这样可以让编译器提前检查出是否有类型上的错误，体现了泛型的优点之一：类型安全性
    }
}
/*
要想真正的画好往双向链表数据结构集合中添加元素的内存图，必须查看LinkedList的源代码中调用add方法的具体实现
 */
/*
LinkedList实现类集合中的部分代码
public class LinkedList<E>{
transient int size = 0;       //计算双向链表集合中节点个数

transient Node<E> first;      //Pointer to first node.

transient Node<E> last;       //Pointer to last node.
......


Appends the specified element to the end of this list.
This method is equivalent to addLast.
Params:e – element to be appended to this list
Returns:true (as specified by Collection.add)
翻译：向list末尾中追加指定的元素
这个方法等同于addLast方法
形式参数：e是追加到list中的指定的元素
返回值：true 由Collection.add指定
public boolean add(E e) {
        linkLast(e);
        return true;
    }

......


Links e as last element.
翻译：作为链表集合中的最后一个元素

void linkLast(E e) {
    final LinkedList.Node<E> l = last;
    final LinkedList.Node<E> newNode = new LinkedList.Node<>(l, e, null);
    last = newNode;
    if (l == null)
        first = newNode;
    else
        l.next = newNode;
    size++;
    modCount++;
}
 private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

}
 */

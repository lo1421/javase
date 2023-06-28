package june.selfStudy.Gather.Collection;

public class LinkedList<E>{
    transient int size = 0;       //计算双向链表集合中节点个数

    transient Node<E> first;      //Pointer to first node.

    transient Node<E> last;       //Pointer to last node.



    /*Appends the specified element to the end of this list.
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
*/

  /*  Links e as last element.
            翻译：作为链表集合中的最后一个元素
*/
    void linkLast(E e) {
        final LinkedList.Node<E> l = last; //将链表数据结构中的最后一个节点的地址赋值给l变量，l变量就可以指向链表中的尾节点
        final LinkedList.Node<E> newNode = new LinkedList.Node<>(l, e, null);//创建一个新的节点，使用内部类的语法
        last = newNode;//将新创建的节点的内存地址赋值给链表数据结构指向最后一个节点的引用，这样新节点就被储存到链表的数据结构中了
        //并且成为了链表的新的为节点，而此时l指向的就是旧节点
        /** linkLast方法中：
        *上述就是存放新节点到链表中并且成为新的尾节点
        *面就是将旧节点的第三个属性指向新节点，将新节点的第一个属性指向旧节点（双向链接）！！！！！！！！
        */
        if (l == null)
            //此时的l变量应该保存链表数据结构中的尾节点的内存地址，但是如果l为空的h话则表示此时的链表中一个节点都没有。
            // 如果链表数据结构中一个节点都没有的话，那么就进入if语句
            first = newNode;//然后将新创建的节点的内存地址赋值给链表数据结构中的指向头节点的引用，这样链表中的指向头节点的引用就不为空了，
        //则表示储存了一个节点到链表数据结构当中，那么此时添加的newNode就是链表中的新节点，既是头节点有时尾节点
        else//若能执行else语句，则表示链表中存在节点，l变量就保存着链表中的尾节点的内存地址，这样就可以通过l引用去访问链表中的尾节点
            l.next = newNode;//通过l变量访问链表中的尾节点的第三个属性：指向下一个节点的变量，这个变量保存了下一个节点的内存地址。
        //访问之后，然后将新创建的节点（已经添加到链表中的新节点）的内存地址赋值给链表中旧节点的第三个属性
        size++;//起始值为0，每添加一个新的节点进去size就+1
        //modCount++;
    }

    /**
     * 这是一个定义在LInkedList实现类中的静态内部类，可以用来创建新的节点对象，是一个泛型类
     * 表明这个类中增强了通用性等等
     * @param <E>
     */
    private static class Node<E> {
        E item;//储存的数据
        Node<E> next;//指向下一个节点的引用
        Node<E> prev;//指向下一个节点的引用

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

}
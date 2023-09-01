package TextReport;

import java.util.Arrays;

/*
我们现在模拟的这个栈数据结构是存储顺序存储的方式，当然我们也可以使用链式存储方法来存储
如果用链式存储方式来存储，我们可以把链表来模拟栈数据结构


栈拿链表存储方式存储
1、单向链表
如果采用头插法和头删法来模拟栈的压栈和弹栈，那么压栈和弹栈的时间复杂度都是O(1),这是因为我们不用遍历整个链表
如果采用尾插法和尾删法来模拟栈的压栈和弹栈，那么压栈和弹栈的时间复杂度都是O(n),这是因为我们单向链表只有一个方向，必须先遍历到尾节点才可以进行增删操作
2、双向链表
无论是头插还是尾插，压栈和弹栈的时间复杂度都是O(1)
 */

/*
栈数据结构的逻辑结构是线性结构，物理结构（逻辑结构）是顺序存储
栈数据结构的数据特点是：先进后出

栈数据结构可以使用链表数据结构来实现，无论是单向链表还是双向链表都是可以模拟栈数据结构的。
栈数据结构的实现也是非常简单的，因为不需要指定位置增删改查。而只有栈顶元素是活跃的，所以当我去查看java底层stack数据结构的时候就会
发现其实里面只有几种方法，很简单。
 */
public class MyStack {
    //栈数据结构中由于只有只能位于栈顶元素才是活跃的，而且无论是添加元素还是弹出元素我们都是针对栈顶元素进行操作
    //那么我们就需要定义一个指针，是永远指向栈顶元素的，而我们的栈的有效长度usedSize其实刚好是可以用来表示栈顶元素的
    //其实stack的底层依旧是一个数组
    public int[] elem;
    //当前栈中，存储的有效数据的个数用usedSize来表示，而这个usedSize也可以用来表示栈顶元素的上面一个位置，也就是可以用来存放数据元素的下标。
    public int usedSize;

    //默认容量
    public static final int DEFAULT_CAPACITY = 10;

    /**
     * 初始化，为栈数据结构的底层数据初始化容量
     */
    public MyStack() {
        elem = new int[DEFAULT_CAPACITY];
    }

    /**
     * 压栈，添加元素到栈中
     *
     * @param val 添加的元素
     */
    public void push(int val) {
        //这里需要判断链表是否已经满了，如果满了需要扩容
        if (isFull()) {
            elem = Arrays.copyOf(elem, 2 * elem.length);
        }
        elem[usedSize] = val;
        usedSize++;
    }

    /**
     * 弹栈，将栈顶元素弹出
     *
     * @return 返回栈顶元素，可以接收，也可以不接收，反正主要目的是删除栈顶元素
     */
    public int pop() {
        //弹出栈中元素的时候，需要判空，如果是空的，那么就自定义一个异常，表示无法从空的栈中弹出元素
        /*
        如果栈中存储的是引用数据类型，那么除了usedSize--，还需要把elem[usedSize-1] = null(把栈顶元素滞空)
         */
        int oldVal = elem[usedSize - 1];
        if (isEmpty()) {
            throw new EmptyStackException("栈空，弹栈失败");
        }
        usedSize--;
        return oldVal;
    }

    /**
     * 获取栈顶元素，但是不删除
     *
     * @return 返回栈顶元素
     */
    public int peek() {
        return elem[usedSize - 1];
    }

    /**
     * 判断当前栈是否是满的
     *
     * @return 若满则返回true，若未满则返回false
     */
    public boolean isFull() {
        return usedSize == elem.length;
    }

    /**
     * @return 若为空则返回true，若未满则返回false
     */
    public boolean isEmpty() {
        return usedSize == 0;
    }

    /**
     * 获取栈的大小
     *
     * @return 返回栈的size
     */
    public int getSize() {
        return usedSize;
    }


}


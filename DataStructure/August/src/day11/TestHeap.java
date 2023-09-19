package day11;

import java.util.Arrays;

public class TestHeap {
    //堆数据结构底底层用一维数组来存储
    public int[] elem;
    //当前堆的有效的数据个数
    public int usedSize;

    public TestHeap() {
        this.elem = new int[10];
        this.usedSize = 0;
    }

    //数组初始化
    public void initialArray(int[] array) {
        elem = Arrays.copyOf(array, array.length);
        usedSize = elem.length;
    }


    //======================构建堆=======================
    /*
    解析:
一.    由于初始化的二叉树一定是完全二叉树,并且底层的一维数组就是这个初始化的数组,也就是完全二叉树层序遍历的结果
    那么我们通过二叉树的性质结合数组可以知道这样几个公式
    将元素存储到数组后,可以根据二叉树的性质对树进行还原,假设i为节点在数组的下标,则有:
    - 如果i 为0,则i表示的节点为根节点,否则节点的双亲节点为(i-1)/2
    - 如果2*i+1小于节点个数,则节点i的左孩子下标为2*i +1,否则没有左孩子
    - 如果2*i+1小于节点个数,则节点 i的右孩子下标为2*i+2,否则没有右孩子
二.
    ①由于我们要使用向下调整(从每棵子树的根节点开始调整)
    所以我们第一步就是要确定最后一棵子树的根节点在数组中的位置
    如何确定最后一棵子树的最后一个节点(孩子节点)在数组中的位置:下标为 len-1
    确定孩子节点之后(假设为i),那么其父节点在数组中的位置:下标为(i-1)/2
    总结:最后一棵子树的根节点 下标= (len-1-1)/2

    ②如何确定下一棵子树的根节点:当前根节点-1

    ③最终结论:主要去写每棵子树的调整过程即可

     */
    //构建堆数据结构 (大根堆)
    public void createHeap() {
        //通过循环从每棵子树的根节点开始调整
        for (int parent = (usedSize - 1 - 1) / 2; parent >= 0; parent--) {
            shiftDown(parent, elem.length);
        }
    }

    /**
     * 实现向下调整(针对当前子树进行调整),调整之后的结果就是这个子树变成了大根数
     *
     * @param parent 每棵子树的根节点的下标
     * @param len    每棵子树的结束位置
     */
    private void shiftDown(int parent, int len) {
        //定义一个指向左孩子节点的局部变量
        int child = 2 * parent + 1;
        //至少要有左孩子(当前的根节点如果没有左孩子也就不用进行调整了)
        while (child < len) {
            //判断 左孩子 和 右孩子 的大小,然后让child变量保存最大的那个值的下标
            if (child + 1 < usedSize && elem[child] < elem[child + 1]) {
                child++;//进入这个if语句的前提是要有右孩子,而且这个右孩子的数值大于左孩子,不然child就不用更新++
            }
            //左右判断完之后就要开始判断孩子当中最大值和父母的比较,因为如果父母比较小,就需要子承父位
            if (elem[child] > elem[parent]) {
                //单独封装一个交换数组中两个指定下标元素的位置
                swap(elem, child, parent);
                //这里就表示把父亲从根节点移动到较大较大数值孩子的位置了,由于这个时候父亲降级了,那么就必须保证父亲现在降级之后的位置是否能够占的稳
                //稳不稳是用什么决定的?就是继续和子孙比较
                parent = child;
                child = 2 * parent + 1;
            } else {
                //这里是父亲没有被替代的意思,那么就不用进行任何操作,因为地位足够稳,是最大的数值
                break;//退出循环即可
            }
        }
    }

    //交换数组当中指定下标的两个元素的位置
    private void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    //遍历数组的方法
    public void display() {
        for (int x :
                elem) {
            System.out.print(x + " ");
        }
    }


    //======================往堆中插入数据=======================

    //插入方法,往堆中插入某个数据
    public void offer(int x) {
        //默认往堆最后的位置插入
        //判断堆是否已经满了,若满了,则要求扩容
        if (isFull()) {
            elem = Arrays.copyOf(elem, elem.length * 2);
        }
        //若满已经扩容,若不满没有扩容(插入元素)
        elem[usedSize] = x;
        usedSize++;
        //要求堆的性质不能改变
        //向上调整的方法
        shiftUp(usedSize - 1);//把已经插入的节点作为孩子节点传过去
    }

    private void shiftUp(int child) {
        //可以通过传过来的孩子节点通过公式算出父亲节点
        int parent = (child - 1) / 2;
        //最差情况导致到child>0即可
        while (parent > 0) {
            if (elem[child] > elem[parent]) {
                swap(elem, child, parent);
                //交换完之后要更新parent 和 child的指向
                child = parent;
                parent = (child - 1) / 2;
            } else {
                break;
            }
        }
    }

    //判满的方法
    public boolean isFull() {
        return usedSize == elem.length;
    }

    //=================堆的删除======================
    public int poll() {
        if (isEmpty()) {
            return -1;
        }
        //记录一下呗删除元素的值
        int old = elem[0];
        //交换堆的根节点和堆的尾节点
        swap(elem, 0, usedSize - 1);
        //更新usedSize的大小(也就是更新堆的有效元素个数),代表已经删除堆根的元素了
        usedSize--;
        //交换元素,保证交换之后不违背堆的性质,所以要将0下标的元素向下调整
        shiftDown(0, usedSize);
        return old;
    }

    private boolean isEmpty() {
        return usedSize == 0;
    }
}

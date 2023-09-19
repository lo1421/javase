package Personally;

import experiment.day02.List.MyArrayList;

import java.util.Arrays;

public class ListTest {
    public static void main(String[] args) {
        MyList list = new MyList();


    }
}

class MyList {
    int[] elem;
    int usedSize;

    static final int DEFAULT_CAPACITY = 10;

    public MyList() {
        elem = new int[DEFAULT_CAPACITY];
    }

    public void add(int index, int val) {
        if (index < 0 || index > usedSize) {
            throw new ArrayIndexOutOfBoundsException("非法下标");
        }
        if (usedSize == elem.length) {
            elem = Arrays.copyOf(elem, 2 * elem.length);
        }

        for (int i = usedSize - 1; i >= index; i--) {
            elem[i + 1] = elem[i];
        }
        elem[index] = val;
        usedSize++;

    }

    //
    public void remove() {

    }

    public void display() {
        for (int i = 0; i < usedSize - 1; i++) {
            System.out.print(elem[i] + " ");
        }
    }

    /*
    假设顺序表L中的元素按从小到大的次序排列，编写算法删除顺序表中“多余”的数据元素，即操作之后的顺序表中所有元素的值都不相同，
    要求时间尽可能的少；并对顺序表A（1，1，2，2，2，3，4，5，5，5，6，6，7，7，8，8，8，9）模拟执行本算法，并统计移动元素的次数。
     */

}

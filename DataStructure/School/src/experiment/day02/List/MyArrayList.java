package experiment.day02.List;

import java.util.Arrays;

public class MyArrayList {
    //    存放数据的数组
    public int[] elem;
    //    记录数组的有效长度
    public int usedSize;
    //    常量，用来给数组初始化容量
    public static final int DEFAULT_CAPACITY = 5;

    //    构造方法
    public MyArrayList() {
        this.elem = new int[DEFAULT_CAPACITY];
    }

    public MyArrayList(int defaultSize) {
        this.elem = new int[defaultSize];
    }

    //    打印顺序表的方法（顺序表中有几个有效元素就打印几个有效元素）
    public void display() {
        for (int i = 0; i < usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

    //    输入（新增加元素，默认在顺序表的最后一个元素的下一个位置上新增）
    public void add(int data) {
        try {
            if (isFull()) {
                elem = Arrays.copyOf(elem, 2 * elem.length);
            }
        } catch (NegativeArraySizeException e) {
            e.printStackTrace();
        }
        elem[usedSize++] = data;
    }

    //    在指定位置索引为pos新增元素
    public void addPos(int data, int pos) {
        //先判断下标是否合法
        try {
            checkedAddPos(pos);
            if (isFull()) {
                elem = Arrays.copyOf(elem, 2 * elem.length);
            }
            for (int i = usedSize - 1; i > pos; i--) {
                elem[i + 1] = elem[i];
            }
            elem[pos] = data;
            usedSize++;
        } catch (PosIndexIllegalException e) {
            e.getMessage();
        }

    }

    //判断顺序表中是否包含某个元素
    public boolean contains(int data) {
        for (int i = 0; i < usedSize; i++) {
            if (data == elem[i]) {
                return true;
            }
        }
        return false;
    }

    //返回某个元素的在容器中的索引
    public int indexOf(int find) {
        for (int i = 0; i < usedSize; i++) {
            if (find == elem[i]) {
                return i;
            }
        }
        return -1;
    }


    //获取指定下标pos的值
    public int getPos(int pos) {
        int retVal = -1;
        //检查pos是否合法
        try {
            checkGetPos(pos);
            retVal = elem[pos];
            ;
        } catch (PosIndexIllegalException e) {
            e.getMessage();
        }
        return retVal;
    }

    //      删除第一次出现关键字key的方法
    public void remove(int key) {
        //先获取第一次出现key元素的下标
        int index = indexOf(key);
        if (index == -1) {
            System.out.println("没有找到你要删除的数据！");
            return;
        }
        for (int i = index; i < usedSize - 1; i++) {
            elem[i] = elem[i + 1];
        }
        usedSize--;
    }

    /**
     * removeAll 方法删除整个顺序表
     */
    public void removeAll() {
        elem = new int[5];
        usedSize = 0;
    }

    //    判满方法
    private boolean isFull() {
        return usedSize == elem.length;
    }

    //    判断顺序表的下标是否合法
    private void checkedAddPos(int pos) {
        if (pos < 0 || pos > usedSize) {
            throw new PosIndexIllegalException();
        }
    }

    //   判断下标pos是否合法
    private boolean checkGetPos(int pos) {
        if (pos < 0 || pos >= usedSize) {
            return false;
        }
        return true;
    }

    /**
     * 获取顺序表的个数
     *
     * @return 返回数组的大小
     */
    public int size() {
        return usedSize;
    }


}


class PosIndexIllegalException extends RuntimeException {
    public PosIndexIllegalException() {

    }

    public PosIndexIllegalException(String msg) {
        super(msg);
    }
}
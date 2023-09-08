package experiment.day02.List;

public class MyArrayListTest {
    public static void main(String[] args) {
        //准备两个顺序表（非递减的顺序表）

        MyArrayList myArrayList1 = new MyArrayList();
        myArrayList1.add(1);
        myArrayList1.add(5);
        myArrayList1.add(10);
        myArrayList1.add(13);

        myArrayList1.display();
        ;

        MyArrayList myArrayList2 = new MyArrayList();

        myArrayList2.add(6);
        myArrayList2.add(11);
        myArrayList2.add(12);
        myArrayList2.add(33);
        myArrayList2.add(44);
        myArrayList2.add(47);
        myArrayList2.add(52);
        myArrayList2.add(66);

        myArrayList2.display();
        ;


        //调用merge方法

        MyArrayList mergeArrayList = merge(myArrayList1, myArrayList2);

        //调用display方法
        mergeArrayList.display();

    }

    /**
     * 合并两个升序的非递减顺序表，并返回新的合成的顺序表
     *
     * @param list1 按值非递减顺序表一
     * @param list2 按值非递减顺序表二
     * @return 返回一个新的合并了的链表
     */
    public static MyArrayList merge(MyArrayList list1, MyArrayList list2) {
        MyArrayList newList = new MyArrayList(50);
        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.elem[i] < list2.elem[j]) {
                newList.elem[newList.usedSize] = list1.elem[i];
                i++;
                newList.usedSize++;
            } else {
                newList.elem[newList.usedSize] = list2.elem[j];
                j++;
                newList.usedSize++;
            }
        }
        while (i < list1.size()) {
            newList.elem[newList.usedSize] = list1.elem[i];
            i++;
            newList.usedSize++;
        }
        while (j < list2.size()) {
            newList.elem[newList.usedSize] = list2.elem[j];
            newList.usedSize++;
            j++;
        }
        return newList;
    }

    /*public static void main1(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        //增
        myArrayList.add(10);
        myArrayList.add(23);
        myArrayList.add(45);
        myArrayList.add(89);
        //遍历顺序表
        myArrayList.display();

        //删
        myArrayList.remove(10);
        //遍历顺序表
        myArrayList.display();

        //查询指定元素，并返回其下标
        int index = myArrayList.indexOf(23);
        System.out.print("23在顺序表表中的索引为：" + index);
        System.out.println();

        //查询（查询顺序表中是否包含某个元素
        boolean b = myArrayList.contains(89);
        System.out.println(b);

        //zeng（往数组指定的下标添加元素）
        myArrayList.addPos(67, 2);
        //遍历顺序表
        myArrayList.display();

        //获取顺序表的大小
        System.out.print("顺序表的大小为：" + myArrayList.size());
    }

*/
}

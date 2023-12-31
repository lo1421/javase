package experiment.day02.List;

public class MyArrayListTest {
    public static void main(String[] args) {
       /* //准备两个顺序表（非递减的顺序表）

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
*/

        MyArrayList myArrayList2 = new MyArrayList();

        myArrayList2.add(1);
        myArrayList2.add(1);
        myArrayList2.add(2);
        myArrayList2.add(2);
        myArrayList2.add(2);
        myArrayList2.add(3);
        myArrayList2.add(4);
        myArrayList2.add(5);
        myArrayList2.add(5);
        myArrayList2.add(5);
        myArrayList2.add(6);
        myArrayList2.add(6);
        myArrayList2.add(7);
        myArrayList2.add(7);
        myArrayList2.add(8);
        myArrayList2.add(8);
        myArrayList2.add(8);
        myArrayList2.add(9);
        MyArrayListTest myArrayListTest = new MyArrayListTest();
        int num = myArrayListTest.distinct(myArrayList2.elem);

        System.out.println(num);
        myArrayList2.display();

//1，1，2，2，2，3，4，5，5，5，6，6，7，7，8，8，8，9
    }

    /**
     * 合并两个升序的非递减顺序表，并返回新的合成的顺序表
     *
     * @param LA 按值非递减顺序表一
     * @param LB 按值非递减顺序表二
     * @return 返回一个新的合并了的链表
     */
    public static MyArrayList merge(MyArrayList LA, MyArrayList LB) {
        MyArrayList newList = new MyArrayList(2000);
        int i = 0, j = 0;
        while (i < LA.size() && j < LB.size()) {
            if (LA.elem[i] < LB.elem[j]) {
                newList.elem[newList.usedSize] = LA.elem[i];
                i++;
                newList.usedSize++;
            } else {
                newList.elem[newList.usedSize] = LB.elem[j];
                j++;
                newList.usedSize++;
            }
        }
        while (i < LA.size()) {
            newList.elem[newList.usedSize] = LA.elem[i];
            i++;
            newList.usedSize++;
        }
        while (j < LB.size()) {
            newList.elem[newList.usedSize] = LB.elem[j];
            newList.usedSize++;
            j++;
        }
        return newList;
    }

    public int distinct(int[] A) {
        int t = 0;
        for (int i = 0; i < A.length; i++) {
            if (i == 0 || A[i] != A[i - 1]) A[t++] = A[i];
        }
        return t;
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

package experiment.day02.List;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // mergeSortedLists();
        main1();
    }

    public static void mergeSortedLists() {
        Scanner scanner = new Scanner(System.in);

        // 读取 LA 的长度和元素
        int lenA = scanner.nextInt();
        ArrayList<Integer> LA = new ArrayList<>();
        for (int i = 0; i < lenA; i++) {
            LA.add(scanner.nextInt());
        }

        // 读取 LB 的长度和元素
        int lenB = scanner.nextInt();
        ArrayList<Integer> LB = new ArrayList<>();
        for (int i = 0; i < lenB; i++) {
            LB.add(scanner.nextInt());
        }

        // 合并 LA 和 LB 到 LC
        ArrayList<Integer> LC = new ArrayList<>();
        int i = 0, j = 0;
        while (i < lenA && j < lenB) {
            int elementA = LA.get(i);
            int elementB = LB.get(j);
            if (elementA <= elementB) {
                LC.add(elementA);
                i++;
            } else {
                LC.add(elementB);
                j++;
            }
        }

        // 将剩余元素添加到 LC
        while (i < lenA) {
            LC.add(LA.get(i));
            i++;
        }
        while (j < lenB) {
            LC.add(LB.get(j));
            j++;
        }

        // 输出合并后的结果
        for (int x : LC) {
            System.out.print(x + " ");
        }
    }

    //删除顺序表中指定区间的元素
    public static void main1() {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        //输入数据的个数
        int len = s.nextInt();
        //输入数据
        for (int i = 0; i < len; i++) {
            list.add(s.nextInt());
        }

        //输入需要删除的数据的区间
        int a = s.nextInt();
        int b = s.nextInt();

        //创建一个新的顺序表，用来存储删除之后剩下的元素
        ArrayList<Integer> result = new ArrayList<>();
        // 遍历原始列表，只添加不在指定区间内的元素到新列表
        for (int v : list) {
            if (v < a || v > b) {
                result.add(v);
            }
        }

        // 输出新的顺序表
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i < result.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}

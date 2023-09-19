package experiment;

import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] s) {
        Main2 main2 = new Main2();
        //   main2.merge();
        main2.main3();
    }

    public void merge() {
        //使用顺序表完成有序顺序表的合并
        Scanner scan = new Scanner(System.in);

        int lenA = scan.nextInt();
        ArrayList<Integer> LA = new ArrayList<>();
        for (int i = 0; i < lenA; i++) {
            LA.add(scan.nextInt());
        }

        int lenB = scan.nextInt();
        ArrayList<Integer> LB = new ArrayList<>();
        for (int i = 0; i < lenB; i++) {
            LB.add(scan.nextInt());
        }

        int i = 0;
        int j = 0;
        ArrayList<Integer> LC = new ArrayList<>();

        while (i < lenA && j < lenB) {
            if (LA.get(i) < LB.get(j)) {
                LC.add(LA.get(i));
                i++;
            } else {
                LC.add(LB.get(j));
                j++;
            }
        }
        while (i < LA.size()) {
            LC.add(LA.get(i));
            i++;
        }
        while (j < LB.size()) {
            LC.add(LB.get(j));
            j++;
        }

        for (int x :
                LC) {
            System.out.print(x + " ");
        }
    }

    public void main3() {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(len);

        for (int i = 0; i < len; i++) {
            arr.add(scan.nextInt());
        }

        ArrayList<Integer> newArr = new ArrayList<>();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int i = 0;
        for (int x :
                arr) {
            if (x < a || x > b) {
                newArr.add(x);
            }
        }
        for (int j = 0; j < newArr.size(); j++) {

            System.out.print(newArr.get(j));
            if (i < newArr.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}

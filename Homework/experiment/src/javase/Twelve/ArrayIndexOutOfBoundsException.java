package javase.Twelve;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(200);
        }

        System.out.println("输入你想在数组中搜索的索引，我将告诉你这个索引对应的是什么值：");
        Scanner scanner = new Scanner(System.in);
        try {
            int index = scanner.nextInt();
            if (index >= 0 && index < arr.length) {
                System.out.println("arr[" + index + "] = " + arr[index]);
            } else {
                System.out.println("下标越界");
            }
        } catch (InputMismatchException e) {
            System.out.println("输入的值不是整数");
        }
    }
}

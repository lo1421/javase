package javase.Three;
import java.util.Scanner;
/*
3.3编写程序，要求用户从键盘输入4个整数，找出其中的最大值和最小值并打印输出，要求尽可能少的使用if条件语句
提示4条if条件语句就够了
 */
public class MaxAndMin {
    public static void main(String[] args) {
        //其实定义一个数组就可以了，然后遍历这个数组，找出其中的最大值和最小值就可以了
        int[] arr = new int[4];
        Scanner s = new Scanner(System.in);
        System.out.println("请输入四个整数：");
        for (int i = 0; i < arr.length; i++) {
            arr[i]  = s.nextInt();
        }
        int min = 0;
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }if (arr[i] > arr[max]) {
                max = i;
            }
        }
        System.out.println("min:" + arr[min]);
        System.out.println("max:" + arr[max]);
    }
}


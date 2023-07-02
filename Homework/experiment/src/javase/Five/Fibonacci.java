package javase.Five;
/*
编写打印输出Fibonacci数列的前而20个数，要求使用数组储存fibonacci数
 */
public class Fibonacci {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = calculateFib(i + 1);
            System.out.print(arr[i] + " ");
        }
    }
    public static int calculateFib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return calculateFib(n - 1) + calculateFib(n - 2);
        }
    }
}


package javase.Four;
/*
编写程序，使用递归方法打印输出Fibonacci数列的前20项，Fibonacci数列是第一个和第二个都是1，以后得每个数都是前两个数之和，用公式
表示为：f1=f2=1,fn=fn-1+fn-2(n>=3).要求使用方法计算Fibonacci数，格式如下：
public static long fib(int n)
 */

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci 数列的前 20 项：");
        for (int i = 1; i <= 20; i++) {
            long result = fib(i);
            System.out.print(result + " ");
        }
    }

    public static long fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}

package August;

import java.util.Scanner;

//编写一个程序，计算1到N之间所有整数的和，其中N是用户输入的正整数。
public class Test2 {
    public static void main(String[] args) {
            sumN();
    }
    public static void  sumN(){
        Scanner s = new Scanner(System.in);
        System.out.println("请从键盘输入一个整数：");
        int N  = s.nextInt();
        int sum = 0;
        for (int i = 1; i<=N; i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}

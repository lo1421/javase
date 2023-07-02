package javase.Three;

import java.util.Scanner;

/*
编写程序，要求用户从键盘输入一个正整数，判断该数是奇数还是偶数
 */
public class Judge {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("输入一个正整数：");
        int n = s.nextInt();
        if(n/2==0){
            System.out.println(n+"是奇数");
        }else
            System.out.println(n+"是偶数");
    }
}

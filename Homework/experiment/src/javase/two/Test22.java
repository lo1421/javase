package javase.two;

import java.util.Scanner;

/*
2.2编写程序，从键盘中输入圆柱底面半径和高，计算并输出圆柱的体积。
 */
public class Test22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入圆柱底面的半径：");
        int r = s.nextInt();
        System.out.print("请输入圆柱底面的高：");
        int h = s.nextInt();
        System.out.println("我将为你计算该圆柱的体积。。。。。");
        System.out.print("圆柱体的体积为V="+3.14*r*r*h);
    }
}

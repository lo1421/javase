package javase.two;

import java.util.Scanner;

/*
2.1编写程序，从键盘上输入一个double类型的华氏温度，然后将其转换为摄氏温度输出
转换公式为：摄氏度=（5/9）*(华氏度-32).
 */
public class Test21 {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        System.out.print("请输入一个double类型的华氏温度，我将为你转换为摄氏温度：");
        double t = s.nextDouble();
        System.out.println("华氏度："+t+"==>"+"摄氏度:"+((5/9)*(t-32)));
    }
}

package experiment.day01;

import java.util.Scanner;

//测试封装的复数类，实现负数的四则运算
public class ComplexTest {
    //这里我们可以采取从键盘中输入复数的实部和虚部
    public static void main(String[] args) {
        double realPart ;
        double imagePart ;
        Scanner s = new Scanner(System.in);
        System.out.print("输入第一个复数的实部：");
        realPart = s.nextDouble();
        System.out.print("输入第一个复数的虚部：");
        imagePart = s.nextDouble();
        Complex complex1 = new Complex(realPart,imagePart);
        System.out.print("输入第二个复数的实部：");
        realPart = s.nextDouble();
        System.out.print("输入第二个复数的虚部：");
        imagePart = s.nextDouble();
        Complex complex2 = new Complex(realPart,imagePart);
        //测试复数的加减乘除
        System.out.println("加法："+ complex1.add(complex2));
        System.out.println("减法："+complex1.sub(complex2));
        System.out.println("乘法："+complex1.mul(complex2));
        System.out.println("除法："+complex1.division(complex2));
    }
}
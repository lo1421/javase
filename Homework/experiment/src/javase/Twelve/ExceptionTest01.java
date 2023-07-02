package javase.Twelve;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
编写程序，要求从键盘输入一个double型的圆半径，计算并输出其面积，测试当输入
的数据不是double类型的数据（如字符串“abc”）会抛出什么异常？试用异常的处理方法修改程序。
 */
public class ExceptionTest01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /*System.out.println("请输入一个double型的圆半径：");
        double d = s.nextDouble();
        请输入一个double型的圆半径：
        abc
        Exception in thread "main" java.util.InputMismatchException
         */
        //这是运行时的异常，由于是在main方法中了，所以我们还是选择捕捉这个异常
        try {
            System.out.println("请输入一个double型的圆半径：");
            double d = s.nextDouble();
        }catch(InputMismatchException e){
            e.printStackTrace();
        }
        System.out.println("0k能执行到这！");
    }
}

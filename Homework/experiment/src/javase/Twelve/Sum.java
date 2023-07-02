package javase.Twelve;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("请输入第一个整数：");
                num1 = scanner.nextInt();
                System.out.print("请输入第二个整数：");
                num2 = scanner.nextInt();
                validInput = true; // 输入有效，退出循环
            } catch (InputMismatchException e) {
                System.out.println("输入不正确，请重新输入整数。");
                scanner.nextLine(); // 清除输入缓冲区
            }
        }

        int sum = num1 + num2;
        System.out.println("两个整数的和为：" + sum);
    }
}

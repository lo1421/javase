package javase.Six;
import java.util.Scanner;
/*
编写程序，提示用户输入一个字符串，显示它的长度、第一个字符和最后一个字符。
 */
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String string = s.nextLine();
//直接调用类库中String类中的方法
        System.out.println("输入字符串的长度：" + string.length());
        System.out.println("输入字符串的第一个字符：" + string.charAt(0));
        System.out.println("输入字符串的最后一个字符：" + string.charAt(string.length() - 1));
    }
}

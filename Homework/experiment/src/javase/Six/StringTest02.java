package javase.Six;

import java.util.Scanner;

/*
提示用户输入两个字符串，检测第二个字符串是否是第一个字符串
 */
public class StringTest02 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String string1 = s.nextLine();
        System.out.println("请再输入一个字符串：");
        String string2 = s.nextLine();
        //比较两个字符是否相同
        System.out.println(string1.equals(string2)?"相同":"不同");
    }
}

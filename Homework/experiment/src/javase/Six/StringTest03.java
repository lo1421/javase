package javase.Six;

import java.util.Scanner;
/*
编写一个加密的程序，要求从键盘输入一个字符串，然后输出加密后的字符串。加密的规则是对每个字母转换为下一个字母表示，
原来是a转换为b，原来是B转换为C。小写的z转换为小写的a，大写的Z转换位大写的A。
 */
import java.util.Scanner;

public class StringTest03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个字符串：");
        String input = scanner.nextLine();

        String encrypted = encryptString(input);
        System.out.println("加密后的字符串：" + encrypted);
    }
    public static String encryptString(String input) {
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                if (c == 'z') {
                    c = 'a';
                } else if (c == 'Z') {
                    c = 'A';
                } else {
                    c = (char) (c + 1);
                }
            }
            encrypted.append(c);
        }
        return encrypted.toString();
    }
}

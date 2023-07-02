package javase.Three;

import java.util.Scanner;

/*
编写一个程序：要求用户从键盘上输入一个年份，判断该年份是否是闰年，符合下面的条件之一就表示年份为闰年：
1.能被4整除，但不能被100整除
2.能被400整除
 */
public class Judge2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("输入一个正规的年份：");
        int year = s.nextInt();
        if((year/4==0&&year/100!=0)||year/400==0){
            System.out.println(year+"是闰年");
        }
        else
            System.out.println(year+"不是闰年");
    }
}

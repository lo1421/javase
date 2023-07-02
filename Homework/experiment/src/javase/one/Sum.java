package javase.one;

import java.util.Scanner;

/*
1.2 编写程序，计算1+2+3+4+5+6+7+8+10的结果
 */
public class Sum {
    private Scanner input ;

    public static void main(String[] args) {
        Sum s = new Sum();
        s.input =  new Scanner(System.in) ;
        System.out.print("请输入您想计算的从1累加到n的终止数n：");
        int n = s.input.nextInt();
        int sum = 0;
        for (int i = 1; i <=n ; i++) {
                     sum+=i;
        }
        System.out.println("计算的结果为："+sum);

    }
}

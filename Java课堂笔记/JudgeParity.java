//输入一个整数判断奇偶
import java.util.Scanner;
public class JudgeParity{
	public static void main(String[] args){
		System.out.println("请输入一个整数：");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		
		if(num%2==0)
			System.out.println("这是一个偶数"+num);
		else
			System.out.println("这是一个奇数"+num);
	}
}
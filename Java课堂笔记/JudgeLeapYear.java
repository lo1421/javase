//闰年的判断
import java.util.Scanner;
public class JudgeLeapYear{
	public static void main(String[] args){
	System.out.println("输入一个年份");
	Scanner input=new Scanner(System.in);
	int year=input.nextInt();
	if(year%4==0&&year%100!=0||year%400==0)
		System.out.println("这是闰年");
	else 
		System.out.println("这不是闰年");
	
	}
}
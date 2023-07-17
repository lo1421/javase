//输入四个整数，输出最大值和最小值
import java.util.Scanner;
public class JudgeSize{
	public static void main(String[] args){
		System.out.println("请输入四个整数:");
		Scanner input = new Scanner(System.in);
		int max,min,i;
		int a[] = new int[4];
		max=a[0];
		min=a[0];
		for(i=0;i<4;i++)
           {a[i]=input.nextInt();}
	    for(i=0;i<4;i++){
			if(a[i]>max) {max=a[i];} 
			   
			if(min>a[i]) {min=a[i];}
		}
		System.out.println("其中最大的数是："+ max);
		System.out.println("其中最小的数是："+ min);
	}
	
}
/*
计算1~n的和
1、只使用循环计算1~n的和
2、编写一个方法计算1~n的和，然后调用该方法
3、使用方法的递归计算1~n的和
*/
/*
public class RecursionTest{
	public static void main(String[] args){
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("请输入一个数，我将为你计算1+2+...+这个数：");
		int n = input.nextInt();
		int sum = 0;
		for(int i=1;i<=n;i++){
			sum+=i;
		}
		System.out.println("1+2+3+...+"+n+"="+sum);
		
	}
}
*/
/*
public class RecursionTest{
	public static void main(String[] args){
		//调用sum方法
		java.util.Scanner input =new java.util.Scanner(System.in);
        System.out.print("请输入一个数，我将为你计算1+2+...+这个数：");
		int n = input.nextInt();
		sum(n);
		
	}
	public static int sum(int x){
		int y = 0;
		for(int i=1;i<=x;i++){
			y+=i;
		}
		System.out.println(y);
		return y;
	}
}
*/
/*
public class RecursionTest{
	public static void main(String[] args){
		java.util.Scanner input= new java.util.Scanner(System.in);
		System.out.print("请输入一个数，我将为你计算1+2+...+这个数");
		int n = input.nextInt();
		int result = sum(n);
		System.out.println("1+2+...+n="+result);
	}
	//采用从n、n-1、n-2递减的方式求解
	//通过方法的递归解决这个问题
	public static int sum(int n){
		if(n==1){
			return 1;
		}
         //能进行到这一步表明你！=0
		 return n+sum(n-1);
		
	}
}
*/

//如果计算1*2*3...*n的阶乘，采用方法的递归该怎么做?
/*
public class RecursionTest{
	public static void main(String[] args){
		//从键盘中扫描一个对象
		java.util.Scanner input =new java.util.Scanner(System.in);
		//提醒用户输入n
		System.out.print("从键盘中输入一个您想求阶乘的数：");
		int n =input.nextInt();
		//调用您编写的方法
		int result = factorial(n);
		System.out.println(result);
	}
	public static int factorial(int n){
		if(n==1){
			return 1;
		}
		return n*factorial(n-1);
		
	}
}
*/
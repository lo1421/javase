/*
编写一个方法，求整数n的阶乘，例如5的阶乘是1*2*3*4*5
思考:这个方法应该起什么名字？
这个方法的形参是什么？
方法的返回值类型是什么？
*/
/*
public class Homework04{
	public static void main(String[] args){
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("请输入您要求阶乘的数：");
		int n = input.nextInt();
		//调用求阶乘的方法
		int result = factorial(n);
		System.out.println(result);
	}
	//定义求阶乘的方法
	public static int factorial(int n){
		int jieCheng = 1;
		for(int i = 1;i<=n;i++){
			jieCheng*=i;
		}
		return jieCheng;
	}
}
*/
/*
编写一个方法，输出大于某个正整数n的最小的质数。
思考:这个方法应该起什么名字？
这个方法的形参是什么？
方法的返回值类型是什么?
*/
/*
思考：
找出大于某个正整数n之后所有质数
找出这些质数当中的最小质数，即第一个出现的就是符合要求的最小质数
当输入n的时候，从n++开始依次判断该数是否为质数，判断出的第一个质数就是满足要求的数
*/

public class Homework04{
	public static void main(String[] args){
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("你可以任意输入一个正整数n，我能帮你计算大于他的最小的质数：");
		int n =input.nextInt();
		int result =minPrime(n);
		//调用方法
	}
	//该方法的编写
	public static int minPrime(int n){
		n++;
    for(int i=2;i<n;i++){
		if(n%i==0){
			System.out.println("大于n的最小的质数为:"+n);
			
		}
			return n;
	  }
	}
  }


/*
public class Test{
	public static void main(String[] args){
		int a = 100;
		int b = 200;
		int retValue = m1(a,b);
		System.out.println(retValue);
	}
	public static int m1(int x, int y){
		int k = x*10;
		int m =y*10;
		int result = m2(k,m);
		return result;
	}
	public static int m2(int c, int d);{
		int e =c/2;
		int f =d/2;
		int i =e+f;
		return i;
	}
}
*/
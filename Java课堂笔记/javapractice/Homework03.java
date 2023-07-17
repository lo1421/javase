/*题目：一个5位数，判断它是不是回文数。
即12321是回文数，个位与万位相同，十位与千位相同
思路：
第一步：从键盘上读取一个五位数，找出五位数的每个位上的数字
第二步：将个位与万位进行比较，将十位与千位进行比较，若相等，则表明该数为回文数字
*/
/*
public class Homework03{
	public static void main(String[] args){
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("请从键盘上输入一个五位数：");
		int n = input.nextInt();
		int a = n%10;
		int b = n/10%10;
		int c = n/100%10;
		int d = n/1000%10;
		int e = n/10000;
		if(a==e&&b==d){
			System.out.println(n+"是回文数字");
		}else{
			System.out.println(n+"不是回文数字");
			}
	}
}
*/
/*
题目:
猴子吃桃问题: 猴子第一天摘下若千个桃子，当即吃了一半，还不瘾，又多吃了一个。
第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
以后每天早上都吃了前一天剩下的一半零一个。
到第10天早上想再吃时，只剩下一个桃子了。
求第一天共摘了多少
分析如下：
设猴子第一天一共摘了x个桃子
第一天：x/2-1 = y
第二天：(x/2-1)/2-1
第三天：((x/2-1）/2-1)/2-1
...
接下来每天都吃前一天的一半加一个
直到第十天，只剩一个桃子了
第一步：用循环解决数学规律
第二步：找出循环终止的条件
*/
/*
public class Homework03{
	public static void main(String[] args){
		int y = 1;
		for(int i=1;i<=10;i++){
			y=y*2+1;
		}
		System.out.println("y = "+y);//y = 2047
	}
}
*/
/*
题目:
计算1!+2!+3!+4!++10!
说明:4!表示4的阶乘。
4的阶乘是:1*2*3*4
分析如下：
第一步：外层循环累加已经计算出的每个数的阶乘
第二步：内层循环计算每个数的阶乘
第三步：找出外层循环的条件语句(j<=10)
第四步：找出内层循环的条件语句(i<=j)
*/
/*
public class  Homework03{
	public static void main(String[] args){
		int sum = 0;
		int i;
		for(int j=1;j<=10;j++){
			for(i=1;i<=j;i++){
				i*=i;
			}
			sum+=i;
		}
		System.out.println("sum = "+sum);//sum = 173
	}
}
*/
/*
题目:
一球从100米高度自由落下，每次落地后反跳回原高度的一半再落下,
求它在第10次落地时，共经过多少米?
分析：
采用循环，条件语句是循环次数为十次
解数学方程
*/
/*
public class Homework03{
	public static void main(String[] args){
		double sum = 100.0;
		double x = 50.0;
		for(int i=2;i<=10;i++){
			sum+=(2*x);
			x/=2;
		}
		System.out.println("在第十次落地时经过"+sum+"米");
		System.out.println(100+50+50+25+25+12.5+12.5+6.25+6.25+3.125+3.125+1.5625+1.5625+0.78125+0.78125+0.390625+0.390625+0.1953125+0.1953125);
	}//在第十次落地时经过197米  1    2      3        4         5          6           7               8                  9                   10 
}
//在第十次落地时经过299.609375米
//299.609375
*/
/*
题目：
一个四位数，恰好等于去掉它的首位数字之后所剩的三位数的3倍，这个四位数是多少?
分析如下：
1.要找出这个数字得采用循环，在(999,10000)中依次通过循环来判断
2.这个四位数恰好等于去掉这个四位数的千位数字之后剩下的三位数的三倍
3.最后输出这个四位数
其中运用到了循环语句和条件（判断）（选择）语句

*/
/*
public class Homework03{
	public static void main(String[] args){
		int x = 0;
		for(int i=1000;i<10000;i++){
		   x = i%1000;
		     if(i==x*3){
			System.out.println("这个很特殊的四位数为："+i);
		 }
	  }
	}
}//这个很特殊的四位数为：1500
*/
/*
1.解决复杂问题的时候，先使用汉语来描述思路
2.复杂的问题可以一步一步实现，不用一步到位
题目拆分：
第一步：通过循环语句，保障1~1000以内的每个数都能取到且都作为7的被除数
第二步：通关选择语句判断1000以内每个数逐一筛查都除以7，判断条件是“不能被7整除”
第三步：将这些数符合条件的数累加到到一起
*/
/*public class Homework{
	public static void main(String[] args){
		int sum = 0;
		int i;
		for(i = 1;i<=1000;i++);{
			if(i%7==0){
				sum+=i;
			}
		}
		
	}
}

*/
/*
public class Homework{
	public static void main(String[] args){
		int sum = 1;
		int i;
		int x = 0;
		int flag = -1;
		for(i=2;i<=100;i++){
			x = i;
			if(x % 2 == 1){
				x = flag * x;
		}
		sum += x;
		}
		System.out.println("1+2-3+4-5+6-7...+100 = " +sum);//52
		
	}
}
*/
/*
3.//计算某个数的阶乘
第一步：通过键盘区读取一个要求阶乘的数
第二步：用循环逐一找出，从1到n的（递增）方法求阶乘或者从n到1（递减）的方法求阶乘
第三步：将逐一找出的数用sum接收累乘的结果
public class Homework{
	public static void main(String[] args){
		java.util.Scanner input= new java.util.Scanner(System.in);
		System.out.print("请输入一个所求阶乘的数：");
		int s = 1;//结果的初始值不能是0
		int n = input.nextInt();
		for(int i=1;i<=n;i++){  //递增从n到1的求法（递减从1到n的求法）for(i=n;i>0;i--){sum*=i;}
			s *= i;
		}
		System.out.println("您所求"+n+" 的阶乘为 ：" +s);//成功
	}
}
*/
/*
4.
//
第一步：从控制台接收一个正整数，判断该数是否为质数
第二步：质数1是指在大于1的自然数中，除了1和它本身之外不再有其他因数
第三步：怎么判断输入的数是否为质数
思路：让n从2开始判断，n除以2看看能不能被整除，n除以3能不能被整除，n除以4能不能被整除...直到除以n-1能不能被整除，如果全过程中都不能被整除，则表明n是除1和它本身以外不再有其它因数的质数
如果，在该过程中出现了能被某个数整除的情况，则表明该数存在其它因数，则不是质数
*/
/*public class Homework{
	public static void main(String[] args){
		java.util.Scanner input =  new java.util.Scanner(System.in);
		System.out.print("请输入一个正整数： ");
		int n = input.nextInt();
		int i = 0;
		for(i=2;i<n;i++){
			if(n%i==0){break;}
		}	
		if(i>=n&&n>1){
			System.out.println(n+"是质数");
		}else{
			System.out.println(n+"不是质数");
			}	
	}
}*/
//第二种思路
/*
//通常布尔类型可以用来在外部打布尔标记
//还用了三目运算符
public class Homework{
	public static void main(String[] args){
		java.util.Scanner input =  new java.util.Scanner(System.in);
		System.out.print("请输入一个您想判断是否为质数的数： ");
		int n = input.nextInt();
		boolean zhiShu=true;
		for(int i =2;i<n;i++){
			if(n%i==0){
				zhiShu =false;
				break;
			}
		}
		
			System.out.println(zhiShu?"Yes":"No");
		
	}
}
*/


//第一步：n行循环n次，通过行数来控制循环(外层循环)
//第二步：内层循环是在输出每一行的时候，通过一个循环把空格输出，再通过另一个内层循环把另一个*输出，则表明一行输出完成
//第三步：找出图形中输出空格和*的数学逻辑
/*
空格的规律
第一行4个空格(5-1)
第二行3个空格(5-2)
第三行2个空格(5-3)
第四行1个空格(5-4)
第五行0个空格(5-5)
每行输出的空格的个数等于（输出的总行数减去当前的行数）=（n-i）
*的规律
第一行1个*
第二行3个*
第三行5个*
第四行7个*
第五行9个*
每行输出的*的个数等于（行号*2-1）
*/
/*
public class Homework{
	public static void main(String[] arges){
		java.util.Scanner input=new java.util.Scanner(System.in);
		System.out.print("请输入您要求的图形的行数： ");
		int n = input.nextInt();
		int i;
		int j;
		int k;
		for(i = 1;i<=n;i++){//外层循环控制输出的行数
			//我需要在这里将一行全部输出
			//这里还需要一层循环输出空格以及*
		for(j=0;j<n-i;j++){
			System.out.print(' ');
			
		}//输出空格的循环
	    for(k =0;k<i*2-1;k++){
			System.out.print('*');
			
		}//输出*的循环
		
	    	
			//以上两个内层循环都结束了才在外层循环这里换行
			System.out.println();
		}
		}
	}
*/
/*
//小芳每天一定有2.5元的收入
//小芳即使有一天花掉了6元，但是当天还是会有2.5的收入
//总钱数一定是double类型
//天数的默认值是0，钱数的默认值也是0

public class Homework{
	public static void main(String[] args){
		double sum = 0.0;
		int n = 0 ;
		while(sum<100){
			sum+=2.5;
			n++;
			if(n>=5&&n%5==0){
				sum-=6.0;
			}
		}
		System.out.println("小芳要存"+n+"天，才会存到100元");//74day
	}
}
*/
//找出1000以内所有的完数，要掌握完数的判断
//完数是指它等于除它本身以外所有因子的和
//那么因子怎么找？
//n除以1看看能不能被整除，n除以2看看能不能被整除，n除以3能不能被整除，n除以4能不能被整除，直到n除以n-1，若其中能整除的则都为n的因子
/*10的因子怎么找？
10%1==0
10%5==0
10%2==0
10！=1+2+5=8（则10不是完数）
*/
/*
public class Homework{
	public static void main(String[] args){
		int i;
		//第一步：先从1到1000，每个数都取出来
		  for(i=2;i<=1000;i++){
			  int sum = 0;//sum要及时清零
			  //将取出来的数x，进行判断是否为完数
			  for(int j=1;j <= i / 2;j++){
				  if(i%j==0){
					  //此时筛选出来的j就是i的因子
					  sum+=j;
				  }
			  }
			  if(i==sum){
				  //i是一个完数
				  System.out.println(i);
			  }
		}	
   }
		 
}// 6 28 496
*/

/*
8.
public class Homework{
	public static void main(String[] args){
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("请输入一个五位数以内的正整数：");
		int x = input.nextInt();
		
		if(x/100000==0&&x/10000!=0){
			System.out.println("它是一个五位数");
			int a = x%10;
			int b = x/10%10;
			int c = x/100%10;
			int d = x/1000%10;
			int e = x/10000;
			System.out.println("逆序打印是： "+(a*10000+b*1000+c*100+d*10+e));
		}
		 if(x/10000==0&&x/1000!=0){
			System.out.println("它是一个四位数");
			int a = x%10;
			int b = x/10%10;
			int c = x/100%10;
			int d = x/1000%10;
			System.out.println("逆序打印是： "+(a*1000+b*100+c*10+d*1));
		} if(x/1000==0&&x/100!=0){
			System.out.println("它是一个三位数");
			int a = x%10;
			int b = x/10%10;
			int c = x/100%10;
			System.out.println("逆序打印是： "+(a*100+b*10+c*1));
		} if(x/100==0&&x/10!=0){
			System.out.println("它是一个二位数");
			int a = x%10;
			int b = x/10%10;
			System.out.println("逆序打印是： "+(a*10+b*1));
		}
		
			if(x/10==0&&x%10!=0){
				System.out.println("它是一位数"+x);
		}
	
	}
}
*/

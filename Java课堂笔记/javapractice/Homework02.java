public class Homework02{
	public static void main(String[] args){
		int sum = 0;
		int i = 1;
		int x = 0;
		for(;i<=1000;i++);{
			x = i;
			if(x % 7 != 0){
				sum += x;
				}
		}
		System.out.println("1000以内所有不能被7整除的整数之和为：" + sum);//1001
		
	}
}
/*
题目：
从键盘上接收天气的信息：
1表示：雨天
0表示：晴天
同时从键盘上接收性别的信息：
1表示：男
0表示：女
业务要求：
当天气是雨天的时候：
男：打一把大雨伞
女：打一把小花伞
当天气是晴天的时候：
男：直接走起，出去打球
女：涂防晒霜，出去逛街
*/

public class IfTest02{
	public static void main(String[] args){
		//从键盘扫描一个对象
		java.util.Scanner input=new java.util.Scanner(System.in);
		//提示用户输入一个1或者0
		System.out.print("输入一个1或者0:");
		int i = input.nextInt();
		if(i==1){
			System.out.println("晴天");
			System.out.print("请再输入一个1或者0:");
			i = input.nextInt();
			if(i==1){
				System.out.println("男：直接走起，出去打球");
			}else{
				System.out.println("女：涂防晒霜，出去逛街");
				
			}
		}else{
			System.out.println("雨天");
			System.out.print("请再输入一个1或者0:");
			i = input.nextInt();
			if(i==1){
				System.out.println("男：打一把大雨伞");
			}else{
				System.out.println("女：打一把小花伞");
			}
			
			
		}
		
	}
}
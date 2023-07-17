/*题目
业务：
从键盘上接收一名学生的成绩
判断该学生的成绩
A -[90,100]
B -[80,90)
C -[70,80)
D -[60,70)
E -[50,60)
F -[0,50)
业务要求：
1.成绩必须在[0,100]之间，否则视为违法成绩；
2.成绩可以出现小数
*/
public class IfTest01{
	public static void main(String[] args){
		//从键盘中扫描一个对象
		java.util.Scanner input = new java.util.Scanner(System.in);
		//提示用户输入一个学生成绩（投放在显示屏上）
		System.out.print("请输入一个学生的成绩：");
		//从键盘中读取一个数据
		double score = input.nextDouble();
		//用level储存学生的等级（字符串）
		String level = "F";
		//采用if嵌套语句
		if(score<0||score>100){
			System.out.println("输入的成绩违法");
		} else {
			if(score>=90){
				level = "A";
			}else if(score>=80){
				level = "B";
			}else if(score>=70){
				level = "C";
			}else if(score>=60){
				level = "D";
			}else if(score>=50){
				level = "E";
			}
			System.out.println(level);
		}
			
	}
}


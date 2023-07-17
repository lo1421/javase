public class Student{
	//学号
	int number;
	//姓名
	String name;
	//年龄
	int age;
	//定义一个Student类的无参数构造方法
   
   public Student(){
		System.out.println("无参数的构造方法执行啦！");
	}
	
	public Student(int i){
		System.out.println("有参数的构造方法执行啦！");
	}
}
//
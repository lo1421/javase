/*
方法调用时参数传递的问题
此处针对引用数据类型的变量传递
*/
public class Test2{
	public static void main(String[] args){
		Person p = new Person();
		p.age = 10;
		add(p);
		System.out.println("main--->"+p.age);
	}
	public static void add(Person p){
		p.age++;
		System.out.println("add--->"+p.age);
	}
}
class Person{
	int age;
}
//java中规定，在进行“=”的复制运算，是将变量保存的那个“值”复制一份传给另一个变量
//跟变量的数据类型是无关的，保存的那个“值”既可以是基本数据类型，也可以是引用数据类型
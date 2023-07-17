/*
在Chinese类和ChineseTest类两个程序中我们解决了区分static修饰的变量静态变量和无static修饰的实例变量
要清楚但凡是static修饰的都是类相关的，说明static的作用是将成员变量和方法提升一个等级变成类级别的静态变量和静态方法
访问时尽量用“类名.”的形式访问，我为什么说是尽量呢？
因为接下来你将知道静态的类相关的静态变量和静态方法是可以使用非静态量调用和访问的方式进行调用和访问的
所以可以使用“类名.”和“引用.”两种方式调用静态的量
但是！！对象级别的实例变量和实例方法只能通过new对象之后用“引用.”的方式访问和调用
*/
public class Chinese01{
	//属性/成员变量
	//实例变量身份证号
	int idCard;
	private int age;
	String name;
	//静态变量国籍
	static String country;
	//构造方法
	//无参构造方法（缺省构造器）
	public Chinese01(){
		
	}
	//有参构造方法
	public Chinese01(String mingZi){
		name = mingZi;
	}
	//请问应该定义成静态方法还是实例方法？
	//由于get方法和set方法是在访问（读取和改写）实例变量的，属于一个对象有一份，那么创建了一个对象就应该调用该对象会触发的方法
	//set方法
	public void setAge(int nianLing){
		age = nianLing;
	}
	//get方法
	public int getAge(){
		return age;
	}
	//实例方法
	public void doSome(){
		System.out.println("实例方法执行了！");
	}
	//静态方法
	public static void doOther(){
		System.out.println("静态方法执行了！");
	}
}
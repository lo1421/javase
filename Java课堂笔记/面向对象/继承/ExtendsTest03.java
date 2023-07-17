/*
思考一个问题：
1.在实际开发中，我们什么时候会考虑使用继承呢？需要满足什么样的条件，我们才可以使用继承呢？
但凡是采用“is a ”能描述两个类的关系，那么我就可以使用继承。
eg：
Cat is a Animal
Dog is a Animal
Woman is a People
CreditAccount is a Account
这是从语言描述的方式决定是否需要使用继承
2.假设以后的开发中，有一个B类，有一个A类，A类和B类确实有重复的代码片段，那么他们两个类之间就可以使用继承吗？
eg：
class Product{
	String name;
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
}
class Student{
	String name;
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
}
虽然Product类和Student类有重复的代码，但是：Product extends Student{} 产品是一个学生，这样的继承是失败的，是不符合
伦理的
*/
/*
1.接下来，我将为你讲解java这个庞大的继承系统中的根类、老祖宗类Object，一切在代码上没有显示继承任何类的类，都默认继承老祖宗类，那么
我们应该看看老祖宗类为我们提供了什么方法？有没有现在的我们能在子类中使用的方法
2.Object类在哪里？
在源代码中
3.源代码在哪？
jdk-17/lib/src.zip(解压)变成src文件，而src文件就是源代码文件
4.为什么我们可以使用
String[] 
args和System.out.println()
这是因为SUN公司已经编写好了这些类，我们只需要运行.class字节码文件即可
5.java为什么比较好学，易上手，就是因为java内置一套庞大的类库，程序员不需要从0开始写代码，程序员可以基于这套庞大的类库进行
“二次开发”，这样的话开发速度较快，因为JDK这套内置的类库实现了很多基础的功能
eg：
String是SUN公司编写的字符串类
System是SUN公司编写的系统类
这些类都可以直接拿来用
6.源代码既有*.java又有*.class文件，我们使用的类库中已经编译好的字节码文件，也就是已经编译好的类
现在你是否能明白一下这行代码的含义？
System.out.println("Hellow World!");
System类库中编译好的系统类
out变量名，out没有小括号(),则表明应该是个变量名
println()打印的方法
直接使用"类名."的方式调用/访问的变量是成员变量中的静态变量
System.out之后对应的那个对象再去调用println()方法
这里的System.out返回一个对象
*/
//eg:
public class ExtendsTest03{
	static  Student stu = new Student();
	public static void main(String[] args){
	ExtendsTest03.stu.exam();
  //ExtendsTest03.stu表示返回一个对象，然后再去调用Stdent类的exam()方法
  //这跟System.out.println();的形式是一样的
	}
}
class Student{
	public void exam(){
		System.out.println("考试");
	}
}
//现在将带领你去学习Object类中有什么为我们写好的方法！！！
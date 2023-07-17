/*
在该类中对Person01类中的实例变量age（已经实现了封装了第一步：属性私有化）进行访问
*/
public class PersonTest01{
	public static void main(String[] args){
		//创建Person01类型的对象
		Person01 p1 = new Person01();
		//通过调用无参构造方法（缺省构造器）创建对象，并实现属性初始化（在没手动赋值的情况下系统会赋上默认值）
		//虽然Person01这个类中没有手动写出无参数的构造方法，但当你使用new运算符调用无参构造方法事，
		//系统会提供一个无参数的构造方法供你使用，只是你看不见
		//读Person01类中已经私有化的实例变量age
		System.out.println(p1.age);
		//改Person01类中已经私有化的实例变量age
		p1.age = 20;
		//读Person01类中已经私有化的实例变量age
		System.out.println(p1.age);
	}
}
/*
编译报错
PersonTest01.java:12: 错误: age 在 Person01 中是 private 访问控制
                System.out.println(p1.age);
                                     ^
PersonTest01.java:14: 错误: age 在 Person01 中是 private 访问控制
                p1.age = 20;
                  ^
PersonTest01.java:16: 错误: age 在 Person01 中是 private 访问控制
                System.out.println(p1.age);
                                     ^
3 个错误

*/
/*
接下来继续分析当下写的两个程序
出现了问题：
Person01类的属性age，彻底在外部不能访问了，但是这样过度封装，导致我们所写的这个Person01这个类的意义不大了，
因为age既不能读也不能改，写了跟没写一样
解决这个问题：
对外部提供简单的访问入口，题外话（这个访问入口就像在Person01这个类中开了若干的门，因为私有化的属性只能在本类中访问，
我们就在本类中通过对象级别的方法去替我们访问这个私有化的属性，同时我们可以给这个门设置各种各样的关卡，保证我们在外部调用这个方法是合法的）
（电视机的遥控器就相当于电视机的访问入口）
*/

/*
这里需要补充一个知识点：
关于带有static（修饰符）的方法和不带有static（修饰符）的方法，二者之间有什么区别？
备注：这个知识点当前目录下见MethodTest类中

*/
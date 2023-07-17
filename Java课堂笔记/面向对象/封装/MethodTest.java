//以下程序是用来测试方法带有static关键字修饰与否的区别
public class MethodTest{
	public static void main(String[] args){
     //调用doSome方法-调用普通方法的语法： 类名.方法名(实际参数列表);
	 MethodTest.doSome();//doSome!
	 //在main方法中调用doSome普通方法时，main方法和doSome方法在同一个类中，则"类名."可以省略
	 doSome();//doSome!
	 //能否按照调用doSome普通方法的语法调用没有static关键字修饰的doOther方法？？？？
	 //试一下
	 /*MethodTest.doOther();
	   doOther();
	   编译报错
	    MethodTest.java:10: 错误: 无法从静态上下文中引用非静态 方法 doOther()
         MethodTest.doOther();
                   ^
        MethodTest.java:11: 错误: 无法从静态上下文中引用非静态 方法 doOther()
         doOther();
         ^
        2 个错误
	 */
	 //看来不能用“类名.”的语法调用没有static的方法，什么这个没有static修饰的方法不是普通方法而是特殊的方法
	 //接下来使用正确的调用实例方法的语法来调用实例方法吧！---- “引用.实例方法名(实际参数列表);”
	 //强调！！！！！！
	 //实例方法和实例变量这样对象级别的，必须先创建（new）一个对象才能调用或者访问
	 //通过new运算符调用一个无参数的构造方法在堆内存中创建一个对象
	 MethodTest mt = new MethodTest();//这里其实在MethodTest类体中main方法体外（也就是在2~3行之间）系统提供了一个我们看不见的缺省构造器
	 //调用doOther实例方法吧！
	 mt.doOther();
	 
	}
	//带有static的方法doSome
	public static void doSome(){
		System.out.println("do some!");
	}
	//不带有static的方法doOther
	public void doOther(){
		System.out.println("do other!");//do other!
		System.out.println("恭喜你！使用了正确的调用语法去调用实例方法！！！");//恭喜你！使用了正确的调用语法去调用实例方法！！！
	}//这个方法没有static关键字修饰的但是有返回值类型，这样的方法叫做“实例方法”(对象级别的方法)
	 //实例方法的调用语法： “引用.方法名(实际参数列表);”
	
}
/*
知识点：
对象被称为实例
实例变量就是对象变量
而实例方法是对象级别的方法，所以实例方法就是对象方法
重点：与实例/对象相关的有：实例变量、实例方法，
    而且与实例/对象相关的都必须先new对象，才能通过“引用.”的方式去访问实例变量和调用实例方法

*/
/*
综上所述
我们通过编程测试出来一种新的方法：实例方法（对象级别的的方法）
实例方法的定义的语法
【修饰符列表无static】 返回值类型 实例方法名（形式参数列表）{
	实例方法体;
}
实例方法的调用的语法
先创建一个对象
引用.实例变量名（实际参数列表）;
*/

/*
思考：那么我们为什么在讲解面向对象的首要特征封装的第二步过程中插入这个题外知识点呢？
答案：为了讲解如何在类中编写若干个实例方法，作为外部的访问者访问这个类中私人化的属性的入口，便于访问者操作的同时还保护了重要数据的安全
备注：接下来我们将继续编写Person02和PersonTest02这两个程序继续探讨封装的第二步：对外部提供简单的访问入口
*/

//插入一个知识点
//注意NullPointerException指针异常的本质
//  "空引用"访问任何与对象/实例相关的数据（这包括实例方法和实例变量）时，都会出现空指针异常
// 可以尝试测试一下，并画出内存图
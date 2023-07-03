/*
现在我们将要学习javase进阶关于面向对象的学习
学习纲要：final关键字，抽象类，接口，抽象类与接口的区别，Object类，pacakage和import关键字，访问权限修饰符
现在我们首先学习final关键字

我们先看看ChatGPT是怎么讲解Java中的final关键字的
在Java中，`final`是一个关键字，可以用来修饰类、方法和变量。
使用`final`修饰符可以表示某个实体是“最终的”，即不能再被修改或者继承。

1. 修饰类：当使用`final`修饰类时，表示这个类不能再被继承。
例如：`public final class MyClass {}`表示`MyClass`是一个不能再被继承的最终类。

2. 修饰方法：当使用`final`修饰方法时，表示这个方法不能再被子类重写。
例如：`public final void myMethod() {}`表示`myMethod()`是一个不能再被子类重写的最终方法。

3. 修饰变量：当使用`final`修饰变量时，表示这个变量的值不能再被修改。
例如：`final int myVar = 10;`表示`myVar`是一个值不能再被修改的最终变量。

使用`final`修饰符可以增加代码的安全性、可读性和可维护性。
例如，使用`final`修饰常量可以避免在程序中不小心修改常量的值；
使用`final`修饰类可以确保类的行为不会被子类改变。
1.由ai的讲解我们可以知道final是个关键字
2.final可以修饰类，方法，变量
3.final和abstractt好像不能组合在一起，是非法组合
因为final修饰的类是最终类，无法被继承；abstract修饰的类是抽象的，必须被子类实现，如果一个类被这两个修饰符修饰，那么这个类显然
就没有任何的用处，因为很显然final和abstract两个修饰的是完全相反的概念，我们可以测试一下
4.现在我们继续学习final关键字
*/
 
//public final abstract class Test01{
public  abstract class Test01{	
public abstract void m();
	public static void main(String[] args ){
		/* 错误: 非法的修饰符组合: abstract和final
public final abstract class Test01{
	
	
	这就测试出了final和abstract这两个修饰符不能组合在一起，我们看看ChatGPT怎么理解的
	
	
	`final`和`abstract`这两个关键字不能组合在一起使用的原因是因为它们代表了完全相反的概念。

使用`final`关键字修饰的类、方法或变量表示其不可改变，即不能被继承、重写或修改。
而使用`abstract`关键字修饰的类或方法表示其是抽象的，不能被实例化或者必须在子类中被实现。

如果将`final`和`abstract`组合在一起使用，
则表示这个类或方法既是不能被继承、重写或修改的，又是抽象的，必须被子类实现，这两者的概念相互矛盾，不符合Java语言的语法和语义。

例如，如果一个类同时使用了`final`和`abstract`关键字修饰，它既不能被继承也必须被子类实现，这是不可能实现的。
同样地，如果一个方法同时使用了`final`和`abstract`关键字修饰，它既不能被重写也必须在子类中被实现，也是不可能实现的。

因此，Java编译器会在同时使用`final`和`abstract`关键字时抛出编译错误，以确保程序的正确性和合理性。
         */ 
		 
//既然fianl和abstract不能同时修饰类，那么能不能同时修饰方法呢？
//我们可以提前预测一下：
//final修饰的方法表示该方法为最终方法，无法被重写或者覆盖
//abstract修饰的方法表示该方法是抽象的，必须被实现
//很显然针对方法，这两个修饰符之间还是出现了完全相反的概念 

 //刚刚忘记了抽象方法的定义了，而且抽象方法必须写在抽象类中！！！

	}
}

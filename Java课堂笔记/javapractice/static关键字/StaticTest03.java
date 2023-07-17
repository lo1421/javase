//通过static静态代码块我们联想到了静态变量
//接下来研究代码的执行顺序吧
public class StaticTest03{
	
	//静态变量(静态变量是在类加载的时候初始化)（静态变量储存在方法区中）
	static int k;
	//静态代码块（静态代码块是在类加载的时候执行的）（静态代码块储存在方法区中）
	static{
		//在这里可以访问k吗？
		System.out.println(k);//0 这表明静态代码块此时是可以访问静态变量的
	}
	//程序入口（main方法调用/执行的时候其实已经执行了很多代码）
public static void main(String[] args){
	System.out.println("main begin");
}
}
/*
运行结果:
0
main begin
*/
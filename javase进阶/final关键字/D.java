//上述我们已经测试过final修饰类的情况了，现在继续讨论final修饰方法的时候是个什么情况
 public class D {
	public final void doSome(){
		System.out.println("D 中的方法");
	}
}
class E extends D{
	//在子类E中对D类方法进行重写
	public void doSome(){
		System.out.println("E 中重写的方法");
	}
	/*
	这里涉及到一个知识点，那就是方法重写的要求
	1.两个类之间要存在继承的关系
	2.子类对从父类继承过来的方法在对其进行覆盖或者重写的时候要求
	返回值相同 方法名相同 形式参数列表相同
	访问权限只能更低不能更高
	抛出的异常只能更少不能更多
	结论：final修饰的方法无法被覆盖和继承
	*/
}
/*
 错误: E中的doSome()无法覆盖D中的doSome()
        public void doSome(){
*/
/*
B类继承A类相当于对A类的功能继续进行拓展，如果你不想让别人对A类进行扩展，那么你就可以将A类设置成最终类
给A类加上final关键字修饰符，这样的话别人就无法再对A类进行扩展，也就是A类无法被继承了
现在来测试一下最终类如果去继承的话会报什么错
*/
public final class A{
	
}
class B extends A{
	
}
/*
错误: 无法从最终A进行继承
class B extends A{
	上述报错啦，因为A类是final 修饰的最终类，而最终类无法被继承
*/
//我想测试一下SUN公司写的String类有没有可能被继承
class C extends String {
	/*
	 错误: 无法从最终String进行继承
class C extends String {
	*/
	//这表明String类无法进行继承，因为String类被final 修饰了，
	//由于目前还没有什么具体的项目让你体会到什么类应该使用final修饰变成最终类。只需要知道如果你不想别人去扩展某个类的时候
	//你就把这个类使用final修饰，这样这个类就无法被别人继承了
	
}

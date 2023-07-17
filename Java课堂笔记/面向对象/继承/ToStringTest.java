/*
public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
	上述方法是toString()方法，是老祖宗类Object为我们提供的方法，接下来，我们将测试一下该方法的功能
	并分析该方法
*/
public class ToStringTest{//ToStringTest类是默认继承Object类的：ToStringTest extends Object
	public  static void main(String[] args){
		//由于toString()方法是Object老祖宗类当中定义的实例方法，那么我们在子类（外部程序）访问的时候
		//应该先创建Object类型的对象
		//所以不能这样调用toString()方法
		//ToStringTest.toString();这是"类名."的形式调用实例方法，
		//会报错：无法从今天上下文中访问非静态方法 toString();
		ToStringTest tst = new ToStringTest();
		System.out.println(tst.toString());//ToStringTest@4617c264
		
		//toString()方法已经被ToStringTest类继承过来了，那么子类对象就可以调用从父类继承过来的方法了！
		/*
		public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    } 
	经过分析可以知道toString()方法调用结束之后返回一个String类型的数据
	可以采用一个字符串类型的变量接收，然后再输出这个变量保存的值
	String reValue = tst.toString();
	System.out.println(reValue);
	也可以直接赋值到println(String s)方法中！
		*/
		
		//如果我直接输出一个对象的引用会发生什么？
		System.out.println(tst);//ToStringTest@4617c264
		
		//tst是ToStringTest类的对象的引用
		//通过上述的测试可以得知一个结论：如果直接输出子类的一个对象的引用，那么会默认调用这个类从Object类继承的toString()方法
		//ToStringTest@4617c264这其中@后面的数字可以看作当前对象在堆内存的地址（其实这串数字是通过哈希算法讲对象的堆内存地址转换成十六进制后的结果）
		
	}
}
//toSteing()方法是将对象转换成字符串的形式
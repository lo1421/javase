/*
我将在这里写下一个ChineseTest类作为外部在main方法中去访问Chinese类的属性
*/
public class ChineseTest{
	public static void main(String[] args){
		/*调用无参构造方法创建对象（要注意，如果我只在Chinese这个类中定义了一个有参构造方法而没有手动写一个缺省构造器，
		那么系统将不会默认提供缺省构造器，这里调用无参构造方法去创建对象和属性初始化将会报错）*/
		/*eg:错误: 无法将类 Chinese中的构造器 Chinese应用到给定类型;
                Chinese c = new Chinese();
				*/
		Chinese c = new Chinese();
		System.out.println(c.idCard);//null
		System.out.println(c.name);//null
		System.out.println(c.country);//null
		//调用有参构造方法创建对象
		Chinese c1 = new Chinese("123456789","张三","中国");
		System.out.println(c1.idCard);//123456789
		System.out.println(c1.name);//张三
		System.out.println(c1.country);//中国
		Chinese c2 = new Chinese("987654321","李四","中国");
		System.out.println(c2.idCard);//987654321
		System.out.println(c2.name);//李四
		System.out.println(c2.country);//中国
	}
}
//接下来尝试将ChineseTest程序的JVM运行图画出来吧，然后补充将country声明成static修饰的静态变量也画出来吧！！
/*接下来我将在Chinese01和ChineseTest01两个程序中解释
1.静态变量声明之后怎么访问？
2.什么时候将方法定义为实例方法什么时候定义为静态方法？
3.静态方法声明好之后调用的语法是什么？
*/
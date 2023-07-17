/*
接下来我会编写一个Chinese类
在Chinese类中定义几个成员变量（属性）如idCard、name、country
这几个属性我都将定义成实例变量，你则需要在外部程序ChineseTest类中的main方法中尝试去访问Chinese类中的属性
并画出ChineseTest类运行的JVM内存图
*/
public class Chinese{
	//身份证号idCard 定义成实例变量
	//（每当我在外部通过Chinese这个类地模板使用new运算符调用构造方法创建一个对象的时候，是不是每个对象都应该在堆内存中开辟一个空间存放属性值的空间）
	//因为身份证号是一个对象一份
	String idCard;
	//名字name 定义成实例变量
	String name;//name也应该是一个对象有一份，这样的对象级别的的的成员变量是不是也应该定义成实例变量
	//国籍country 定义成实例变量
	String country;//Chinese类是中国人的类，那么通过这个类的模板创建的所有对象的国籍属性值应该都是一样的，这样的变量定义成实例变量对吗？
	//无参构造方法
	
	public Chinese(){
		
	}
	
	//有参构造方法
	public Chinese(String s1,String s2,String s3){
		idCard = s1;
		name = s2;
		country = s3;
	}
}
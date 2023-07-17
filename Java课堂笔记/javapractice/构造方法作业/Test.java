/*
第五题:定义丈夫类 Husband 和妻子类 wife，
丈夫类的属性包括:身份证号，姓名，出生日期，妻子。
妻子类的属性包括:身份证号，姓名，出生日期，丈夫。
分别给这两个类提供构造方法(无参数构造方法和有参数构造方法都要提供)，
编写测试程序，创建丈夫对象，然后再创建妻子对象，
丈夫对象关联妻子对象，妻子对象关联丈夫对象，
要求能够输出这个“丈夫对象"的妻子的名字，或者能够输出这个"妻子对象”的丈夫的名字。
要求能够画出程序执行过程的内存图并且要求在程序中演示出空指针异常的效果
*/
public class Test{
	public static void main(String[] args){
	//创建丈夫对象，此时丈夫还没有妻子，因为妻子还没有创建出来，所以妻子的地址还是null
   Husband h = new Husband(1111,"张三","2000.1.1");
   //创建妻子对象
   Wife w = new Wife(2222,"李四","20001.2.2");
   //丈夫对象关联妻子对象，妻子对象关联丈夫对象表明要把双方在堆内存的地址赋给双方，这样就可以相互访问
   h.wife = w;
   w.husband = h;
   //输出丈夫对象的妻子的名字(是通过丈夫对象去访问丈夫对应的妻子)
   System.out.println(h.name+"的妻子是:"+h.wife.name);
   //输出妻子对象的丈夫的名字(是通过妻子对象去访问妻子对应的丈夫)
   System.out.println(w.name+"的丈夫是:"+w.husband.name);
	}
}
//丈夫类
class Husband{
	//属性
	//身份证号
	int idCard;
	//姓名
	String name;
	//出生日期
	String birth;
	//妻子
	Wife wife;
	//无参构造方法
	public Husband(){
		
	}
	//有参构造方法
	public Husband(int idCard,String name,String birth){
		this.idCard = idCard;
		this.name = name;
		this.birth = birth;
	}
	
}
//妻子类
class Wife{
	//属性
	//身份证号
	int idCard;
	//姓名
	String name;
	//出生日期
	String birth;
	//丈夫
	Husband husband;
	//无参构造方法
	public Wife(){
		
	}
	//有参构造方法
	public Wife(int idCard,String name,String birth){
		this.idCard = idCard;
		this.name = name;
		this.birth = birth;	
	}
}
//接下来是画出该程序运行的JVM内存图
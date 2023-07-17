//手动调用父类无/有参构造方法
class Fu{
	//父类无参构造方法
	public Fu(){
		System.out.println("父类无参构造方法");
	}
	//父类有参构造方法
	public Fu(String str){
		System.out.println(str);
	}
}
//子类
class Zi extends Fu{//记得有继承才会有子类去和父类！！！！！！
	//子类无参构造方法
	public Zi(){
		//子类手动调用父类的有参构造方法
		super();
		System.out.println("子类无参构造方法");
		
	}
	//子类有参构造方法
	public Zi(String str){
		//子类手动调用父类的有参构造方法
		super("子类手动调用父类的有参构造方法");
		System.out.println(str);
	}
}
//测试类
public class TestMain01{
	public  static void main(String[] args){
		//创建子类对象，调用子类的无参构造方法
		Zi zi1 = new Zi();
		Zi zi2 = new Zi("子类有参构造方法");
		/*
		编译运行的结果：
		父类无参构造方法
        子类无参构造方法
        父类无参构造方法
        子类有参构造方法

		
		*/
		
	}
}
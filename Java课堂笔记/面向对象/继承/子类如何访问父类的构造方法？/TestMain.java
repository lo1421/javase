/*
一。通过java面向对象的三大特征之中的第二个特征继承可知
1.子类继承父类方法除构造方法以外的所有，即子类继承父类就是将父类中除构造方法以外的所有的都复制粘贴过来，
但是子类无法直接访问父类中私有化的属性和方法
2.我们已经解决了子类对象想访问从父类继承过来的私有方法，通过在父类中设置的访问入口来访问
*/

//子类初始化时自动调用父类无参构造方法
//父类
 class  SuperClass{
	//父类的无参构造
	public SuperClass(){
		System.out.println("父类无参构造方法");
	}
	//父类有参构造方法
	public SuperClass(String str){
		System.out.println(str);
	}
}
//子类
 class SubClass extends SuperClass{
	//子类无参构造方法
	public SubClass(){
		System.out.println("子类无参构造方法");
	}
	//子类有参构造方法
	public SubClass(String str){
		System.out.println(str);
	}
}
//测试类
public class TestMain{
	public static void main(String[] args){
		//创建子类对象，调用无参构造方法
		SubClass sc1 = new SubClass();
		//创建子类对象，调用有参构造方法
		SubClass sc2 = new SubClass("子类有参构造方法");
		
		/*
		编译运行结果：
			父类无参构造方法
            子类无参构造方法
			
			
            父类无参构造方法
            子类有参构造方法
		
总结：在子类初始化（创建对象）时会自动调用父类的无参构造方法（只调用父类的无参构造方法，不会调用父类的有参构造方法）
而且子类初始化的时候，先执行父类的无参构造方法再执行子类的初始化
		*/
		}
}
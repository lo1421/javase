public class OverrideTest02{
	//父类中的方法私有化了
	private void doSome(){
		System.out.println("Override's doSome method excute!");
	}
	//定义一个私有化的方法
	private void doOther(){
		System.out.println("Override's doOther method excute!");
	}
	private String name = "张三";
	//入口
	public static void main(String[] args){
		
		
		
		T t = new T();
		//t.doSome();//编译报错：找不到符号
		
         t.getDoOther();//Override's doOther method excute!
		 
		/*
		通过以上的程序可以知道，其实子类可以继承父类私有化的方法，只是我不能在外部直接使用子类对象
		去访问从父类继承过来的不可见的私有化的方法，但是我可以在子类中提供一个实例方法作为入口，让继承过来的不可见方法变得
		可以访问，那么就只需要在外部使用子类对象去调用你在子类设置的访问入口，那么这可证明：父类中的私有化的方法和属性是可以被继承的
		，只是外部想要访问的话必须进行封装的第二步：对外部提供简单的访问入口
		这里只涉及到了封装和继承，还没有涉及多态，因为我是在外部程序创建子类对象，然后使用的子类引用去访问子类从父类继承过来的实例方法和私有化的方法
		只是私有化的方法要在外部访问比较特殊，你需要调用封装的第二步在子类设置的入口方法才能实现在外部访问。
		*/
		//使用多态的知识判断私有化的方法存不存在方法覆盖
		OverrideTest02 ot = new T();
		ot.doSome();//Override's doSome method excute!
		/*
		调用的是父类的方法，所以其实方法覆盖多私有化的方法是是无效的
		*/
	}
}

//子类
class T extends OverrideTest02{
	//直接不进行方法覆盖看看能不能实现继承
	//我在该类中为外部提供一个方法去访问子类从父类继承过来的私有的方法
	public String  getDoOther(){
		return this.doOther();
	}
	
		//现在我尝试把从父类继承过来的私有化的方法进行重写，也就是方法覆盖
		//但由于方法覆盖和多态是无法分开的，所以现在将涉及到多态的知识
		//可以解决"私有化的方法是否存在方法覆盖？"
		//访问权限不能更低可以更高
		public  void doSome(){
		System.out.println("T's doSome method excute!");
		
	}
	public String  getNmae(){
		return name;
	}
	
}
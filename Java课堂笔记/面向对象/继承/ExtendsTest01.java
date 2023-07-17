/*
总结：
到目前我们在一个类中都写了什么？什么是可以在类中出现的？
类{
	实例变量
	静态变量
	（局部变量是声明在方法中的，方法调用结束局部变量内存释放）
	构造方法

	实例方法
	静态方法
	静态代码块
	实例代码块
}
*/
/*
接下来我们学习java中的第二大特征：继承（extends）
1.什么是继承？继承有什么作用？
继承在现实世界怎么体现？子承父业
2.那么继承在代码程序中如何体现？
接下来我会写一个Account类和CreditAccount类，然后我会在ExtendsTest01类的main方法中进行测试
你来分析我写的这个程序有什么问题？（不是语法上的问题）
*/
//测试类ExtendsTest01程序
public class ExtendsTest01{
	//main方法程序的入口
	public  static void main(String[] args){
/*	
	//创建Account类型的对象
		Account a = new Account();
		a.setActno("1111");
		System.out.println(a.getActno());
		a.setBalance(20000);
		a.withdraw(10000);
		a.deposit(10000);
		*/
		
		//创建CreditAccount类型的对象
		CreditAccount ca = new CreditAccount();//构造方法是继承不过来的，父类和子类的类名都不相同，那么构造方法名也就不同
		//由于子类CreditAccount类继承了Account类的方法和属性，那么我是否能通过子类的对象去访问父类的方法？？
		ca.setActno("2222");
		System.out.println(ca.getActno());
		ca.setBalance(30000);
		ca.setCredit(1);//子类中目前只有这个方法是在子类里可以看见的
		ca.withdraw(10000);
		ca.deposit(10000);
		/*
		上述编译会报错，这是因为子类继承父类的特点是：继承所有除构造方法之外的一切代码都复制粘贴，但是不能通过子类对象，去调用父类中私有化的属性
		eg:
		ExtendsTest01.java:: 错误: actno 在 Account 中是 private 访问控制
                this.actno = actno;
                    ^
        ExtendsTest01.java:: 错误: balance 在 Account 中是 private 访问控制
                this.balance = balance;
				出现上述问题，我们应该先不将父类中的属性私有化！
		*/
		
		
		
	//上述程序通过了，那么我们采用继承对该程序修改之后，在看看程序是否能通过吧！	
	/*
	现在编译通过了，运行结果也出来了，那么我们思考和总结一下继承的特点语法作用吧！！
	*/
	}
}
//信用卡账户
//CreditAccount类=属性（账户accountnumber、余额balance+信誉度credit）+方法（各个属性的setter和getter方法、有参构造方法、无参构造方法、取钱方法withdraw、存钱方法deposit）
class CreditAccount extends Account{//此时CreditAccount类就是子类，然后子类继承（extends）父类，Account类就是父类
	//属性私有化
	//private String actno ;
	//private double balance;
	private double credit;
	//构造方法
	public CreditAccount(){
		
	}
	/*public CreditAccount(String actno,double balance,double credit){
		this.actno = actno;
		this.balance = balance;
		this.credit = credit;
	}
	*/
	//我把上述这段在子类中访问父类的私有化变量屏蔽之后，就可以使用setter和getter方法通过子类对象间接访问了
	
	
	
	//setter和getter方法
	/*public void setActno(String actno){
		this.actno = actno;
	}
	public String getActno(){
		return actno;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public double getBalance(){
		return balance;
	}
	*/
	public void setCredit(double credit){
		this.credit = credit;
	}
	public double getCredit(){
		return credit;
	}
	/*
	//取钱的实例方法withdraw
	public void withdraw(int money){
		if(this.getBalance()<money){
			System.out.println("余额不足，取钱失败");
			return;
		}
		//程序能执行到这里表明取钱成功，那么应该在此处修改余额的值
		this.setBalance(this.getBalance()-money);
		System.out.println("成功取出："+money);
		System.out.println("当前余额："+this.getBalance());
	}
	//存钱方法deposit
	public void deposit(int money){
		this.setBalance(this.getBalance()+money);
		System.out.println("成功存入："+money);
		System.out.println("当前余额："+this.getBalance());
	}
	*/
}
//账户
//Account类=属性（账户actno、余额balance）+（有参构造方法、无参构造方法、取钱方法withdraw、存钱方法deposit））
class Account{
	private String actno;
	private double balance;
	//现在我已经将父类中的私有化的属性变成没有封装了，现在再试一下编译吧！
	//构造方法
	public Account(){
		//啊我好像知道为什么父类的构造方法不能继承到子类的原因了
		//因为构造方法的定义语法中规定：构造方法名必须和它所在类的类名一样，那么就不能被继承到别的类啦，因为类名不一样了！！
	}
	public Account(String actno,double balance){
		this.actno  = actno;
		this.balance = balance;
	}
	//getter和setter方法
	public void setActno(String actno){
		this.actno = actno;//但凡是传参数赋值的对象级别的方法中，只要经过增强了可读性，那么this.都不能省略，而且都是"this.实例变量=参数变量的格式"
	}
	public String getActno(){
		return actno;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public double getBalance(){
		return balance;//这里的This.都省略啦！
	}
	//取钱的实例方法withdraw
	public void withdraw(int money){
		if(this.getBalance()<money){
			System.out.println("余额不足，取钱失败");
			return;
		}
		//程序能执行到这里表明取钱成功，那么应该在此处修改余额的值
		this.setBalance(this.getBalance()-money);
		System.out.println("成功取出："+money);
		System.out.println("当前余额："+this.getBalance());
	}
	//存钱方法deposit
	public void deposit(int money){
		this.setBalance(this.getBalance()+money);
		System.out.println("成功存入："+money);
		System.out.println("当前余额："+this.getBalance());
	}
	

}
/*观察上述程序是否Account类和CreditAccount类这两个类中的代码片段有很多重复略显臃肿的代码
尤其是属性和方法（除了构造方法）很多都是重复的，那么此时我们可以考虑使用继承！！
没封装前，先测试一下代码吧！
*/
/*
一继承的作用：
1.基本作用：子类继承父类，代码可以得到复用
2.主要作用（重要）：因为有了继承，才有了后来的方法覆盖（重写）和多态机制
二java中继承的语法格式
class 类名（子类） extends 类名（父类）{
	类体;
}
三继承的相关特性：
1.B类继承A类，则称A类为超类（superclass）、基类、父类，称B类为子类（subclass）、衍生类、扩展类
eg：
class A{}
class B{}
class B extends A{}
2.java中的继承只支持单继承，不支持多继承，c++中是支持多继承的，这也是java体现简单性的一点，换句话说，java中不允许这样写代码：
eg：
class A{}
class B{}
class C{}
class C extends A,B{}
这样的多继承在java语言中是不支持的
3.虽然java不支持多继承，但是有时候会产生间接继承的效果，例如：
class A{}
class B{}
class C{}
class B extends A{}
class C extends B{}
那么就可以说C类直接继承了B类还间接继承了A类
4.java中规定，子类继承父类，除构造方法不能继承之外，剩下的都可以继承，但是私有化的属性和方法（封装了的属性和方法）不能通过子类对象直接访问。
（父类中private修饰的不能在在子类中访问，可以通过间接的手段来访问）
5.java中的类没有显示继承其它的类的话，那么默认继承Object类，Object类是java语言提供的老祖宗类，
也就是说，按照一个类的模板创建的对象与生俱来就具有Object类当中的所有特征！
Object类是所有类的超类、基类、父类，是老祖宗类，java这么庞大的继承结构的最顶点就是Object类
6.继承也存在一些缺点，例如CreditAccount类继承了Account类，这会导致它们之间的耦合度非常的高（面向对象的特点就会被削弱），Account类就是父类发生改变之后会
马上影响到CreditAccount类
（子类继承父类，耦合度高，父类修改子类受牵连）
备注：让两个类产生血缘关系就会造成耦合度高的特点，父类改变，子类就会受牵连

*/
/*
自己对继承extends的理解
子类继承了父类就是指父类中除了构造方法以外的所有代码都原封不动的复制粘贴到子类对应的位置，除了不能使用子类对象调用父类中private修饰的以外，
相当于父类有的子类全都有，只是代码上看不见，但是你通过创建子类对象，然后使用子类对象的引用去调用父类中的方法这都是可以的，因为你有一模一样的代码，
只不过没有写出来，这也是继承的作用一：代码可以得到复用

*/
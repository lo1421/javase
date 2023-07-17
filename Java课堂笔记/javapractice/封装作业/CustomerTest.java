/*
二、写一个名为Account的类模拟账户
该类的属性和方法如下所示。
该类包括的属性:账户id，余额balance，年利率annualInterestRate;
包含的方法:各属性的set和get方法。
        取款方法withdraw()
        存款方法deposit()
写一个测试程序
(1)创建一个Customer，名字叫Jane Smith，他有一个账号为1000，余额为2000，年利率为1.23%的用户
(2)对Jane Smith操作:
存入100元，再取出960元，再取出2000。
打印Jane smith的基本信息
信息如下显示:
成功存入:100
成功取出:960
余额不足，取钱失败
Customer [Smith  Jane] has a account : id is 1000 annualInterestRate is 1.23% balance is 1140.0
*/
//要有一个观察和抽象的能力，观察现实世界的对象共同特点将这些共同特征抽象成一个模板，就是“类”，然后通过“类”创建出若干个对象
//这些对象相互作用形成的系统就是虚拟世界，这样我们java工程师就可以通过虚拟世界解决现实世界的问题，这就是面向对象的编程语言的核心

/*
做题要先分析！！！
一
1、有一个账户类=属性（账户+余额+年利率）+方法（setter+getter+构造方法+取款方法+存款方法）
2、然后分析这些属性和方法是类级别的还是对象级别的。
3、类级别的属性（属性是成员变量）和方法是经过static修饰升级了的，都变成了静态变量和静态方法，是类级别的，静态上下文和非静态上下文都可以访问，意思就是
可以使用“引用.”访问（非静态）也可以使用“类名.”访问（静态），但最好建议使用“类名.”的方式访问，因为实例（对象级别的）只能使用“引用.”的方式访问和调用
经过分析Account类里的属性都是实例变量对象级别的
方法也是必须要对像触发的行为动作，那么应该是实例方法
4、但是必须对这个类进行封装！！！
 封装的步骤：
 1.属性私有化，使用private修饰成员变量
 2.对外部提供setter和getter方法作为入口，可以让访问者通过这两种简单的访问入口去访问私有化的成员变量，setter方法中通常会设置关卡，这样可以防止bug出现
 （备注：私有化的属性只能在本类中访问，而无法直接在外部直接访问，但可以设置sett和getter这样的实例方法在外部调用它们去间接访问私有化的变量）
 二
 1.写一个测试程序，这将会包括mian方法
 三
 创建一个Customer，这意味着应该有一个顾客类，这个Jane Smith是顾客类创建出的一个对象
 这个顾客类=属性（名字+账户）+方法（构造方法+setter+getter）
 四
 统合综效：顾客这个对象和账户这个对象分别创建出来之后，在测试程序的main方法中让两个对象产生联系，这样就解决了现实世界的问题！！！
 
*/
//写测试程序
public class CustomerTest{
	//main方法程序入口
	public static void main(String[] args){
		//通过Account类模板创建一个对象
		Account a = new Account("1000",2000,1.23);
		//通过Customer类模板创建一个对象
		//可以通过有参构造方法去实现属性初始化，当然如果后续的对属性的修改，必须使用setter方法
		Customer c = new Customer();
		c.setName("Jane Smith");
		c.setAccount(a);
		//上述创建对象之后，将Account类和Customer类的对象相互联系起来的过程我还可以怎么写？
		/*
		那就是调用无参构造方法创建对象，再通过setter方法修改（相当于在初始化了）
		*/
		/*
		对Jane Smith操作:
        存入100元，再取出960元，再取出2000。
		*/
		//你要知道你是在外部程序中访问Customer类创建的对象的account（这是已经私有化的对象了，要采用getter方法去读取！！！）
		//不要写成"c.account.deposit(100);"
		c.getAccount().deposit(100);//这里有个很容易错的地方！！！！！
		c.getAccount().withdraw(960);
		c.getAccount().withdraw(2000);
		
		//Customer [Smith Jane] has a account : id is 1000 annualInterestRate is 1.23% balance is 1140.0
		System.out.println("Customer "+"["+c.getName()+"]"+"has a account : id is "+c.getAccount().getId()+" annualInterestRate is "+c.getAccount().getBalance()+"%"+"  balance is "+c.getAccount().getBalance());
		/*
		这里我有有个易错点，我要通过Customer类创建的对象去访问跟它关联的Account类创建的对象的一切属性和方法都必须“c.getAccount().xxx”才可以
		需要画出内存图才能了解原理的更加深刻
		*/
		
		//全部都是Customer类创建的对象去访问跟他有关的账户的相关属性，所以都是“c.”
	/*
	输出结果：
	成功存入：100
    成功取出：960
    余额不足，取钱失败
    Customer [Jane Smith]has a account : id is 1000 annualInterestRate is 1140.0%  balance is 1140.0

	*/	
		
		
	}
}

//账户类
class Account{
	//属性
	//账户
	private String id;
	//余额
	private double balance;
	//年利率annualInterestRate
	private  double annualInterestRate;
	//构造方法无参
	public Account(){
		
	}
	//构造方法有参
	public Account(String id,double balance,double annualInterestRate){
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		
	}
	//getter和setter方法
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public double getBalance(){
		return balance;
	}
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	//取款方法withdraw(实例方法)
	public void withdraw(int money){
		//取钱应该设置关卡
		if(money>this.getBalance()){
			System.out.println("余额不足，取钱失败");
			return;
		}
		//取哪里的钱？
		//应该是取余额balance里的钱，那么balance怎么去访问（改变）？
		//由于这里是在同一个类中访问私有化的属性是允许的，那么我可以直接在实例方法中调用实例变量(this.可以省略)
		//balance-=money;
		//this.balance-=money
		//this.balance = this.balance - money;
		//或者我调用实例方法settr来修改balance实例变量，调用getter来读取balance实例变量
		this.setBalance(this.getBalance()-money);
		System.out.println("成功取出："+money);
	}
	//存款方法deposit(实例方法)
	public void deposit(int money){
		this.setBalance(this.getBalance()+money);
		//balance+=money;
		System.out.println("成功存入："+money);
	}
}

//Customer类
class Customer{
	//属性
	//名字name
	private String name;
	private Account account;
	//构造方法无参
	public Customer(){
		
	}
	//构造方法有参
	public Customer(String name,Account account){
		this.name = name;
		this.account = account;
		/*知识点，因为这里是有参数的构造方法，那么为了增加程序的可读性，我将参数变量名设置的跟实例变量名一致，为了防止就近原则
		区分出实例变量和局部变量，此处的“this.”我就没有选择省略了，如果我这样写：
		public Customer(String name,Account account){
			(局部变量)name = name(局部变量);
			account = account;
			//那么等号两边就都是局部变量了，这样是无法实现对实例变量的访问的目的的
		}
		//有参的实例方法也是这个道理（this.）不能省
		*/
	}
	//setter方法
	public void setName(String name){
		this.name = name;
	}
	//getter方法
	public String getName(){
		return name;
	}
	public void setAccount(Account account){
		this.account = account;
	}
	public Account getAccount(){
		return account;
	}
}
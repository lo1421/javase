/*
一、请通过代码封装，实现如下需求:
编写一个类Book，代表教材:
1.具有属性:名称(title)、页数(paqeNum)
2.其中页数不能少于200页，否则输出错误信息，并赋予默认值200
3.为各属性提供赋值和取值方法
4.具有方法:detai1，用来在控制台输出每本教材的名称和页数
5.编写测试类BookTest进行测试:为Book对象的属性赋予初始值，并调用Book对象的detail方法，看看输出是否正确？
*/
//测试类
public class BookTest{
	//程序入口main方法
	public static void main(String[] args){
		//创建一个Book对象
		Book b = new Book();
		b.setTitle("语文");
		b.setPageNum(100);
		b.detail();
	}
}
//被封装好的教材类
class Book{
	//属性（实例变量）
	//名称
	private String  title;
	//页数
	private int pageNum;
	//无参构造方法
	public Book(){
		this(200);//this()的新用法，可以在构造方法中使用实现调用构造方法的目的，但是只能使用在第一行，而且只能调用一遍
	}
	//有参构造方法
	public Book(int pageNum){
		this.pageNum = pageNum;
	}
	//setter和getter方法
	public void setTitle(String title){
		this.title = title;//这里之之所以this.不能省略的原因是因为，为了增加代码的可读性，就将形式参数变量名定义成跟实例变量一样
		//但是呢如果没有加上this.这样会导致导致就近原则，eg：title = title;两边就都变成了局部变量，达不到访问实例变量的目的了
	}
	public String getTitle(){
		return title;//这里之所以没有写this.是因为这里是没有形式参数的实例方法，就不会出现就近原则，搞不清实例变量和局部变量的情况
	}
	public void setPageNum(int pageNum){
		if(pageNum<200){
			System.out.println("该书的页数不能少于200页！");
			new Book();
			return;
		}
		this.pageNum = pageNum;
	}
	public int getPageNum(){
		return pageNum;
	}
	//4.具有方法:detai1，用来在控制台输出每本教材的名称和页数
	//第四点显然是要使用实例方法，因为是对象级别的方法，需要对象来触动才可以的方法
	public void detail(){
		System.out.println(title+"书页数为:"+pageNum);//这里可以省略this.或者你可是调用实例方法getter和setter
	}
	
}
/*
我想在这里的程序测试一下子类继承父类之后，要采取什么手段才能访问父类中已经私有化的属性

*/
public class ExtendsTest02{
	public static void main(String[] args){
		Woman w = new Woman();
		//如果我用子类创建的对象的引用.直接访问父类的私有化的属性，会出现什么情况？
		//System.out.println(w.name);
		/*
		会出现：
		ExtendsTest02.java:9: 错误: name 在 People 中是 private 访问控制
                System.out.println(w.name);
		*/
		//采用什么手段，才可以实现访问父类中的私有化的属性？
		System.out.println(w.getName());//null
		/*证明可以使用setter和getter方法，所以结论是：继承之后，子类的对象无法直接访问
		父类中的已经封装过的实例变量
		*/
	}
}
class People{
	//封装过的属性，只能在本类中访问
	private String name;
	public People(){
		
	}
	public People(String name){
		this.name = name;
	}
	//为外部访问本类的私有化的属性提供简单的访问入口
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
}
class Woman extends People{
	public Woman(){
		
	}
	
}

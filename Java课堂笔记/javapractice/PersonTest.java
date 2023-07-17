/*
在外部（PersonTest这个类中的main方法中）访问Person类型的实例变量
*/
public class PersonTest{
	public static void main(String[] args){
		//使用new运算符调用构造方法/构造器/Constructor/构造函数创建的一个Person类型的对象
		Person p = new Person();
		//访问Person的实例变量/属性
		/*属性的访问通常有两种形式：
		第一种：（get）读数据
		第二种：（set）写数据
		*/
		//读age（获取）
	    System.out.println(p.age);//age 在 Person 中是 private 访问控制 
		//写age或者称（set）age
        p.age = 20;//age 在 Person 中是 private 访问控制  
        //读age（获取）
        System.out.println(p.age);//age 在 Person 中是 private 访问控制 
		
	}
}

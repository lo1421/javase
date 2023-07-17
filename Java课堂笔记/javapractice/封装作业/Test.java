/*
三、(封装)已知一个类 student 代码如下:
class Student{
String name
int age ;
String address ;
String zipCode ;
String mobile;
}
要求:
1.把student 的属性都作为私有，并提供get/set 方法以及适当的构造方法
2.为student 类添加一个getPostAddress 方法，要求返回student对象的"地址"和"邮编"
*/
public class Test{
	public static void main(String[] args){
		Student st = new Student();
		System.out.println(st.getPostAddress());
		Student st1 = new Student("安徽省安庆市","1111111");
		System.out.println(st1.getPostAddress());
	}
}
//封装一个Student类
class Student{
	//所有属性私有化
	private String name;
	private int age;
	private String address;
	private String zipcode;
	private String mobile;
	//提供setter和getter方法
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return address;
	}
	public void setZipcode(String zipcode){
	this.zipcode = zipcode;
	}
	public String getZipcode(){
		return zipcode;
	}
	public void setMobile(String mobile){
		this.mobile = mobile;
	}
	//构造方法
	public Student(){
		
	}
	//有参构造方法
	public Student(String address,String zipcode){
		this.address =address;
		this.zipcode = zipcode;
	}
	//实例方法getPostAddress
	//要求返回对象的“邮编”和“地址”
	public String getPostAddress(){
		return "地址："+address+"  "+"邮编："+zipcode;//使用字符串连接符号即可完成
	}
	

}

/*
一 对象的创建和使用
1、创建对象的语法
   new 类名();
2、new是一个运算符，用来创建一个对象
3、对象创建好了怎么访问？
  语法：
        类名     变量名           = new 类名();
    引用数据类型  变量名(又名：引用)   = 对象;
  类比 
        int       i            =  100; 声明变量i
  System.out.println("i="+i);        访问变量i
4、能不能通过类名直接访问一个实例变量?
   不能，必须先通过创建一个对象之后才能访问实例变量
5、什么是实例变量？
  对象又被称为实例
  实例变量实际上就是对象级别的变量
  eg：
  public 明星类{
	  int height;
  }
  身高这个属性所有的明星对象都有，但是每个对象都有“自己的身高值”，
  假设创建10个明星对象，就应该有10份的height，所以这种对象级别的变量属于实例变量。
6.怎么访问实例变量？
  语法：  引用.实例变量名;
7.引用是什么？
   引用是保存了内存内存地址，且该内存地址指向的是堆内存中的对象。
8.对象是什么？
   对象是通过new运算符在堆内存中开辟的内存/空间后创建出来的。
*/
public class StudentTest{
	public static void main(String[] args){
		//应该先创建了对象，才能访问实例变量
		//创建对象学生s1，s1是局部变量（在方法中声明）又叫做引用
		Student s1 = new Student();
		//访问对象是s1的实例变量
		System.out.println(s1.number);
		System.out.println(s1.name);
		System.out.println(s1.sex);
		System.out.println(s1.height);
		System.out.println("----------------------");
		//试试手动给实例变量赋值再访问
		s1.number = 71222308;
		s1.name = "伍寒冰";
		s1.sex = true;
		s1.height = 1.70;
		System.out.println("学号："+s1.number);
		System.out.println("姓名："+s1.name);
		System.out.println("性别："+s1.sex);
		System.out.println("身高："+s1.height);
		
		
		//创建学生对象s2，s2是局部变量（在方法中声明）又叫做引用
		Student s2 = new Student();
		//访问对象s2的实例变量
		System.out.println(s2.number);
		System.out.println(s2.name);
		System.out.println(s2.sex);
		System.out.println(s2.height);
		//试试手动给实例变量赋值再访问
		s2.number = 71222335;
		s2.name = "郑雨茄";
		s2.sex = true;
		s2.height = 1.60;
		System.out.println("----------------------");
		System.out.println("学号："+s2.number);
		System.out.println("姓名："+s2.name);
		System.out.println("性别："+s2.sex);
		System.out.println("身高："+s2.height);
	}
}

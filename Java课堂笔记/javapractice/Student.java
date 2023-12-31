/*
1.通过观察学生对象的属性（不包括方法），抽象出一个学生类
   学号 采用int型表示
   姓名 采用String类型表示
   性别 采用boolean类型表示
   身高 采用double型表示
  2.类的定义  
  【修饰符列表】 class 类名 {
	  类体 = 属性 + 方法;
  }
  3.实例变量是成员变量
  4.属性通常是由数据作为字面量，则属性其实是数据的体现，属于变量。（并且是成员变量）
  5.变量通过位置可以份两类
     成员变量：定义在方法体外类体中
     局部变量：定义在方法体中，方法调用结束释放局部变量内存
  6.变量有一个特点：
    必须先声明，再赋值，才能调用
	那么成员变量在声明的时候，需要赋值吗？
	答案：成员变量在没有手动赋值的时候，成员变量是有默认值的。
	数据类型        默认值
	 byte          0
	 short         0
	 int           0
	 long          0L
	 float         0.0f
	 double        0.0
	 boolean       false
	 char          /u0000
	 String        null
   7.所以的类都是引用数据类型。（String也是引用数据类型）
  */
  public class Student{
	  //学号
	  int number;//这些都是共同特征中的属性，都是实例变量，也是成员变量，所以有默认值
	  //姓名
	  String name;
	  //性别
	  boolean sex;
	  //身高
	  double height;
  }
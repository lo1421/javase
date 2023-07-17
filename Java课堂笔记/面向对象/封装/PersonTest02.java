/*
1.封装的第二步是：向访问者提供简单的访问入口
那么这个访问入口要实现的目的是可以访问在Person02类中已经私有化的实例变量age
既然要访问：是不是应该实现读get和写set两个目的
那么应该在Person02类中写两个实例方法才能实现这两个功能（在外部调用这两个实例方法来访问age）
2.所以get和set方法都应该没有static关键字修饰
3，实例方法的定义的语法
【修饰符列表无static】 返回值类型 实例方法名（形式参数列表）{
	实例方法体;
}
4.实例方法的调用的语法
先创建对象
引用.实例方法名(实际参数列表);

*/
public class PersonTest02{
	public static void main(String[] args){
		//创建对象
		Person02 p2 = new Person02();
   //调用getAge实例方法来读取Person02类中已经私有化的实例变量age
   int nl = p2.getAge();
   System.out.println(nl);//0
   //调用setAge实例方法来改写Person02类中已经私有化的实例变量age
   p2.setAge(20);
   //调用getAge实例方法来读取Person02类中已经私有化的实例变量age
   System.out.println(p2.getAge());//20
   /*p2.setAge(-100);
   System.out.println(p2.getAge());//-100*
   //这里输出了-100，折腾半天输出的年龄还是负数（不符合实际），bug还是存在
   //思考：我们能否在setAge方法中编写程序设置关卡
   //防止把实例变量修改成不合乎常理的数据
   /*
   Person02已经为setAge方法设置了关卡，我们继续试试能不能输入-100(把27、28行屏蔽掉)
   */
   p2.setAge(-100);//您输入的年龄不合法！请重新修改合法的年龄！(这表明我们修改失败啦！)
   System.out.println(p2.getAge());//20
	}
}

/*
接下来我们总结一下封装中set和get方法的定义和使用吧
注意！！！
java开发规范要求 get方法和set方法要满足以下格式才可以
  1. get方法（实例方法）的定义语法
public  返回值类型 get+属性名单词首字母大写(无形式参数){
	return 属性名;
}
  2. set方法规范要求
public void set+属性名单词首字母大写(有一个与属性类型相同的形式参数){
	属性名 = 形式参数名;
	
}

*/
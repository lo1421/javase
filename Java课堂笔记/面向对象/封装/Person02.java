/*
接下来，我们将继续封装第二步：对外部提供简单的访问入口
*/
public class Person02{
	//属性私有化
	private int age;
	/*实例方法的定义的语法
【修饰符列表无static】 返回值类型 实例方法名（形式参数列表）{
	实例方法体;
}
*/
//提供读实例变量age的get实例方法
 public int getAge(){
	 return age;
 }
 //提供改age实例变量的set实例方法
 public void setAge(int nianLing){//我将在这里设置set关卡，防止外部输入不符合属性的数据，这样就保证了数据的安全性，解决了bug
	if(nianLing<0||nianLing>150){
		System.out.println("您输入的年龄不合法！请重新修改合法的年龄！");
		return;//程序如果执行了if语句则结束setAge方法
	}
	age = nianLing;
	//若程序执行到这里了，则表明外部人员设置的年龄是合法的
 }
}
//以上就是一个完整的封装过程
/*set和get严格遵守java语言的规范*
set
public void set+属性名单词首字母大写(一个参数跟属性数据类型一样){
	此处可以设置关卡
	属性名 = 参数名;
}
get
public 返回值类型(跟属性类型一样) get+属性名单词首字母大写(无参数){
	return 属性名;
}
*/

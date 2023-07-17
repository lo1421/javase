public class 学生测试{
	public static void main(String[] args){
		//创建张三对象
	学生 张三 = new 学生();
	//对学号实例变量手动赋值
	张三.学号=110;
	//访问实例变量张三.学号
    System.out.println(张三.学号);
	//对姓名实例变量手动赋值
	张三.姓名="张三";
	//访问实例变量张三.姓名
    System.out.println(张三.姓名);
	System.out.println("----------------------");
	//创建对象李四
    学生 李四 = new 学生();
	//为学号实例变量手动赋值
    李四.学号=220;
	//访问实例变量李四.学号
	System.out.println(李四.学号);
	//为姓名实例变量手动赋值
    李四.姓名="李四";	
	//访问实例变量李四.姓名
	System.out.println(李四.姓名);
	}
}
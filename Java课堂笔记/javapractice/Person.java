public class Person{
	//年龄-属性-实例变量-成员变量
	//进行封装第一步：属性私有化
	//属性私有化，即用关键字private修饰该属性，那么该属性将只能在该类中访问，出了大括号就无法访问了
	private int age;
}
/*
封装的目的：
1.保证数据的安全性，防止重要数据被随意访问
2.隐藏复杂，暴露简单，便于调用者的访问
封装的步骤
1.属性私有化，用private修饰需要保护的属性属性
2.为调用者提供简单的访问入口
*/

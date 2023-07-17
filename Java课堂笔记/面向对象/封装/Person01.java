/*
1.怎么进行封装？
第一步：属性私有化（使用private关键字对属性进行修饰）
第二步:对外提供简单的操作入口
2.封装在代码上怎么实现？
*/
public class Person01{
	//private表示私有的，该实例变量只能在本类中访问了，出了这个类，age这个属性就无法访问了
	private int age;
}
//接下来我将会在PersonTest01这个类中对Person01类的实例变量age进行访问

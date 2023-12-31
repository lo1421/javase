/*
一、面向对象有三大特点
1.封装
2.继承
3.多态
  先有封装，有了封装才有继承，然后才有多态。
1.1 面向对象的首要特征是：封装
1.2 封装是什么？
基于现实生活中有很多实际的例子都是封装的体现
如手机、电视机、照相机...这些都是外部有一个坚硬的外壳将内部封装起来，以保证内部的部件是安全的，
另外封装了之后，对于我们使用者来说，我们是看不见内部的复杂结构的，我们也不需要知道内部的复杂结构，
我们只需要操作外部的几个简单的按钮来实现设备的功能
（那么既然java工程师是为了解决现实世界的问题，是通过模拟现实世界成虚拟世界，然后java工程师通过操作
虚拟世界来解决现实世界的问题，那么程序也应该像现实世界一样具备封装这一个特性）
1.3 封装有什么作用？
第一个：保证内部结构的复杂性
第二个：屏蔽复杂，暴露简单
1.4 封装在代码级别上，有什么作用呢？
一个类体中的对象级别的任何数据，假设封装起来后，对代码的调用人员来讲，不需要关心代码的复杂体现，只需要通过若干个简单
的操作入口就可以访问了，另外，类体中安全级别较高的对象级别的数据封装起来之后，外部人员就不可随意访问了，这样能保障数据的安全性
*/

/*
接下来会写一个Person类，这个类型的对象的实例变量没有使用封装机制
尝试分析这样有什么缺点？会不会有bug？
Person表示人类
每个人都有年龄age这样的属性
*/
public class Person{
	//实例变量/属性(未封装)
	int age;
}
//接下来我会在外部写一个PersonTest的类，使用main方法来访问age实例变量
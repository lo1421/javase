/*
第一题：
1.设计日期类，每个日期对象都可以描述年月日信息
2.分析：
3.对象/实例变量属于成员变量
4.成员变量在不手动赋值的情况下，系统会给属性赋上默认值
5.类的定义的语法
【修饰符列表】 class 类名{
	类体 = 属性+方法
}
6.类名、接口名在标识符的规范中规定每个单词首字母都大写
*/
//日期类
class Date{
	int year;
	int month;
	int day;
}
//男人类
class Man{
	int id;
	String name;
	boolean sex;
	Woman w;
}
//女人类
class Woman{
	int id;
	String name;
	boolean sex;
	Man m;
}
//账户类
class BankAccount{
	int accountID;
	String password;
	double balance;
}
//微信账号类
class weChatAccount{
	int weChatID;
	String phoneNumber;
	String weChatname;
}

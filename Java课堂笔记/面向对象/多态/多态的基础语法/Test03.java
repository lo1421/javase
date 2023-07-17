/*
1.在这里我们将继续学习为什么我们在进行向下转型的时候，需要使用instanceof运算符搭配着条件语句
在运行阶段动态的判断引用的类型，这是因为你可能有时候其实肉眼看不出来传给你这个引用所指向的对象和你强转之后的对象
是否前后一致？这个时候就需要去判断一下，以防出现ClassCastException（类转换异常）
2.我将为你具体的具一个实例，让你明白向下转型的时候，设置instanceof作为关卡的重要性
*/
 class AniamlTest{
	
		//test()这个方法是你编写的
		public void test(Animal02 a){
			//别人调用你这个方法的时候，会给你的方法传一个传一个实际参数，而这个参数可能是子类型的对象
			//既可以是Cat02类型也可以是Bird02类型，因为这是符合多态的语法规则的，这属于向上转型，自动类型转换
			//父类型Animal02引用指向子类型对象
			//对于我来说，我也不知道别人到底是会传一个Cat02类型对象还是Bird02类型的对象，你是不知道的，所以你如果要
			//向下转型的话你就必须判断传给父类型引用到底是什么类型的对象，然后再对应进行各自的向下转型（强制类型转换）
			if(a instanceof Cat02){
				Cat02 c = (Cat02)a;
				c.catchMouse();
			}else if(a instanceof Bird02){
				Bird02 b = (Bird02)a;
				b.catchWorm();
			}
		
	}
}
public class Test03{
	//这个main()方法是别的程序员写的，他会去调用你写的test()方法
	public static void main(String[] args){
		//他要去访问AnimalTest这个类下的test()方法，应该创建对象，因为这个test()方法是实例方法
		//只有创建了对象才可以访问
		//创建一个对象
		AniamlTest at = new AniamlTest();
		at.test(new Cat02());
		//别人调用你的test()方法，传进去的是Cat类型的对象，说明此时父类型引用指向的就是Cat子类型的对象
		//那么这个时候你有两条路可走，使用instanceof运算符就把引用指向的对象类型判断出来了，就可以规避ClassCastException的错误
	}
}
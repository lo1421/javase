public class ChineseTest01{
	
	public static void main(String[] args){
		
		System.out.println("main方法执行啦！");
		
		//创建Chinese01类的对象
		Chinese01 c = new Chinese01();
		//使用“引用.的方式调用doSome()方法
		c.doSome();
		//如果我用“类名.”的方式访问实例方法会出现什么？
		Chinese01.doSome();
		/*会出现以下错误
		ChineseTest01.java:12: 错误: 无法从静态上下文中引用非静态 方法 doSome()
                Chinese01.doSome();
                         ^
1 个错误
	
		*/
		
		
		
		
		//使用“引用.”的方式调用doOther()方法
		c.doOther();
		//使用“类名.”的方式调用doOther()方法
		Chinese01.doOther();
		//采用“引用.”的方式和“类名.”的方式调用静态方法编译器和运行器都没有报错
		//这可以得出一个结论“静态的量既可以用“引用.”的方式调用，又可以使用“类名.”的方式调用”
		/*
		但是我们不建议java程序员使用“引用.”的方式去访问或者调用类级别的量（包括静态方法和静态变量），这是因为
		你要清楚实例相关的量只有一种访问或者调用的方式！！那就是“引用.”，但你非要用“引用.”的方式去访问静态相关的量，编译运行都没有问题
		这会让程序员困惑，会误以为你使用“引用.”的方式是在访问实例相关的，访问实例相关的量是需要创建对象的。所以还是建议使用“类名.”的方式
		去访问或者调用类级别的量（包括静态方法和静态变量）。
		而且就算你使用“引用.”的方式去访问或者调用类级别的量（包括静态方法和静态变量），也是不需要创建对象的，因为编译器识别到你
		是在使用非静态上下文访问静态的量的时候会自动将“引用.”变成“类名.”的。这也是为什么“空引用”访问静态的量时候不会出现空指针异常
		因为不需要new对象，就说明引用不管有没有保存对象在堆内存的地址都不影响你去访问在方法区的静态变量和调用静态方法（压栈内存在stack里分配）
		但是你访问实例变量相关的就不行了，你必须得new对象，只有new运算符调用构造方法在堆区为当前对象开辟出来内存之后，你才可以访问当前对象相关的量，
		当你又创建新的对象的时候，又会在堆内存中开辟出一块新的空间，用“引用.”作为指针，又继续访问你现在新创建的对象相关的量（实例方法和对象方法）。
		*/
		
		//那么我使用“空引用”去访问静态的量会出现空指针异常“NullPointerException”吗？
		c = null;
		c.doOther();//没有出现空指针异常
		//我再试下使用“空引用”调用实例相关的量
		c.doSome();//编译不会报错，但是运行时会出现空指针异常现象NullPointerException
		/*
		所以经过上述测试我们可以知道NullPointerException:
		空指针异常的本质是：“空引用”访问实例相关得到量（包括实例变量和实例方法）
		
		*/
		
		
		
		
		
		/*Chinese01 c1 = new Chinese01("张三");
		System.out.println(c1.name);
		System.out.println(c1.getAge());
		c1.setAge(10);
		System.out.println(c1.getAge());
		
		//访问实例变量idCard
		System.out.println(c.idCard);
		//访问country静态变量
		System.out.println(c.country);
		System.out.println(Chinese01.country);
		*/
	}
}
/*
接下来继续学习跟static关键字有关的知识点
对照着学习
*/
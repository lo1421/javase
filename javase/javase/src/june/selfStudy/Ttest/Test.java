package june.selfStudy.Ttest;
/*
1、泛型是在什么条件下被定义出来的？
在没使用泛型之前，我们为了增强代码的扩展性或者抽象性的时候，会采用抽象编程的思想，程序员会利用继承和多态的基础语法
来实现抽象编程，在没有出现泛型之前，程序员通常也提供了抽象编程的的思路，那就是，通过Object根类（它作为一切包装类和引用数据类型的超类）
可以实现对Object的引用“任意化”操作，这种“任意化”的操作就是对Object引用进行向上转型以及向下转型操作，但向下转型有时候涉及到了
某些强制类型转换的错误，这有可能不会被编译器捕捉到，而在运行后出现异常，可见强制类型转换存在安全隐患，所以为了规避这种安全隐患，提高
程序的类型的安全性和代码的可读性
2、泛型可以使用在什么地方？
泛型可以在各种上下文中使用，包括类、接口、方法等
3、泛型的最终目的或者优点是？
泛型提供了类型安全、代码重用、简化类型转换、编译时类型检查以及程序设计规范等优点，
使得 Java 程序更加健壮、可读性更高，并提高了开发效率。
 */

/**
 * 这是一个没有使用泛型的时候，我们编写代码时会存在的问题
 * ClassCastException
 */
public class Test {
    private Object b;
    //构造方法
    public Test(){
    }
    public Test(Object b){
        this.b = b;
    }
    //setter and getter
    public  void setB(Object b){
        this.b = b;
    }
    public  Object getB(){
        return b;
    }
    public static void main(String[] args){
        Test t = new Test();
        t.setB(10);//自动装箱，这里没有使用new integer(int value);这是手动装箱：将基本数据类型转换为包装类型
        System.out.println(t.getB());
        t.setB(new Boolean(false));
        /*
        'Boolean(boolean)' is deprecated and marked for removal
        这是表明我使用的是已经过时的手动装箱的方法，编译器会提醒你使用了已过时的方法，但是程序是可以运行的
         */
        Boolean b= (Boolean)t.getB();
        System.out.println(b);
        t.setB(new Float(12.3));
        Integer i = (Integer)t.getB();//这里编译器是不会报错的，因为语法上这里是没有错的
        System.out.println(i);//但是运行的话这里会出错吗？会的
        /*
        Exception in thread "main" java.lang.ClassCastException:
        class java.lang.Float cannot be cast to class java.lang.Integer (java.lang.Float and java.lang.Integer are in module java.base of loader 'bootstrap')
	at june.selfStudy.Ttest.Test.main(Test.java:47)
	这是因为在向下转型的时候其实很有可能出现强制类型转换的错误，那么这个时候泛型的定义就被编写出来了，为的就是解决问题
         */
    }
}

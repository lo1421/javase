package june.selfStudy.ExceptionTest;

import java.util.jar.JarOutputStream;

/*
《 异常类的概述 》
在这里我们将学习java中的异常
1.异常是什么？异常在java中是以什么样的形式存在的？
异常是指在程序中出现的不正常的情况
在java中异常是以class类的形式存在的，java中的每个异常都有对应的封装好的类
2.java提供异常处理机制有什么用？
异常通常可以被new出来，而JVM有时候可以new异常类的异常类型的对象，异常类中有构造方法，既有无参构造方法又有有参构造方法，
其中有参构造方法的参数是String类型的，new对象的时候可以传进去String类型的实际参数，这就是异常信息。JVM在new了异常类型的对象之后
会在控制台上输出打印异常信息，然后程序员可以看见异常信息之后，就可以对程序进行修改，这样可以增强程序的健壮性
这就是java中的异常处理机制
3.异常是在程序执行过程中出现的不正常的情况
java语言是很完美的语言，提供了异常的处理方式，以下的程序中出现了不正常的情况，java把该异常信息输出打印在了控制台上，供程序员参考，程序员看到异常
之后，可以对程序进行修改，让程序更加的健壮
 */
public class ExceptionTest01 {
    public static void main(String[] args) {

    }
    /*
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at june.selfStudy.ExceptionTest.ExceptionTest01.main(ExceptionTest01.java:29)
    */
}


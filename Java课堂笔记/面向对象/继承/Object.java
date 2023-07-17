/*
1.Object类在哪里？
在源代码中
2.源代码在哪里？
java/JDK-17.0.6/lib/scr.zip
3.在src/base/java/lang这个langrage中有Object老祖宗类
4.没有显示继承别的类，则这个类默认继承Object类
*/
package java.lang;

import jdk.internal.vm.annotation.IntrinsicCandidate;


public class Object {

    
    @IntrinsicCandidate
    public Object() {}//无参构造方法/缺省构造器

   
    @IntrinsicCandidate
    public final native Class<?> getClass();
	//注意：当源码当中的一个方法以“；”结尾，并且修饰符列表中有“native”关键字，则表示该方法是表示底层调用C++写的dll程序（dll表示链接库文件）

    
    @IntrinsicCandidate
    public native int hashCode();
//注意：当源码当中的一个方法以“；”结尾，并且修饰符列表中有“native”关键字，则表示该方法是表示底层调用C++写的dll程序（dll表示链接库文件）


    public boolean equals(Object obj) {
        return (this == obj);
    }//实例方法
	//equals表示相等
	

   
    @IntrinsicCandidate
    protected native Object clone() throws CloneNotSupportedException;
//克隆方法：已经有一个对象a，想创建一个跟a一模一样的对象，就可以调用Object类（老祖宗类）的clone()方法
//克隆方法也是以“；”结束，而且修饰符列表有“native”关键字，那么表明clone()克隆方法也是底层调用C++编写的dll（dll表示链接库文件）
//任何一个类都是继承Object的
    
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }//toString()转换字符串的方法，一会可以测试一下toString()方法


    
    @IntrinsicCandidate
    public final native void notify();//底层调用c++的dll（dll链接库文件）
	//此方法是以“;”结束，而且修饰符列表有“native”关键词

    @IntrinsicCandidate
    public final native void notifyAll();//底层调用C++的dll（链接库文件）
//此方法也是“;”结束，而且修饰列表有native关键词修饰

   
    public final void wait() throws InterruptedException {
        wait(0L);
    }



    public final void wait(long timeoutMillis, int nanos) throws InterruptedException {
        if (timeoutMillis < 0) {
            throw new IllegalArgumentException("timeoutMillis value is negative");
        }

        if (nanos < 0 || nanos > 999999) {
            throw new IllegalArgumentException(
                                "nanosecond timeout value out of range");
        }

        if (nanos > 0 && timeoutMillis < Long.MAX_VALUE) {
            timeoutMillis++;
        }

        wait(timeoutMillis);
    }

    
	
	
    @Deprecated(since="9")
    protected void finalize() throws Throwable { }
}

package javase.Nine;
/*
编写一个名为Outer的类，它包含一个名为Inner的类。
在Outer中添加一个方法，它返回一个Inner类型的对象。
在main方法中，创建并初始化一个指向某个Inner对象的引用。
 */
public class Outer {
    Inner i;

    class Inner {

    }

    public Inner inner() {
        Inner inner = new Inner();
        return inner;
    }

    public static void main(String[] args) {
        Outer o = new Outer();
        Inner i = o.inner();  // 调用inner()方法获取Inner对象的引用
    }
}


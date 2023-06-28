package june.selfStudy.StringTest;
/*
现在我们把数组已经学习完了，java.util.Arrays工具类也已经学习完了，现在我们就可以看看java.lang.String这个JDK内置的类有什么我们可以学习
了解的东西。
可以看看API帮助文档中java.lang.String 这个类是如何定义的？继承了什么类？实现了 什么接口？使用什么修饰符？
我们通过对java.lang.String这个类的源代码的学习，我们知道String这个类：
1.public final class String{}
extends Object
implements Serializable, Comparable<String>, CharSequence
2.String 类表示的是字符串类型，在java中属于引用数据类型，不属于基本数据类型
3.在java中但凡是双引号括起来的全部都是实现String这个类的实例，例如“abc”，“123”，“xyz”这三个都是表示java中的字符串的实例化的兑现。
4.在java中规定，双引号括起来的字符串对象一旦生成就不可变，这意味着“abc"不能变成”abcd“，也不能变成”ab“
5.在JDK中双引号括起来的字符串对象，是不可变的，而且是字符串常量，储存在JVM的方法区中的‘字符串常量池’当中的

思考，为什么SUN公司要将字符串对象设置为常量，而且将字符串对象储存在方法区的‘字符串常量池’当中？
通过询问ChatGPT可以总结出四个方面的原因：
1.节省内存空间：
字符串使用频率高，而且很可能会创建相同的字符串对象，如果将字符串对象设置为常量并且储存在‘字符串常量池’当中，就可以
避免创建大量相同值的字符串对象，节省了内存空间。而且如果字符串常量池中已经创建了的字符串对象，后续的字符串操作就可以直接引用字符串常量池当中的
字符串，就不用重复创建新的字符串了。
2.字符串的不可变性：
字符串对象一旦创建，其值就是不可修改的，这种设计决策带来了一些优势，例如线程安全性，缓存哈希码。将字符串对象设置为常量可以
保证其不变性。增强安全性，防止意外修改导致的风险
3.提高字符串的比较效率：
如果使用的静态初始化字符串对象，就是使用双引号括起来的字面值就是一个储存在字符串常量池当中的一个字符串对象。那么一个字符串被多个引用指着的时候
这些引用保存的字符串内存地址都是在 字符串常量池当中的地址，这样的话比较字符串对象是否相同，直接比较引用即可完成，而无需比较字符串的内容，使用双等号
操作符比较引用这样的方式比较高效。因为比较引用比比较大型的字符串的代价要低得多。

但是要注意，使用==比较引用的方式不适用于，使用动态初始化的方式创建的字符串对象的比较，这是因为一旦使用了new运算符，除了在字符串常量池当中创建
字符串对象意外还会在堆内存中创建一个String类型的对象，这个字符串对象是在方法区中的字符串对象的一个副本，二者保存的字符串的字面值是相同的。但是
这个时候引用保存的内存地址就是new出来的堆内存中字符串副本的内存地址，只要new了一个字符串对象就会有一个引用去保存，这样的话就不能单单使用"=="
来比较引用完成字符串内容的比较，而是应该使用String类中重写的toString方法来进行字符串内容的比较。所以还是建议使用equals方法来比较
两个字符串对象是否相等。

虽然使用equals()方法进行字符串比较可能会稍微降低一些效率，但它是一种可靠的方式，可以避免出错。在实际开发中，
确保程序的正确性比微小的效率差异更为重要。因此，使用equals()方法进行字符串比较是更加保险和可靠的做法。

4.支持字符串的编译期优化：
将字符串对象作为常量存储在常量池中，使得编译器可以在编译期对字符串进行优化。例如，对于相同的字符串字面值，
编译器可以共享常量池中的字符串对象，从而减少重复的字符串对象的创建。

 */
public class StringTest01 {
    public static void main(String[] args){

    }
}

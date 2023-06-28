package june.selfStudy.ArraysTest;

import java.util.Arrays;//这里自动导入了java.util.Arrays这个包

/*
在这个程序中将会对java.util.Arrays这个类中定义的ToString静态方法进行测试。
Arrays中的toString方法是静态的，调用这个方法，传一个数组作为参数即可，然后使用print方法输出就可以将这个数组中的元素以方括号括起来
通过逗号隔开的形式输出来。
Arrays类的确有从Object中继承方法，比如常见的几个有toString(),equals(),hashCode()等等方法，但是这些从Object中继承过来的实例方法在
Arrays类中其实并没有被重写，因此可以不用通过Arrays类来调用这些没有改写的方法，这些没有改写的方法的具体实现依旧是在Object类中的功能

需要注意的是，虽然 java.util.Arrays 类继承了 java.lang.Object 类中的方法，但它是一个工具类，主要用于操作数组，而不是作为普通对象的基类。
因此，大部分情况下，你不需要直接使用 java.util.Arrays 类从 java.lang.Object 类继承的方法。

但是Arrays作为工具类，其中定义的静态方法可以基本实现对数组进行的一些操作，比如我刚刚学习的可以执行对数组中保存的元素进行排序的操作
在这里还可以学习把数组的内容转换成字符串，其实也就是数组遍历的功能，但是这个方法返回的是字符串，所以要搭配着print方法来使用

通过查看java的API文档我们可以看到toString方法有很多重载的方法
一个一维数组作为形式参数的toString方法：
byte[] short[] int[] long[] float[] double[] boolean[] char[] Object[] 这九个作为参数的方法都有一一对应的toString方法



 */
public class StaticToStringTest {
public static void main(String[] args){
    int[] arr = {1,2,3,4,5,6};
    //输出数组中的内容，也就是遍历数组，也就是将数组转换成字符串的操作
    System.out.println(Arrays.toString(arr));
    //[1, 2, 3, 4, 5, 6]
    boolean[] arr1 = {true,false,true,false};
    System.out.println(Arrays.toString(arr1));
    //[true, false, true, false]
}
}

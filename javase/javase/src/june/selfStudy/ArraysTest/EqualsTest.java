package june.selfStudy.ArraysTest;
import java.util.Arrays;
/*
Arrays作为工具类，当中定义了很多可以处理数组的方法，而不是作为普通对象的基类，所以搞清楚Arrays这个类的定义，你就可以知道
这个类为什么要定义那么多，那么齐全的处理所有类型的一维数组的方法，包括基本数据类型和引用数据类型的一维数组。

这个类中也有比较两个数组对象是否相同的静态的equals方法，通过传进去两个一维数组对象到这个方法中，会返回boolean类型的值，
如果返回true，则表明两个数组对象是相同的，如果返回false，则表明两个数组对象是不同的。

这里的equals方法是静态方法，要与Object中继承的equals方法进行区分，静态的方法不需要new对象就可以调用

通过看了API帮助文档之后，可以知道Arrays中的equals静态方法的形式参数是传进去两个同类型的数组对象，然后在这个方法中进行比较之后
如果数组对象相同就返回true，如果数组对象不相同就返回false。
而且Arrays类中有九个这样的重载方法，包括 byte[] short[] int[] long[] float[] double[] boolean[] char[] Object[]
 */
public class EqualsTest {
    public static void main(String[] args) {
        //创建两个数组对象
        int[] arr1 = new int[3];
        int[] arr2 = new int[4];
        //现在调用Arrays类中定义的equals方法来比较这两个数组对象是否相同？
        System.out.println(Arrays.equals(arr1,arr2)?"相同":"不同");
    }
}

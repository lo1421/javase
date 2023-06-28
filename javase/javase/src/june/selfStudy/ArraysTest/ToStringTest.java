package june.selfStudy.ArraysTest;

import java.util.Arrays;
/*
其实排序方法中的排序原理有两种，一种是冒泡排序算法，一种是选择排序算法
其中冒泡排序算法是上限变化，将最大数据作为泡排好顺序
选择排序算法是下限变化，选择出最小的数据排好顺序
在这两种排序算法中选择排序的算法效率更高，虽然二者比较的此数值是相同的，但是元素的位置的次数是不一样的。

在java.util.Arrays类中全部都是静态的方法，这是因为java.util.Arrays这个类是工具类。这就意味着你在使用者个类中的方法的时候
不需要创建对象，直接通过类名就可以完成方法的调用，不过子在其他类中使用Arrays类中的方法，需要将java.util.Arrays这个package导入
到类中。静态方法是类级别的方法而不是对象级别的方法，因此可以通过类名来访问这些方法，而不需要实例化该类。
 */
public class ToStringTest {
public static void main(String[] args){

    /*
    现在我们来练习Arrays类中的sort方法，sort翻译为排序。Arrays类中的排序可以实现对数组中的数据从小到大循序进行排序
    参考API帮助文档，我们可以知道Arrays类中sort方法有很多的重载的方法，我们可以多测试几个
   1.public static void sort（单个形参）{}
   byte[] short[] int[] long[] float[] double[] char[] Object[].一共有八个，除了没有boolean类型，其它的都有
     */
    int[] arr = {1,6,8,4,3,5,9,2,7};
    Arrays.sort(arr);
    //还是按照规矩来慢慢一个一个遍历吧
    for (int i:
         arr) {
        System.out.println(i);
    }
    byte[] arr1 = {13,11,12,14};
    Arrays.sort(arr1);
    for (byte b:
         arr1) {
        System.out.println(b);
    }
    float[] arr2 = {1.2f,1.4f,1.6f};//float型的字面值必须要加上f或者F
    Arrays.sort(arr2);
    for (float f:
         arr2) {
        System.out.println(f);
    }
    /*
    现在去看一下sort方法形式参数不止一个的方法具体怎么使用吧！
    上述讲的sort方法中只用一个参数的方法，其实那8个方法每个都对应一个按照指定的范围进行排序的方法，只不过这样的话，
    sort就必须有三个形式参数
    这里我们可以拿int【】 数组作为例子
    static void sort(int[] arr);将数组全部元素排序为上升的顺序
    static void sort(int[] arr,int fromIndex , int toIndex);将数组的指定范围排序为上升的顺序。
可以知道这个方法中的第一个参数是传进去即将进行排序的数组，第二个参数是数组中指定范围排序的开始元素的索引，第三个参数是指定范围排序结束的元素的索引
     */
int[] arr3 = {1,8,9,3,5,2,4,6,7};
Arrays.sort(arr3,2,5);//1 8 2 3 5 9 4 6 7
    //遍历数组
    for (int i:
         arr3) {
        System.out.println(i);
        // 1 8 3 5 9 2 4 6 7
    }
    /*
    java.util.Arrays 类中的 sort(int[] a, int fromIndex, int toIndex) 方法用于对指定范围内的数组元素进行排序，
    但不包括 toIndex 索引处的元素。
    具体说来，该方法会对数组 a 中从索引 fromIndex（包含）到索引 toIndex（不包含）之间的元素进行排序。
     */

}
}

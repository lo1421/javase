package june.selfStudy.ArraysTest;
import java.util.Arrays;
/*
这是binarySearch方法的测试类，二分法查找算法是利用二分法的算法从数组中查找是否存在某个元素，我们通常将这个要查找的元素叫做目标元素
如果查找到了就返回查找到的元素的索引，表示数组中有这个目标元素，要是返回-1，则表示这个数组中没有目标元素。

可见这个binarySearch 方法是静态的返回值类型为int类型的方法.但是特别需要注意的是，这个方法传进去的数组必须上升类型的数组
这表明在使用二分法查找算法的时候，数组必须基于排序算法！！！

查看了API帮助文档之后就会发现，binarySearch方法除了有9种一维数组类型的查找，而且还有对应的九个跟sort方法类似的可以在
数组指定的范围内进行操作的方法，这个时候就需要传进去四个形式参数
public static int equals(int[] a,int  fromIndex ,int  toIndex,int key);
分别表示
要在int[]型的一维数组a中查找
范围是从数组元素的索引【fromIndex，toIndex）中查找目标元素int型 key
如果查到就返回目标元素的下标，如果没有查到就返回-1

 */
public class BinarySearchTest {
public static void main(String[] args){
    int[] arr = {1,4,5,67,9,8};
    Arrays.sort(arr);
    System.out.println(
            Arrays.binarySearch(arr,8)==-1?"数组中不存在该元素":"数组中存在该元素而且下标为："+Arrays.binarySearch(arr,8)
    );
}
}

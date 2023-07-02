package wuyue.main.args;
/*
在这个类中将会实现把使用逐一查找的数组元素的查找封装到一个方法中
对方法的要求：
找到目标元素，方法返回数组中对应元素的下标
未找到目标元素，方法返回-1
分析：
1.这个方法应该定义几个参数？
方法设置几个形式参数是由方法体中会出现或者使用到几个外部传过来的实际参数决定的，在数组元素查找的过程中，这个方法会涉及到
外部传过来的数组以及需要在该数组中查找的那个元素，故该方法应该有两个形式参数。
2.方法的形式参数分别定义成什么类型？
数组形参定义成Object类型的可以不？查找的元素定义成它的数据类型即可
3.方法返回值应该是什么？
按照对方法的要求可以知道方法应该返回int型数据
 */
public class ArraySearch01 {
    //程序的入口
    public static void main(String[] args) {
        //数组的静态初始化
        int[] arr = {4,5,6,87,8};
        //调用数组元素查找的方法
        //可以定义一个变量来接收方法返回的值
        int index = arraySearch(arr,8);
        /*
        光标停在爆红的自定义的但未具体编写的方法上，然后按组合键alt+enter，接着会弹出一个小窗口，
        点击create Method 'arraySearch' in 'ArraySearch01'（这句话表示：在ArraySearch01类中创建arraySearch方法）
        注意：这里由IDEA自动生成的方法是默认private的且static的，我们可以根据自己的需求来修改，
        在这里我们将private修改为public
         */
       System.out.println( index==-1?"数组中不存在目标元素":"数组中存在目标元素并且下标为："+index);
    }

    public static int arraySearch(int[] arr, int ele) {
        /*
        在这个方法中，我们要实现在传进来的数组中使用逐一查找法来查找是否存在传进来的元素
        如果存在，那么我们就返回该对应元素的下标，如果不存在，那么就返回-1即可
         */
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==ele) return i;
        }
        return -1;
    }

}
/*
既然我们已经实现了使用逐一查找的方法查找数组的元素，那么我们现在继续使用二分法来完成数组元素的查找，见程序ArrayUtil.java的程序
 */

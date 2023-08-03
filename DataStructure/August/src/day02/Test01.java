package day02;

public class Test01 {
    //冒泡排序算法的测试
    public static void main(String[] args) {
        int[] arr1 = {4,5,7,38,22,1};
        bubbleSort(arr1);//进行冒泡排序
        showArray(arr1);//遍历排序后的数组
        //第二种方式的冒泡排序的测试
        int[] arr2 = {3,42,4,1,87,43};
        bubbleSort2(arr2);//进行冒泡排序
        showArray(arr2);

    }
    public static void bubbleSort(int[] arr){
        for (int end = arr.length-1; end >0 ; end--) {
            boolean sorted =true;
            //System.out.println(end);5,4,3,2,1六个数据只用五轮外层循环即可
            for (int i = 0; i < end; i++) {
               // System.out.println("i---->"+i);刚好是每进行一轮然后就去掉最右边元素的下标
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] =arr[i+1];
                    arr[i+1] = temp;
                    sorted = false;
                }
            }
            if(sorted==true){
            break;
            }
        }
    }
    public static void showArray(int[] arr){
        for (int i:
             arr) {
            System.out.println(i);
        }
    }
    //如果是换一种方式来写冒泡排序我们又该如何实现呢？
    public static void bubbleSort2(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            boolean sorted = true;
            //System.out.println("i---->"+i);1,2,3,4,5六个数据刚好外层循环循环五次
            for (int j = 0; j < arr.length-i; j++) {
//                System.out.println("j--->"+j);这里也是刚好把冒出去的气泡给排除在外了
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            sorted = false;
            }
            }
            if(sorted==true){
                break;//如果传进来的数组是排好顺序的，那么我们就不用进行排序了
            }
        }
    }
}
/*
拓展：
 我们可以试着观察出冒泡排序的算法效率，即时间复杂度和空间复杂度
 */
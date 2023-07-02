package javase.Five;
import java.util.Scanner;
/*
编写程序，从键盘手上输入5个整数，并存放到一个数组中，然后计算所有元素的和、最大值、最小值以及平均值
 */
public class ArrayTest {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("请输入五个整数：");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int sum = 0;
        int min = 0;
        int max = 0;
       for(int i = 0 ; i< arr.length;i++){
            sum+=arr[i];
            if(arr[i]<arr[min]){
                min = i;
            }if(arr[i]>arr[max]){
                max = i;
           }
        }
        System.out.println("max:"+arr[max]+",min:"+arr[min]+",sum:"+sum+",average:"+sum/arr.length);
    }
}

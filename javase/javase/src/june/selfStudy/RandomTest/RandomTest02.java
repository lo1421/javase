package june.selfStudy.RandomTest;

import java.util.Random;

/*
题目的要求：
生成五个不相同的随机数，（期间如果有相同的随机数生成要求重新生成随机数）并将生成的五个随机数放入数组中
 */
public class RandomTest02 {
    public static void main(String[] args){
        //这里我们就生成五个int型的随机数吧
        Random r = new Random();
        //这里是使用显式无参构造方法来创建的Random类型的对象，这里系统会默认分配种子，每次使用r来调用相同的方法都会生成不同的随机数，这是因为
        //随着系统分配的种子是随着时间的变化而变化的
        //这里定义的count是用来计数是否生成了五个不一样的随机数
        int count = 0;
        //这里也是显式的使用动态初始化的方式创建了一个int型的一维数组
        int[] arr =new int[5];
        //因为我要使用循环来解决这个问题
        while(count<=4){
            int num = r.nextInt();
            if(num!=r.nextInt()){
                arr[count] =num;
                count++;
            }
        }
        for (int i:
             arr) {
            System.out.println(i);
        }
    }
}

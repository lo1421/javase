package day06;

import java.util.Random;

/*
这是一个专门用来测试java.util.Random 这个类中的一些方法和一些属性的，感觉之前学的不是很熟悉
 */
public class RandomTest {
    public static void main(String[] args) {
        //    创建Random对象，然后再访问当中的一些方法和属性
        System.out.println("====================================");
        System.out.println("===============random.nextBoolean()=====================");
        Random random  = new Random();
        System.out.println(random.nextBoolean());
        System.out.println(random.nextBoolean());
        System.out.println(random.nextBoolean());
        System.out.println(random.nextBoolean());
        System.out.println(random.nextBoolean());
        System.out.println(random.nextBoolean());
        System.out.println(random.nextBoolean());
        System.out.println(random.nextBoolean());
        System.out.println("===============random.nextBytes(Byte[] bytes)=====================");
        byte[] bytes = new byte[10];
        random.nextBytes(bytes);
        for (byte b:
             bytes) {
            System.out.println(b);
        }
        System.out.println("===============random.nextDouble()=====================");
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextDouble());
        }
        System.out.println("===============random.nextFloat()=====================");
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextFloat());
        }
        System.out.println("=================random.nextInt()===================");
        for (int i = 0; i < 10; i++) {
            System.out.println( random.nextInt());
        }
        System.out.println("=================random.nextInt(int Bound)===================");
        for (int i = 0; i < 10; i++) {
            System.out.println( random.nextInt(20));
        }
        System.out.println("=================random.nextLong()===================");
        for (int i = 0; i < 10; i++) {
            System.out.println( random.nextLong());
        }
        System.out.println("=================random.nextGaussian()===================");
        for (int i = 0; i < 10; i++) {
            System.out.println( random.nextGaussian());
        }
    }
}

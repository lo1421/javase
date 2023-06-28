package june.selfStudy.RandomTest;

import java.util.Random;

/*
题目要求：
生成五个随机数，要求这五个随机数不能重复，重复的话就必须重新生成，然后将这五个随机数放进数组中

这里会涉及到随机数类，这个类是在java.util.Random 中，我们可以查看一下Random源代码，查看里面有什么构造方法是可以用来
分配什么类型的随机数对象，然后再查看这个随机数类中有没有什么方法是我们可以调用的。也可以查看API帮助文档

1.Random 类是在java.util包下的类，而且实现RandomGenerator这个接口（翻译为：随机数发生器）在JDK的源代码中Random类是实现了RandomGenerator
这个接口的，所以不要搞错了，虽然在API文档中显示这个Random类是没有实现RandomGenerator这个接口的，而且使用chatGPT的时候，也是回答的2021年之前的
java的知识
2.Random类中有无参构造方法和一个有参构造方法（参数为long seed）
3.Random 类中有很多的nextBytes nextInt nextLong nextDouble next 等等的方法有的是有参数的有的是没有参数的，这些方法都是公开实例的方法
4.Random类中的无参构造方法
创建一个新的随机数发生器
Random类中的有参构造方法只有一个
public Random(long seed){...}
5.Random类中的方法
Boolean  实例方法   nextBoolean()            返回下一个伪随机、均匀分布的 boolean值从这个随机数生成器的序列。
void     实例方法   nextBytes(byte[] bytes)  产生随机字节，并将它们放置到提供的字节数组中。
double   实例方法   nextDouble()             返回下一个伪随机、均匀分布的 double价值 0.0和 1.0之间从这个随机数生成器的序列。
float    实例方法   nextFloat()              返回下一个伪随机、均匀分布的 float价值 0.0和 1.0之间从这个随机数生成器的序列。
Int      实例方法   nextInt()                返回下一个伪随机、均匀分布的 int价值从这个随机数生成器的序列。
int      实例方法   nextInt(int bound)       返回一个随机、均匀分布的 int值在0（含）和指定值（独家），从这个随机数发生器的顺序绘制。
long     实例方法   nextLong()               返回下一个伪随机、均匀分布的 long价值从这个随机数生成器的序列。
一.其中的nextInt(int bound)这个有参的方法中间的参数是表示边界，这意味着生成的Int随机数的范围是[0,bound)，要注意这里边界是不被包含在生成的
随机数中的，所以范围就是从0开始知道bound截止但是不包含bound。所以使用nextInt（int bound）方法生成的随机数的范围是0（包含）到bound（不包含）

二.Random类中的有参构造方法的意思是表明手动的为创建的随机数对象分配一个种子，如果是使用具有相同的种子的的随机数对象的话，那么就在使用具有相同种子的
引用调用相同的生成随机数的方法为前提的时候，生成的随机数会是相同的，

基本的原理：手动为 `Random` 分配种子的意思是你可以指定种子值，这个种子值将确定随机数生成算法的初始状态。
在 `Random` 类的有参构造方法中，传入的种子值将被用作随机数生成算法的起始点。相同的种子值将导致生成相同的随机数序列，
因为随机数生成算法的状态是通过种子值来确定的。通过指定种子值，你可以控制随机数的生成过程，并确保在相同种子值下生成的随机数序列是可重复的。
这在某些情况下可能是有用的，比如在调试或测试过程中需要使用确定性的随机数。需要注意的是，如果不指定种子值，`
Random` 类的构造方法将使用系统时间作为默认种子，从而产生看似更为随机的随机数序列。

    }
}


 */
public class RandomTest01 {
    public static void main(String[] args){
        //这里是显式的创建了两个具有相同种子的Random对象
        Random r1 = new Random(12345L);
        //这里Random当中的有参构造方法的参数种子的类型是long
        Random r2 = new Random(12345L);
        //然后使用这两个相同种子的Random对象去调用相同的生成随机数的方法
        int i1 = r1.nextInt();
        System.out.println(i1);//1553932502
        int i2 = r2.nextInt();
        System.out.println(i2);//1553932502
        //上述生成的两个随机数应该是一样的，因为我们手动给Random分配的种子，而不是系统随着时间而随机生成的种子
        //试着调用nextInt(int bound)这个方法
        int i3 = r1.nextInt(101);
        //调用这个有参的生成整数型的方法的话生成的随机数就只能是[0,100]之间的整数，因为你规定101是边界（边界是不被包含进去的）
        int i4 = r2.nextInt(101);
        //上述的i3和 i4应该生成的是一样范围而且值也一样的随机数
        System.out.println("i3:"+i3+","+"i4:"+i4);//i3:9,i4:9
        /*
        既然我们已经把java.util.Random这个类基本的知识点学好了，现在开始回答老师给的题目吧，见程序RandomTest02
         */

    }
}

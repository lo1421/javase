package june.selfStudy.RandomTest;

import java.util.Random;

/*
现在继续来学习java.util.Random这里个类
1.Random类中有一个方法 public double nextDouble() 这样一个实例方法，使用Random对象来调用的话，会返回一个随机数是double类型的
数据，而且范围是[0.0,1.0），换句话就是生成的随机数是0（包含）到1.0(不包含)的随机数。这种生成随机数的方式是通过显式的方式使用Random类的
实例实现的。
2.其实在java.lang.Math这个类中也有一个可以生成[0.0,1.0)这个范围的double型随机数的方法，只不过二者其实实现的方式是不一样，java.lang.Math
中生成随机数的方式是使用类名调用一个静态的Mate.random方法来实现，这是隐式的方式。
ChatGPT中是这样描述的“Math.random()方法是通过隐式使用一个全局的Random实例来生成随机数，”
 */
public class RandomTest03 {
    public static void main(String[] args){
        //由于Math类是在java.lang.Math包下，所以用的时候可以不用导入包
        //这里就是一个调用Math类中的Random的静态的方法来实现生成一个double类型的范围在0（包括）到1.0（不包括）的随机数
        double a = Math.random();
        System.out.println(a);
        //现在使用显式的方式创建一个java.util.Random类型的对象来调用实例方法返回一个同样类型和范围的随机数，这里就需要导入包了
        Random r = new Random();//解决因为没有导包造成的爆红的现象，按组合键ALT加回车
        double d = r.nextDouble();
        System.out.println(d);

    }
}

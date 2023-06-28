package june.selfStudy.DateTest;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
昨天对Date这个类的记忆变得不那么清晰了，现在我们继续再重新学习一下
Date这个类应该是在java.util.Date下
1.Date类中的构造方法都有哪些呢？
无参构造方法，可以分配一个日期对象，只不过这个对象在使用print输出的时候肯定会调用Date类重写的toString方法，然后就会输出一日期对象，
当然这个日期对象肯定是以字符串的形式被输出到运行台上的，只不过这个字符串对象可读性差，所以此时我们就可以利用一个可以将日期的格式进行转换的方法
2.那么这个方法是定义在哪里的呢？这个方法叫做format(),而且这个方法是在SimpleDateFormat这个类当中的。
3.SimpleDateFormat这个类在java.text.SimpleDateFormat这个包下，是用来实现自定义的日期的格式化的类
4.SimpleDateFormat这个类如何使用呢？
由于SimpleDateFormat这个类中的format方法是实例方法，而且是返回String类型的值，然后参数是Date类型的变量，这意味着调用这个方法
就必须使用显式的方式先导入java.text.SimpleDateFormat这个包，然后创建SimpleDateFormat类的对象，最后使用SimpleDateFormat
对象的引用去调用format方法，把Date对象作为实际参数传到方法当中
5.要注意SimpleDateFormat类型的对象在创建的时候如果使用的是有参构造方法来显式的创建一个对象的话，这个有参构造方法是有参数的
这个参数是有pattern（格式），这里的格式其实就是你想要自定义的日期的格式，其中有些固定的格式的符号，代表的是固定的含义，只要遵守一定的对应的规则即可
也就是说只要符号没有乱用，其它的符号都是可以写到这个字符串当中的，对了这个有参构造方法的形参类型是字符串类型的对象
6.其实SimpleDateFormat这个类中还有无参构造方法，这意味着创建对象的时候是可以使用无参构造方法来完成SimpleDateFormat对象的创建的
只是，这里创建的SimpleDateFormat是默认分配的系统给的指定的日期对象，我们可以使用个format方法来测试一下，默认的日期的格式是个什么样的格式
 */
public class DateTest02 {
    public static void main(String[] args){
        //这里使用无参构造显式方式来创建SimpleDateFormat对象
        SimpleDateFormat  sdf = new SimpleDateFormat();
        //创建一个日期对象，这是表示当前日期的日期对象
        Date date = new Date();
        //调用SimpleDateFormat类中的format方法
      String s =  sdf.format(date);
        System.out.println(s);//2023/5/30 上午12:02
        //哈哈哈哈其实系统默认给的日期格式化的pattern其实还是很好用的，只是我们调用有参构造方法来显式的创建一个SimpleDateFormat类型
        //的对象，可以自定义这个日期对象格式化的pattern，不然系统默认罢了
        String pattern = "yyyy-MM-dd  HH:mm:ss SSS";
        SimpleDateFormat sdf1 = new SimpleDateFormat(pattern);
        //这里就是自定义日期的格式化处理的形式，而不是使用系统默认的格式
        String time = sdf1.format(date);
        System.out.println(time);//2023-05-30  00:07:19 105
    }
}

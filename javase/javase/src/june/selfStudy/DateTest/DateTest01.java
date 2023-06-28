package june.selfStudy.DateTest;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
我们今天先把java中的Date类的相关的知识点给整理了吧！
java.text.Date这个类具体是个什么样子呢？我们可以看看源代码里Date类长什么样？
这个类很正常就是Public class Date来声明的类然后实现了几个接口
我们重点学习java.text.Date 类中的一个无参构造方法

现在去源代码中看看SimpleDateFormat这个类是如何写的，并且看看API帮助文档中是如何解释format方法的用法和注意事项的

java.text.SimpleDateFormat这个类继承自java.text.DateFormat这个类，而且java.text.SimpleDateFormat这个类可以实现简单的
日期格式化的操作，并且可以自定义日期的格式。SimpleDateFormat类是继承了DateFormat类中的format（Date date）方法并且重写了，通过这个类的
对象调用format方法就可以完成日期格式化的操作。可以实现
Date类型 --转换为--> String类型
 */
public class DateTest01 {
    public static void main(String[] args)throws Exception{
        //分配一个Date对象并初始化此对象，以分配他的时间可以精确到毫秒
        Date nowTime = new Date();
        //这里为什么会爆红？是因为Date类在java.text这个包下的，使用的时候需要导包到这个类中才可以
        //光标停留在Date（）上，然后按组合键alt加上回车，就可以导入你需要的包，注意是导入你需要的包，有可能有同名但是不在同一个包下的类的情况
        //然后我们就可以输出这个我们创建的时间对象，输出的时间是当前的系统的时间精确到了毫秒
        System.out.println(nowTime);//Sun May 28 22:38:42 CST 2023
        //这里是肯定会调用Date类中重写的toString方法的，因为你输出的直接是对象的引用
        //我们来看看结果是什么吧！
        //很显然这个时间不符合我们通常认为的时间的格式，是不好阅读的，那么我们是否有什么办法可以将这个日期类对象转换成格式化吗？
        /*
        我们可能会有这样的几个解决办法：
        1.去源代码中将java.text.Date类中从Object类中继承的toString重写的方法再进行重写
        这显然是不可行的，因为你修改的源代码只是你电脑上的JVM中的源代码，但是换一个系统就不适用了
        2.写一个类去继承java.text.Date类，这个子类专门写一个特有的方法是用来完成日期的格式化的
        这显然也是不建议的，因为你必须随时把这个你定义的子类写在一个文件中然后随时待在身上才可以
        3.那是否有一个大众承认的方法可以实现对日期的任意形式的格式化呢？有的，就是利用SimpleDateFormat这个类
        创建一个SimpleDateFormat类型的对象，然后再调用这个类中定义的一个format方法，由于这个方法的形式参数是
        Date类型的变量，而且该方法的返回值类型是String，那么使用SimpleDateFormat 类型的引用调用format方法
        就可以实现将Date类型 --转换为-->String类型
         */
        SimpleDateFormat sdf  = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        //这里是要初始化SimpleDateFormat对象的属性的，传一个String类型的参数
        /*
        要注意这里的字符串什么样的字符是不可以随意改变的，因为是有具体的含义的，所以不能随意的改动，这里的知识点可以参考API文档
        yyyy年（年是四位数，y表示年）严格区分大小写
        MM月（月是两位）
        dd日
        HH小时
        mm分钟
        ss秒（小s表示秒）
        SSS（大S表示毫秒，三位数，因为1000毫秒==1秒，所以毫秒的最大值为999，如果在大一毫秒就要进一位到秒上）

        注意：有参构方法里面的String参数是可以自定义的日期的格式化，除了上述的字母不可以改动，其它的都是可以改动的
        而且其实是还有些字母表示一些含义的，只是在这里没有写出来
         */
        //然后就可以调用format方法实现Date型-->String型的转换
        String time = sdf.format(nowTime);
        System.out.println(time);//2023-05-28 23:18:30:274
        //接下来你可以思考如何实现将字符串类型转换为Date类型？！！！！！
        /*
        这当中是否也有什么样的方法可以调用实现
        String类型--转换为-->Date类型
        有的！！调用SimpleDateFormat类中定义的parse方法即可，那么这个方法应该是返回Date类型的值，然后参数的类型是String类型的变量
        而且这个方法是实例方法
        那么接下来试着将“2023-05-28 23:18:30:274”这个转换为Date类型吧
         */
        String s = "2023-05-28 23:18:30:274";
        //创建一个SimpleDateFormat类型的对象并初始化
        SimpleDateFormat sdf2 = new SimpleDateFormat("-MM-dd HH:mm:ss:SSS");
        //如果这里的字符串的格式跟你要解析的字符串的格式不同的话，是会报错的，会报ParseException的错误
        Date datetime = sdf2.parse(s);//这里会出现一个异常，你只要把这个异常在main方法哪里抛出即可

        // 必须按照你在创建SimpleDateFormat类型对象初始化时间的格式转换
        System.out.println(datetime);//Sun May 28 23:18:30 CST 2023


    }
}

package wuyue.main.args;

import java.util.Arrays;
public class Arrays02 {
    //在这里将要编写一个调用java.util.Arrays.equals()方法来判断两个数组对象是否相等，并且测试java中main方法当中的String数组参数有什么具体的用
    //main方法是我们编写出来，然后由JVM调用
    public static void main(String[] args) {
        //对JVM调用main方法的时候传的参数进行测试，判断JVM调用main方法的时候创建的String数组长度为多少
        //顺便可以遍历一下
        System.out.println(args.length);//0
        //这表明JVM在调用main方法的时候，创建的String类型数组并没有在这个数组中存放任何元素
        //相当于 String【】 args = {};
        for(int i = 0;i< args.length;i++){
            System.out.println(args[i]);
            //我们其实可以模拟JVM调用main方法的全过程
        }
        //这里就是JVM调用main方法过程的模拟
        main1(new String[0]);
        //那么java中的main方法中的String数组参数到底有什么用呢？
        /*
        其实这个String类型数组是命令行参数，是拿来给用户在命令行输入想输入的String对象
        这些命令行参数的输入的规则是什么呢？
        1.必须是String类型的对象
        2.每个元素都必须以空格分离，然后这些String类型对象将会自动保存到main方法的String数组当中，但其实这个String数组长度具体是用户输几个
        String类型对象，那么这个String数组的长度就有多长
        我们可以试着遍历这个由用户输入命令行参数来验证这个猜想
         */
        //现在要求用户输入的命令行参数必须满足规定的要求才能使用我们编写的这个系统
        //要求：用户名：伍寒冰 用户密码：123456789.正确之后才可以使用这个系统
        //接收main方法中传过来的命令行的参数
        String s1 = args[0];
        String s2 = args[1];
        String[] str = {"伍寒冰","123456789"};
        if(Arrays.equals(args,str)){
            System.out.println("登录成功！");
            System.out.println("欢迎:"+str[0]+"回来");
        }else
        {
            System.out.println("登录失败!");
            System.out.println("用户不存在");
        }
        }
    //我们其实可以模拟JVM调用main方法的全过程
    public static void main1(String[] args){
        System.out.println("JVM 调用了这个main方法");
    }

}

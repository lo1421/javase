package june.Homework;

import java.util.ArrayList;
import java.util.Iterator;

/*
题目：
11.4
创建一个元素是字符串的ArrayList对象，在其中添加若干元素，编写程序，用下面3中方法将其中的每个字符串转换为大写
（1）通过索引循环访问
（2）使用迭代器
（3）使用replaceAll（）方法
 */
public class UpperCaseTest {
    //创建一个元素是字符串的ArrayList对象
    public static void main(String[] args) {
        ArrayList<String>names = new ArrayList<>();
        names.add("张三");
        names.add("王五");
        names.add("李四");
        //（1）通过索引（下标）循环访问
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            //调用String类中的转换大写的方法toUpperCase()
            name = name.toUpperCase();
            names.set(i,name);
        }
        System.out.println(names);
        //使用迭代器
        Iterator<String>it = names.iterator();
        ArrayList<String>names2 = new ArrayList<>();
        while(it.hasNext()){
            String name = (String) it.next();
            name = name.toUpperCase();
            it.remove();
            names2.add(name);
        }
        names.addAll(names2);
        System.out.println(names);
        //(3)调用replaceAll()方法
        names.replaceAll(String::toUpperCase);
        System.out.println(names);
    }
}
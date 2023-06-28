package june.selfStudy.Gather.Collection;

import java.util.*;

/**
 * 题目：在项目中创建类Muster，在主方法中实例化集合对象，
 * 并向集合中添加元素，最后将集合中的对象以String形式输出
 */
public class Muster {//创建Muster类
    public static void main(String[] args){
        Collection<String>list = new ArrayList<>();//使用多态加上实现类的知识为Collection接口创建对象
        list.add("a");//向集合中储存元素
        list.add("b");
        list.add("c");
        list.add("c");
        //调用Collection从Iterated接口中继承的iterator()方法返回一个Iterator<>类型的集合的构造器
        Iterator<String>it = list.iterator();
        //调用集合构造器（接口）中的方法来实现在此集合上的元素的遍历
        while(it.hasNext()){
             String str= (String)it.next();
            System.out.println(str);
        }
    }
}
/*
上述的项目其实也可以测试出ArrayList这个实现类由于是实现了List接口，
而List集合包括所有的List接口和所有的List实现类，List集合中储存元素的特点是
有序且可重复的
有序是指储存元素的顺序就是插入对象的顺序
可重复是List集合可以储存相同的元素
List 集合中的元素有序其实也可以体现在元素有下标

List接口中定义了一下两个非常重要方法
get(int index):获得指定索引位置的元素
set(int index,Object o):将集合中指定索引位置的对象修改为指定的对象

那么List接口的所有的实现类全部都实现/继承了List接口中的这两个方法
 */
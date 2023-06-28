package june.selfStudy.Gather.Collection;

/*
  List 接口的常用实现类有Arraylist和LinkedList

  ArrayList实现了可变的数组，允许保存所有的元素，包括null，并可以根据索引的位置对集合进行快速的随机访；
  缺点是向指定的索引位置的插入对象或者删除对象的速度比较的慢

LinkedList类采用链表数据结构储存对象，这种结构的有点事便于向集合中插入和删除对象，需要向集合中插入，删除
对象的时候，使用LinkedList类实现List集合的效率较低

使用List集合时通常声明为List类型，可通过不同的实现类来实例化集合

ArrayList和LinkedList实现类来实例化List集合的语法：
List<E>list = new ArrayList<>();
List<E>list2 = new LinkedList<>();
上述的代码中的E可以是合法的java数据类型。例如，如果集合中的元素为字符串类型，那么E可以修改为String。
 */

import java.util.*;


/**
 * 在项目中创建类Gather。在主方法中创建集合对象，通过Math类的random方法来随机的获取集合中的某个元素，
 * 然后移除数组中索引位置是“2”的元素，最后遍历数组。
 */
public class Gather {//创建类Gather
    public static void main(String[] args){//主方法
        List<String> list = new ArrayList<>();//创建集合对象，底层是数组数组结构

        list.add("a");//往集合中添加元素
        list.add("b");
        list.add("c");
        int i = (int)Math.random()*list.size();//获取[0,2]之间的随机数
        System.out.println("随机获取数组中的元素："+list.get(i));//获取随机数指定索引位置的元素
    list.remove(2);//将指定索引位置对应的元素移除，这里的效率比较低，因为底层是数组数据结构
    }
}

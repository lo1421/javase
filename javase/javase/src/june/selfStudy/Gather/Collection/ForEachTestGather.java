package june.selfStudy.Gather.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
之前我们已经知道了增强型for循环可以用来遍历数组，那么现在我们俩看看foreach是否可以用来遍历集合
 */
public class ForEachTestGather {
    public static void main(String[] args){
        //创建集合对象，使用泛型机制
        List<String> strList = new ArrayList<>();//非线程安全的ArrayList集合
        //这里插入一个语法就是使用工具包中的Collections中的一个静态方法让ArrayList集合变成线程安全的集合
        Collections.synchronizedList(strList);//这样就把ArrayList集合变成了线程安全的
        //往集合中添加元素
        strList.add("Hello");
        strList.add("World");
        //遍历集合、迭代集合
        Iterator<String> it = strList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("-----------------------------------------");
    //由于是List集合，那么List集合中的元素都有下标，使用下标遍历集合
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }
        System.out.println("------------------------------------------");
        //使用List接口中的将集合中的所有元素转换为Object[]型的数组的方法
      Object[] o = strList.toArray();
        for (Object o1:
             o) {
          String s = (String)o1;
            System.out.println(s);
        }
        System.out.println("------------------------------------------");
        //使用增强型for循环遍历集合
        for (String str:
             strList) {
            System.out.println(str);
        }
        //很显然使用foreach来遍历集合，代码很简洁
        }
    }


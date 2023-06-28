package june.selfStudy.TreeSet;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/*
在项目中创建UpdateStu类，实现Comparable接口，重写该接口中的compareTo()方法。
在主方法中创建UpdateStu对象，创建集合，并将UpdateStu对象添加到集合中。
遍历该集合中的全部元素，以及通过headSet().subSet() 方法获得部分集合。
 */
/*
TreeSet 集合是Set接口的实现类，Set集合是Set接口和Set的实现类组成的。Set接口继承了Collection中所有的方法，
所以Set集合含有Collection中的所有的方法，TreeSet接口实现了Set接口，同时还实现了SortedSet接口，这表示TreeSet集合中
的元素是无序且可不可重复的，但是是可排序集合。TreeSet实现类中也有自定义的一些拓展方法，由于TreeSet集合是无序的，集合储存的元素都是没有下标的
这意味着其中的方法都不会涉及下标。
 */
public class UpdateStu implements Comparable{

    String name;
    long id;
public static void main(String[] args){
    UpdateStu us1 = new UpdateStu("张三",71222307);
    UpdateStu us2 = new UpdateStu("李四",71222305);
    UpdateStu us3 = new UpdateStu("王五",71222306);
    UpdateStu us4 = new UpdateStu("马六",71222303);
    //创建集合对象
    TreeSet<UpdateStu> treeSet = new TreeSet<>();
    treeSet .add(us1);
    treeSet .add(us2);
    treeSet .add(us3);
    treeSet .add(us4);
    for (UpdateStu us:
            treeSet ) {
        System.out.println(us);
    }
    //通过headSet方法获取一个新集合，这个集合储存的是原集合不包含截止元素之前的所有的元素
   SortedSet<UpdateStu> headset =treeSet.headSet(us2);
    for (UpdateStu us:
            headset ) {
        System.out.println("截取前面的部分：");
        System.out.println(us);
    }
    //通过subSet方法获取一个新集合，这个集合储存的是包含截始元素不包含截终元素之间的所有的元素
    SortedSet<UpdateStu> subset = treeSet.subSet(us2,us3);
    for (UpdateStu us:
           subset ) {
        System.out.println("截取中间的部分：");
        System.out.println(us);
    }
}
public int compareTo(Object o){
    UpdateStu us= (UpdateStu)o;
    //要求比较两个学生的id，如果相同则返回0，如果大于则返回1，如果小于则返回-1
    int result = id>us.id?1:id==us.id?0:-1;
    return result;
}
public UpdateStu(){

}
public UpdateStu(String name,long id){
    this.name = name;
    this.id = id;
}
public String toString(){
    return "name:"+name+"   "+"id:"+id;
}

}

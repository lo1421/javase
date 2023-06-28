package june.selfStudy.Gather.Collection;
/*
Collection 集合中有很多的方法，而且由于Collection集合是所有单个方式储存元素的接口和实现类的根接口，
这就致使所有的子接口和子实现类都继承这些方法，所以它们的引用都可以用这些方法，接下来我也只讲几个Collection集合中常用的方法

void add(E e)  向集合中添加指定元素
void remove(Object o) 删除集合中指定的元素，remove的前提是传进去的实际参数要存在于集合中，这就要求先判断集合中是否存在某个元素，若有才能删除该元素
boolean contains(Object o)  判断集合中是否存在某个指定元素，该方法底层是调用了集合中元素对应的类重写的equals方法（所以存放在集合中的元素一定要
重写祖宗类中继承过来的equals方法）
boolean isEmpty()  判断集合中是否没有元素
int size()   获取集合储存的元素的个数即获取集合的大小
boolean contains(Object o)   搜索集合中有没有某个元素，在比较实参元素是否和有和集合中的元素相同的时候，底层调用的是元素应该重写的equals方法
Iterator iterator()    返回此集合基础上的一个集合的迭代器，该迭代器是一个接口，其中有一些方法调用是可以实现对集合中的元素进行迭代的作用的
void clear()  清空集合/删除集合中的所有的元素
Object[]  toArray()  返回包含此集合中所有元素的数组

 */

import java.util.ArrayList;
import java.util.Collection;

/**
 *所以其实调用toArray方法可以先把集合中的所有元素先转换为存放Object类型的元素的集合，然后可以通过遍历这个数组，
 * 就可以间接的遍历/迭代集合中的元素，这样其实就可以间接完成迭代器的工作
 */
public class CollectionTest02 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
       Object[]  arr =  list.toArray();//调用该方法将集合中的所有的元素全部转换为Object数组
        //遍历这个数组
        for (Object o:
             arr) {
            System.out.println(o);//调用String类中重写的toString方法
        }
    }
}

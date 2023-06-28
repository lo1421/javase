package june.selfStudy.Gather.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 1、在这个程序中我将进行对Collection这个根接口中的部分重要的方法进行测试
 2、为什么测试Collection集合中的方法？
 这是因为Collection集合是以单个元素储存元素的所有的子集合和实现类集合的根类，那么这些子接口集合和实现类集合都继承
 Collection集合中的方法，利用继承的知识可以提升代码的扩展性
 3、由于Collection是接口，那么在进行测试的时候，要想创建接口的引用指向一个实例，那么就要利用多态的知识点，
 利用实现类去创建Collection集合类型的对象
 */
public class CollectionTest01 {//创建类

    public static void main(String[] args) {
        Collection<User> list = new ArrayList<>();//创建Collection集合对象
        User u1 = new User("李四", 1111);//使用实现类创建User对象
        User u2 = new User("张三", 2222);
        User u3 = new User("王五", 3333);
        User u4 = new User("李四", 1111);
        list.add(u1);//将User对象存放到Collection集合当中
        list.add(u2);
        list.add(u3);
        System.out.println(list.size());//获取Collection集合中储存元素的个数 3
        System.out.println(list.isEmpty());//判断集合Collection是否为空 false
        list.remove(u3);//这个remove方法是Collection集合中的remove方法，用来删除集合中指定的元素
        System.out.println(list.size());//获取集合的大小也就是获取集合中储存元素的个数
        Iterator<User> it = list.iterator();//创建此状态下的当前构造器
        /*
        集合的构造器其实就是一个快照，会拍下当前状态下的集合的状态，然后执行的就是快照对应的集合的副本
        不可以使用非当前状态下的构造器去迭代当前状态下的集合，这样会报一个错：java.util.ConcurrentModificationException
        这个异常翻译为“并发修改异常”
         */
      /*
       while(it.hasNext()){//遍历集合中存放的元素
            User u = (User)it.next();
            System.out.println(u);//这里会自动调用User中重写的toString方法
            */
        //如果我把集合的状态改变了，但是没有跟新迭代器,不是使用当前状态下的迭代器去迭代集合中的元素会出什么样的问题？
        /*
        经过测试：可以知道如果集合状态发生改变之后，迭代器没有同步修改，编译时就会报错”java.util.ConcurrentModificationException“
       报错的原因就是集合的状态发生变化时候，迭代器没有相应的重新获取，那么就会报“并发修改异常”这个错误。
       但是如果集合的状态的改变是由于调用了集合的remove方法删除集合中的元素才导致的集合的状态发生改变的话，那么还是可以挽救的
       可以通过调用当前集合对应的构造器中的remove方法，这样就可以同步的删除副本集合和原集合中的元素，这样就不用再因为集合的状态的变化，
       而去实时的更新迭代器了
         */
       /* list.remove(u1);
        while (it.hasNext()) {//遍历集合中存放的元素
            User u = (User) it.next();
            System.out.println(u);//这里会自动调用User中重写的toString方法*/
            /*
            Exception in thread "main" java.util.ConcurrentModificationException
	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
	at june.selfStudy.Gather.Collection.CollectionTest01.main(CollectionTest01.java:44)
             */
/**
 *  但是要注意的是迭代器中的remove方法删除的是通过迭代器中的next()方法返回的元素也就是从集合中取出来的这个元素，所以迭代器中remove方法的使用
 * 必须是跟在next（）方法当中的，而集合中元素的迭代，必须先判断集合有没有下一个可以迭代的元素，如果有才可以使用next方法去获取这个可以迭代的元素
 *而且要知道迭代器在被获取的时候，其实指向的不是集合中的第一个元素，只有调用了it.hasNext()这个方法时候，如果集合中有下一个元素，迭代器才会往下一位指
 * 不然的话是不会向前移动（迭代）的
 */
while(it.hasNext()) {
    //hasNext（）方法返回一个Boolean类型的值，如果返回true则表示可以集合中有下一个可以迭代的元素，返回false表示集合中没有下一个迭代的元素了
    //调用迭代器中的next方法，可以返回一个集合中的元素，只不过返回的时候利用了向上转型的多态的基础语法，这就导致返回的一定是一个Object类型的元素
    //所以如果后续要调用集合元素中特有的方法还要利用多态的向下转型的基础知识
    User u = (User) it.next();
    System.out.println(u);
    it.remove();//这里就表示删除了当前迭代器指着的元素
}
        System.out.println(list.size());//所以这个地方集合中的元素的个数为零
        }
    }


class User {
    String name;
    long id;

    //构造方法
    public User() {

    }

    public User(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (null == obj || (obj instanceof User)) return false;
        //强制类型转换，父类型引用访问子类型对象特有的属性
        User u = (User) obj;
        return this.id == u.id;
    }

    public String toString() {
        return "name:" + name + " " + "id:" + id;
    }
}
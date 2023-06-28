package june.selfStudy.TextTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericTest01 {
    public static void main(String[] args){
        List myList = new ArrayList();
        Cat c = new Cat();
        Bird b = new Bird();
        myList.add(c);
        myList.add(b);
        Iterator it = myList.iterator();
        while(it.hasNext()){
            Animal a =(Animal) it.next();
            if(a instanceof Cat){
                Cat c1 = (Cat)a;
               c1.catchMouse();
            }else if(a instanceof Bird){
                Bird b1 = (Bird)a;
                b1.fly();
            }
        }
    }
}
class Animal{

}
class Cat extends Animal{
    public void catchMouse(){//catch() 这样定义编译器是会报错的，因为标识符要与关键字区别开来
        System.out.println("猫抓老鼠");
    }
    /*
    在给方法命名时，需要注意避免使用Java中的保留关键字作为方法名。在你的代码中，`catch`是Java的保留关键字，用于捕获异常。
    因此，如果你尝试将方法命名为`catch`，编译器会报错，因为它与关键字冲突。
    当你将方法名修改为`catchMouse`时，不再与Java关键字冲突，所以编译器不会报错。
    记住，在命名方法时要避免使用保留关键字和其他已经在Java中使用的名称。
     */
}
class Bird extends Animal{
    public void fly(){
        System.out.println("鸟在飞");
    }
}
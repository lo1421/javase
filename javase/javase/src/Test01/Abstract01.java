package Test01;
/*
接口中有常量和抽象方法和静态方法和默认方法
抽象方法由public abstract修饰，但是可以省略
常量是由public final static 修饰的也可以省略
但是当非抽象类实现接口的时候，必须把常量和抽象方法的public加上，把abstract去掉
接口中的静态方法不能被实现类给继承，接口中的默认方法被default关键字修饰，默认方法中有方法体。静态方法中也有方法体

在早期的java版本中接口中的所有的方法都必须是抽象的，在java8之后，java中的接口添加了两种具体实现的方法，一个是静态方法由static修饰，一种是默认方法
被default关键字修饰
1.javaSE8之后，java中的接口中可以定义具体实现的静态方法，一切跟接口有关的静态方法都可以在接口中具体实现，这样就不在需要辅助类了
接口中定义的静态方法跟类中定义静态方法一样使用static修饰
接口中静态方法的访问方式是： 接口名.方法名（）
接口中的静态方法是不会被任何实现类继承的也不能被子接口继承

2.可以给接口中的任意方法提供一个默认实现，这称为默认方法，默认方法需要使用default关键字来修饰
接口中的默认方法可以访问的方式是通过引用来来访问的，默认方法可以被接口和实现类继承。但是若子接口中定义相同的默认方法，
那么子接口的默认方法就会覆盖从父类中的默认方法，父接口中的默认方法就会被覆盖
 */
public class Abstract01 implements A{
    public void m(){

    }
    /*
    一个类实现多个接口的时候，就要实现所有接口中的抽象方法，接口中的常量和默认方法都能被继承，但是接口中的静态方法不能被继承
     */
    //实现接口类中的抽象方法
    public static void main(String[] args) {
        A a = new A() {
            public void m() {
                System.out.println("A接口中的抽象方法");
            }
        };
        a.m();
Abstract01 a1 = new Abstract01();
a1.getA();
a1.m2();
      
    }
}
interface A{
    //接口中的常量
    public static final int A=10;
    int AA=11;
    //抽象方法
    void m();
    //静态方法
    public static void m1(){
        System.out.println("接口A中的静态方法");
        System.out.println(AA);
    }
    //默认方法
    public default void m2(){
        System.out.println("接口A中的默认方法");

    }
    public default void getA(){
        System.out.println(A);
    }
}

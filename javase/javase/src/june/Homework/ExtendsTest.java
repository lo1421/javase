package june.Homework;

public class ExtendsTest {
    public static void main(String[] args){
        B b = new B();
        System.out.println(b.toString());//B 的toString方法
        C c = new C();
        System.out.println(c.toString());//B 的toString方法
        /*
        1.如果自己这个类没有重写，而直接继承和间接继承的类当中都继承并重写了从更高的类中继承的方法，通过自己调用这个继承但是没有重写的方法
        是调用重写的方法的时候，是直接调用直接继承的父类中的重写的方法，而不是间接继承的类中的重写的方法
        2.如果自己这个类继承并重写了直接继承和间接继承的中的方法，其实是继承的是直接继承的类中的方法，而不是间接继承的类中的方法，当我调用这个
        继承并且重写了的方法的时候，就是执行的自己本身的重写的方法，这个就是“子类优先原则”
         */
    }
}
class A {
  public String toString() {
      return "A 的toString方法";
  }
}
class B extends A{
    public String toString() {
        return "B 的toString方法";
    }
}
class C extends B{

}

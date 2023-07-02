package javase.Ten;
//10.1
public class DuckTest {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.swim();
        duck.fly();
    }
}
class Duck  implements Swimmable ,Flyable{
    public void  swim(){System.out.println("Duck can swim!");}
    public void fly(){System.out.println("Duck can fly!");
    }
}
interface Swimmable{
     void swim();
}
interface Flyable{
    void fly();
}
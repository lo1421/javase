package june.selfStudy.Ttest;
/*
Object 类为最上层的父类，很多程序员为了使程序更为通用，设计程序的时候通常使传入的值
与返回的值都以Object类型为主。当需要使用这些实例的时候，必须正确地将该实例转换为原来的类型，否则
在在运行时就会发生ClassCastException异常
所以就在IDK1.5版本之后以后，提出了泛型机制，其语法如下
类名<T>
其中T代表一个类型的名称
 */

/**
 * 将之前的代码使用泛型机制的语法之后，进行改正之后的重要的代码如下
 */
public class OverClass <T>{
    private T over;
    public T getOver(){
        return over;
    }
    public void setOver(T over){
        this.over = over;
    }
    public static void main(String[] args){
OverClass<Boolean> oc= new OverClass<Boolean>();
OverClass<Float> oc1 =  new OverClass<Float>();
     oc.setOver(true);//这个时候访问就不需要进行类型转换了，因为你使用了泛型，将类型参数化了.实在是太妙了！
        System.out.println(oc.getOver());
     oc1.setOver(12.2f);
        float f1 = oc1.getOver();
        System.out.println(f1);
    }
}

package Test01;

public class ZYZF {
    public static void main(String[] args) {
        String newLine = "\n";
        String tab = "\t";
        System.out.println("制表符：" + tab);
        System.out.print("换行符：" + newLine);
        System.out.println("\"");

    }
}
/*
听说final修饰的类可以实现接口,这如果是真的，那么接口也可以规避java中final类不能继承的特点吗
 */
final class  B implements C{
    public void main(){

    }
}
interface C{
    void main();
}
/*
是的，你听到的是正确的。在Java中，使用`final`修饰的类可以实现接口。当一个类被声明为`final`时，它表示该类是最终的，不能被继承。但是，它仍然可以实现接口。

通过使用`final`修饰类并实现接口，可以达到以下效果：

1. 类无法被其他类继承，即具有最终性质。
2. 类可以遵循接口的规范并实现接口中定义的方法。

这样做的一个主要用途是，有时我们希望限制某个类的继承性，但仍然需要让该类遵循某个接口的规范，以便能够在其他地方使用该接口类型的引用来操作该类的实例。

需要注意的是，虽然接口可以被`final`类实现，但接口本身并不规避Java中`final`类不能被继承的特点。`final`类仍然不能被其他类继承，无论它是否实现了接口。
 */
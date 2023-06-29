package june.Homework.InterfaceTest;
/*
在这里我们将进行对给定半径的球体进行面积和体积的计算！
球面积：4*PI*R*R
球体积：4/3*PI*R*R*R

 */
public class Shpere implements A{
private double radius;
public Shpere (double radius){
    this.radius = radius;
}
public double area(){
    return PI*radius*radius*4;
}
public void volume(){
    double v = (4/3)*PI*radius*radius*radius;
    System.out.println("球的体积为："+v);
}
public static void main(String[]  args){
    Shpere s = new Shpere(2.5);
    System.out.println("球的面积为："+s.area());
    s.volume();
}
}
//定义两个接口，一个是计算面积一个是计算体积。这两个接口中都有对应的计算的方法
interface A{
    double PI=3.14;
    //计算面积的抽象方法
    double area();
}
interface B extends A{
    void volume();
}

package javase.Five.Seven;
/*
7.4定义一个名为Square的类表示正方形，使其继承Shape抽象类，
覆盖Shape类中的抽象方法getPerimeter()和getArea()。编写程序测试Square类的使用。
 */
abstract class Shape {
    public abstract double getPerimeter();
    public abstract double getArea();
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square(5);
        double perimeter = square.getPerimeter();
        double area = square.getArea();

        System.out.println("正方形的周长：" + perimeter);
        System.out.println("正方形的面积：" + area);
    }
}


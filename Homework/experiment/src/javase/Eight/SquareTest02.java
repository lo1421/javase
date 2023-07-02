package javase.Eight;
/*
定义一个名为Square的类表示正方形，它有一个名为length的成员变量表示边长，一个带参数的构造方法
要求该类对象能够调用clone（）方法进行克隆，覆盖父类的equals（）方法，当边长相等的时候则认为两个Square对象
相等。覆盖父类的toString方法，要求当调用该方法输出Square对象的格式如下：Square【length=100】，这里的100是边长。
编写一个程序测试clone（）、equals（）和toString（）刚方法的使用。
 */
public class SquareTest02 {
    public static void main(String[] args) {
        Square  s1 = new Square(100);
        Square s2 = s1.clone();
        System.out.println(s1.equals(s2)?"相同":"不相同" );
        System.out.println("原对象："+s1.toString()+",克隆对象："+s2.toString());
    }
}
class Square implements Cloneable{
    int  length ;
    public Square(){
}
    public Square(int length) {
        this.length = length;
    }
    //重写Object的Clone方法然后克隆
    Square clone;
    public Square clone() {
        try {
            clone= (Square) super.clone();
        } catch (CloneNotSupportedException e) {
          e.getStackTrace();
        }
        return clone;
    }
    public boolean equals(Object obj){
        if(obj==this) return true;
        if(obj==null||!(obj instanceof Square)) return false;
        Square s = (Square)obj;
        return s.length == this.length;
    }
    public String toString(){ return "Square[length ="+this.length+"]";}

}

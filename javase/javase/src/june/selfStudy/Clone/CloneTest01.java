package june.selfStudy.Clone;
/*
1.要想学习Java中的克隆方法，就先看看父类Object中的clone 方法的具体实现是什么样的？
 protected native Object clone() throws CloneNotSupportedException;
2.然后再观察实现了Cloneable接口的类，然后观察这些类是如何重写Object类当中的clone方法，

最后自定义可以克隆的类，完成clone方法的重写，最后测试重写的clone的方法

最终总结出克隆方法存在的意义！！！

 */
public class CloneTest01  {
    public static void main(String[] args) {
        User u1 = new User(111111,"jack");
        //调用clone方法
        User u2 = null;
        try {
            u2 = (User)u1.clone();
        } catch (CloneNotSupportedException e) {
            e.getStackTrace();
        }
        System.out.println(u1);
        System.out.println(u2);
    }
}
class User implements Cloneable{
    private int id ;
    private String name;
    //从Object中继承的clone方法的重写
    public Object clone() throws CloneNotSupportedException{
            return super.clone();//调用克隆的方法抛出一个运行时的异常，在编译阶段必须进行处理！！
    }
    public User(){

    }
    public User(int id, String name ){
        this.id = id;
        this.name = name;
    }
    //重写Object类中的toString方法
    public String toString(){
        return "id:"+id+"    "+"name:"+name;
    }
}
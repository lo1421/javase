package wuyue.main.args;
/*
当我们真正了解了java中字符串对象是如何在内存中存放的之后，那么我们之前画的很多关于字符串内存图就是错误的，那么我们该如何修改并区理解它呢？
 */
public class StringTest02 {
    public static void main(String[] args){
        //创建User01对象
        User01 u = new User01(10001,"张三");
    }
}
class User01{
    private int no;
    private String name;
    public User01(){

    }
    public User01(int no,String name){
        this.no =  no;
        this.name = name;
    }
    public void setNo(int no){
        this.no = no;
    }
    public int getNo(){
        return no;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
package javase.one;
/*
1.1 编写程序，打印输出你的姓名和年龄。
 */
public class Print {
    private String name;
    private int age ;

    public Print(String name ,int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Print p = new Print("伍寒冰",21);
        System.out.println("name:"+p.name+",age:"+p.age);
    }
}

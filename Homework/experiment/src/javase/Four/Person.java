package javase.Four;
/*
4.1定义一个名为Person的类，其中含有一个String类型的成员变量name和一个int类型的成员变量age,
分别为这两个变量定义访问方法和修改方法，
另外再为该类定义一个名为speak的方法，在其中输出其name和age的值。
画出该类的UML图。编写程序，使用上面定义的Person类，实现数据的访问和修改。
 */
public class Person {
private int age;
private String name;

    public Person(){

}
    public Person(int age,String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void speak(){
        System.out.println("name:"+getName()+";age:"+getAge());
    }

    public static void main(String[] args) {
        Person p = new Person();
       p.setAge(21);
        p.setName("伍寒冰");
        p.speak();
    }
}

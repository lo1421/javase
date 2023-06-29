package june.Homework;

import java.util.TreeSet;

/*
题目：
11.8
假设Employee类包含一个int型的成员id，如果要求Employee可以按id值比较大小，请编写Employee类。
编写程序，创建几个Employee对象,将它们存放到TreeSet中并输出。
 */
public class Employee  implements Comparable<Employee>{
    //不要忘记将该类进行封装！！！
  private int id;
  private String name;
  //构造方法
    public Employee(){

    }

    public Employee(int id,String name) {
        this.id = id;
        this.name = name;
    }


//setter and getter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //实现了compareTo（）方法
    public int compareTo(Employee obj){
        return this.id = obj.id;
    }
    //程序的入口
    public static void main(String[] args) {
        Employee[] myList = new Employee[2];
        myList[0] = new Employee(111,"张三");
        myList[1] = new Employee(222,"王五");
        TreeSet<Employee>empList = new TreeSet<>();
        empList.add(myList[0]);
        empList.add(myList[1]);
        //这里使用的是增强型的for循环
        for(Employee emp: empList) {
            System.out.println(emp.id +" "+emp.name);

        }
    }
}

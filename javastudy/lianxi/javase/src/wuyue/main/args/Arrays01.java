package wuyue.main.args;

public class Arrays01 {
    public static boolean equals(int[] a,int[] a2){
      if(a==a2)
          return true;
      if(a==null||a2==null)
          return false;
      int length = a.length;
      if(!(length==a2.length))
          return false;
      for(int i = 0; i<length;i++){
          if(a[i]!=a2[i]) {
              return false;
          }
      }
      return true;
    }
public static boolean equals(Object[] a,Object[] a2){
        if(a==a2)
            return true;
        if(a==null||a2==null)
            return false;
    int length = a.length;
    if(a2.length!=length)
        return false;
    for(int i=0;i<length;i++){

        if (!(a[i]==null ? a2[i]==null : a[i].equals(a2[i])))
            return false;
    }
    return true;
}
    public static void main(String[] args) {
        //在这里比较两个int型数组是否相同就调用Arrays01当中我写的equals方法
        int[] i1 = {10,20};
        int[] i2 = {10,20};
        //在同一个类中调用当前类的类方法类名.可以省略
        System.out.println(equals(i1,i2));
        //创建两个引用数据类型数组，然后通过调用我在Arrays01这个类当中定义的equals方法来判断这两个引用数组是否相等
        Person[] p1 ={new Person("123","China"),new Person("456","America")};
        Person[] p2 ={new Person("123","China"),new Person("456","America")};
        System.out.println(equals(p1,p2));
    }
}
class Person{
    String id;
    String country;
    public Person() {
    }
    public Person(String id,String country){
        this.id = id;
        this.country = country;
    }
//这里应该重写Object父类的equals方法，因为在Arrays.equals 方法中调用了Person类继承Object类的equals方法
    public boolean equals(Object obj){
        //由于父类引用之后会访问子类特有的对象变量，故应该向下转型
        if(obj==null)
            return false;
        if(this == obj)
            return true;
        if(obj instanceof Person) {
            Person p = (Person) obj;
            return (this.id.equals(p.id) && this.country.equals(p.country));
        }else
            return  false;

    }
}



package wuyue.main.args.Homework;

public class Room {
    //房间里有房间编号，房间类型和房间状态这三个基本属性
    //房间编号
    private int no;
    //房间类型
    private String type;
    //房间状态
    private boolean status;
    //构造方法，有参无参都写上最好
    public Room(){

    }
    public Room(int no,String type,boolean status){
        this.no = no;
        this.type = type;
        this.status = status;
    }
    //只要是私有化了属性，那么就必须进行封装的第二步，对外部提供简单的访问入口
    //setter and getter 方法
    public void setNo(int no){
        this.no = no;
    }
    public int getNo(){
        return no;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
    public boolean getStatus(){
        return status;
    }
    //我们最好将本类作为根类的子类从Object中继承的equals方法和ToString方法重写一下，这是由于子类从父类中继承过来的方法的实现不够子类使用
    /*
    子类是有权将方法进行覆盖的，方法覆盖的要求：
    1.子类的方法的名称，返回值类型，形式参数必须和父类的方法完全相同
    2.子类的方法访问修饰符可以与父类的方法相同或者比更宽松
    3.子类的方法抛出的异常可以比父类的方法更少和更具体，但不能更多和更宽泛
    4.方法覆盖的大前提是必须两个类之间存在继承
    5.子类方法不能使用比父类方法更窄的返回类型，但可以使用相同类型或更宽泛的返回类型（即协变返回类型）。
     */
    //重写equals方法
    public boolean equals(Object obj){
        //要求当房间的房间编号相同的时候，就可以确定两个房间是相同的
        //先宏观判断再微观更具体的判断
        if(this == obj)  return true;//当当前对象和传进来的对象二者的引用是相同的，则表示这两个对象一定是相同的
        if(obj==null||!(obj instanceof Room)) return false;
        //若传进来的参数对象的引用是空的，那么会出现空指针异常，二者肯定不是同一个对象，或者传进来的参数对象直接跟当前对象不是同一个类型
        //那么二者必定不是同一个对象，直接不用后续的判断
        //这里由于obj是父类型的引用，接下来我要实现对Room的no属性进行访问，那么我在这里应该进行强制类型转换，因为no属性是子类Room特有的，

        Room room = (Room)obj;
      //  return this.no == (Room)obj.no;这样写是错误的
        return this.no == room.no;
    }
    //这里是对toSting方法的重写
    public String toString(){
        return "["+this.no+","+this.type+","+(this.status?"空闲":"占用")+"]";
    }

}

  public class Test1{
	  public static void main(String[] args){
		  //想要访问User类中的实例变量，必须先创建一个对象
		  User u = new User();
		  u= null;//空引用 访问实例（对象）相关的数据时，都会出现空指针异常
		  System.out.println(u.username);
		  // 报错 NullPointerException
	  }
  }
  class User{
	  //用户名，是成员变量里的实际变量（属性）
	  String username;
  }
  //出现空指针异常（NullPointerException）的前提条件是什么？
  //“空引用”访问实例变量（对象变量）相关的数据的时候，都会出现空指针异常
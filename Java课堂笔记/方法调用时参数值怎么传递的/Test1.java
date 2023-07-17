/*方法调用时参数传递问题
  此处针对基本数据类型类型
  */
  public class Test1{
	  public static void main(String[] args){
		 int i = 10;
         add(i);
         System.out.println("main--->"+i);//main--->10 
	  }
	  public static  void add(int i){
		  i++;
		  System.out.println("add--->"+i);//add--->11
	  }
  }
  //java中规定，参数传递的时候和类型无关，不管是基本数据类型还是引用数据类型，统一都是将盒子中保存的·那个“值”
  //复制一份传递下去
  
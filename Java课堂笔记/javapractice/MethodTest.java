public class MethodTest{
	//业务：求两个整数型数据的商。
    //方法只有调用了时候才可以执行。
	//方法体内的执行顺序是自上而下。
	//返回值类型为void时，方法体类能出现“return;”专向控制语句，表示结束当前的方法。
	//返回值类型可以是任何数据，包括基本数据类型和引用数据类型，必须得有“return 值;”这样的语句，首尾呼应。
	//实际参数列表的参数长度和数据类型必须跟形式参数列表相同才可以。
	//方法的定义只要在类体中就可以，每个方法是相互独立可以互相调用的关系。
	//方法定义的变量是局部变量，方法调用结束后，变量的内存空间被释放。
	public static int divide(int x,int y){
//[修饰符列表]     返回值类型  方法名号 （形式参数列表）
       int z = x/y;
	   System.out.println(z);
	   return z;// return x/y;
	}
	public static void main(String[] args){
		//方法的调用的格式： 类名.方法名(实际参数列表);
		MethodTest.divide(10,5);
	}
}
//方法的好处是可以提高程序的复用性，功能是完成某个特定的功能，多次调用。

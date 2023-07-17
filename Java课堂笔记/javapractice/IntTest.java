public class IntTest{
	public static void main(String[] args){
		/*char c = 'a';
		short s = 1;
		byte b = 2;
		System.out.println(c+s+b);*/
		/*int x = c + s + b;加上7.8两行编译没有保错，说明c+s+b的值是int型
		System.out.println(x);输出结果为100（int型）*/
		
		/*IntTest.java:9: 错误: 不兼容的类型: 从int转换到short可能会有损失
         short y = c + s + b;*/
		//short y = c + s + b;
		//System.out.println(y);
		//结论就是：在java语言中规定，char，short，byte在进行混合运算的时候
		//都是分别将byte,short,char转换成int型之后再进行的运算。
		long l = 1L;
		char c = 'a';
		short s = 2;
		byte b = 3;
		System.out.println(l+c+s+b);
		int x = (int)(l+c+b+s);
		System.out.println(x);
		//结论，在java语言中，long，char，byte，short进行混合运算的时候，最终的结果是‘最大容量’对应的数据类型，
		//此处的结果对应的就是long类型，必须强转才能赋值给小容量int型
		
		
	}
}
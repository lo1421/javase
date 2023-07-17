public class UserTest{
	public static void main(String[] args){
		User u1 =new User();
		u1.id = 111;
		u1.username = "zhangsan";
		u1.password ="123";
		System.out.println(u1.id);
		System.out.println(u1.username);
		System.out.println(u1.password);	
		System.out.println("---------------------------");
		User u2 = new User();
		u2.id = 222;
		u2.username = "lisi";
		u2.password ="456";
		System.out.println(u2.id);
		System.out.println(u2.username);
		System.out.println(u2.password);	
	}	
}
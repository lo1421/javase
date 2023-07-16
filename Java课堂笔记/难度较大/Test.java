//目的是想知道zhangsan是哪个城市的？
public class Test{
	public static void main(String[] args){
		Address a = new Address();
		a.city = "北京";
		a.stress = "大兴区";
		a.zipcode = "121221";
		User u = new User();
		u.id = 1111;
		u.username = "zhangsan";
		u.addr = a;
		System.out.println(u.username+"是"+u.addr.city+"的");
	}
}
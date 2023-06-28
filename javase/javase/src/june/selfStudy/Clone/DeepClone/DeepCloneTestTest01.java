package june.selfStudy.Clone.DeepClone;


public class DeepCloneTestTest01 {
    public static void main(String[] args) {
        Address address = new Address("北京","街道一");
        Person person1 = new Person("张三",address);
        //进行deep clone
        Person person2 =null;

        {
            try {
                person2 = (Person)person1.clone();
            } catch (CloneNotSupportedException e) {
                e.getStackTrace();
            }
        }
        System.out.println("原对象:"+person1);
        System.out.println("克隆对象："+person2);

        person1.setName("李四");
        person1.getAddress().setCity("上海");
        person1.getAddress().setStreet("街道一");
        System.out.println("原对象:"+person1);
        System.out.println("克隆对象："+person2);
    }

}
class Person implements Cloneable{
    private String name;
    private Address address;
    public Person(){

    }
    public Person(String name, Address address){
        this.name = name;
        this.address = address;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAddress(Address address){
        this.address = address;
    }
    public Address getAddress(){
        return address;
    }
    public Object clone() throws CloneNotSupportedException{
        Person cloneperson = (Person)super.clone();
        cloneperson.name = name;
      cloneperson.address =   (Address)address.clone();
        return cloneperson;
    }
   public String toString(){
        return "name:"+name+"  "+address;
   }
}


class Address implements Cloneable{
    private String city;
    private String street;
    public Address(){

    }
    public Address(String city,String street){
        this.city  = city;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public Object clone() throws CloneNotSupportedException {
       Address cloneaddress = (Address)super.clone();
       cloneaddress.city = city;
      cloneaddress.street = street;
       return cloneaddress;
}
public String toString(){
        return "city:"+city+"  "+"street:"+street;
}

}

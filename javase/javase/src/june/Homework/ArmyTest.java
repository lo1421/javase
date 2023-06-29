package june.Homework;

/**
 * 开放型题目，随意发挥:
 * 写一个类Army,代表一支军队，这个类有一个属性weapon数组w(用来存储该军队所拥有的所有武器），
 * 该类还提供一个构造方法，在构造方法里通过传一个int类型的参数来限定该类所能拥有的最大武器数量，并用这一大小来初始化数组w。
 * 该类还提供一个方法addWeapon(Weapon wa)表示把参数wa所代表的武器加入到数组w中
 * 在这个类中还定义两个方法
 * attackAll()让w数组中的所有武器攻击
 * moveAll()让w数组中的所有可移动的武器移动

 * 写一个主方法去测试以上程序

 * 提示:
 * weapon是一个父类
 * 应该有很多子武器.这些子武器应该有一些是可移动的，有一些是可攻击的。
 */
public class ArmyTest {
    public static void main(String[] args) {
        Army army = new Army(10);
        army.addWeapon(new Gon());
        army.addWeapon(new Gon());
        army.addWeapon(new Tank());
        army.moveAllWeapons();
        army.attackAllWeapons();
    }
}
class Army{
    Weapon[] w ;
    int index ;
    public Army(){

    }
    public Army(int max) {
        w = new Weapon[max];
        index = -1;
    }


    /**
     * 往武器库里装武器的方法
     * @param wa 装进去的武器种类
     */
   public void  addWeapon(Weapon wa){
       if (index >= w.length) {
           throw new WeaponOutOfBoundsException("武器库已满");
       }
        index++;
        w[index] = wa;
       System.out.println(w[index].toString()+"武器加入成功！");
   }

    /**
     * 让可移动的武器移动
     */
   public void attackAllWeapons(){
       for(int i= 0 ;i<w.length;i++){
           if(w[i] instanceof Gon) {
               Gon gon = (Gon) w[i];
               gon.attack();
           }
           if(w[i] instanceof Tank){
               Tank tank = (Tank)w[i];
               tank.attack();
               tank.move();
           }
       }
   }

    /**
     * 让可攻击的武器攻击
     */
   public void moveAllWeapons(){
       for(int i= 0 ;i<w.length;i++){
           if(w[i] instanceof Gon) {
               Gon gon = (Gon) w[i];
               gon.attack();
           }
           if(w[i] instanceof Tank){
               Tank tank = (Tank)w[i];
               tank.attack();
               tank.move();
           }
       }
   }
}
class Weapon {

}
class Gon extends Weapon implements Assaultable{
   private String name ="gon";
    public String getName(){
        return name;
    }
    public String toString(){
        return getName();
    }
    public void attack(){
        System.out.println(getName()+"开始袭击！");
    }
}
class Tank extends Weapon implements Assaultable,Removable{
    private String name ="tank";
    public String getName(){
        return name;
    }
    public String toString(){
        return getName();
    }
    public void attack(){
        System.out.println(getName()+"开始袭击！");
    }
    public void move(){
        System.out.println(getName()+"开始移动！");
    }
}
interface Assaultable{
    void attack();

}
interface Removable{
    void move();
}
class WeaponOutOfBoundsException extends RuntimeException{
    public WeaponOutOfBoundsException(){

    }
    public WeaponOutOfBoundsException(String s){
        super(s);
    }
}


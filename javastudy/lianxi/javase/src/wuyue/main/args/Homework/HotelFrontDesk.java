package wuyue.main.args.Homework;

public class HotelFrontDesk {
   private HotelMgtSystem hms = new HotelMgtSystem() ;
    public HotelFrontDesk(){

    }
    //这里是程序的入口
    public static void main(String[] args) {
        //先创建一个酒店前台的对象
        HotelFrontDesk user = new HotelFrontDesk();
        user.hms.enter();
    }
    

}

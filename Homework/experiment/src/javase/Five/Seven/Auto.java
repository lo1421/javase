package javase.Five.Seven;
/*
7.3设计一个汽车类Auto,其中包含一个表示速度的double型的成员变量speed.
表示启动的start()方法、表示加速的speedUp()方法以及表示停止的stop()方法。
再设计一个Auto类的子类Bus表示公共汽车，
在Bus类中定义一个int型表示乘客数的成员变量passenger,
另外定义两个方法gotOn()和gotOff()表示乘客上车和下车。
编写程序测试Bus类的使用。
 */
public class Auto {
    //这个程序就暂时步不封装了，看着简单点
    double speed;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void start(){
        System.out.println("车开了");
    }
    public void speedUp(double up){
        this.speed+=up;
    }
    public void stop(){
        this.speed = 0;
    }
    public static void main(String[] args) {
    Bus bus = new Bus();
    bus.start();
    bus.speedUp(30);
        System.out.println("车速为："+bus.getSpeed()+"km/s");
        bus.stop();
        bus.gotOn(6);
        System.out.println("到站停车，车速为："+bus.getSpeed()+",车内人数："+bus.getPassenger());
        bus.start();
        bus.speedUp(20);
        System.out.println("车速为："+bus.getSpeed()+"km/s");
        bus.stop();
        bus.gotOff(2);
        System.out.println("到站停车，车速为："+bus.getSpeed()+",车内人数："+bus.getPassenger());
        bus.gotOn(4);
        System.out.println("到站停车，车速为："+bus.getSpeed()+",车内人数："+bus.getPassenger());
        bus.start();
        bus.speedUp(40);
        System.out.println("车速为："+bus.getSpeed()+"km/s");

    }
}
class Bus extends Auto{
    int passenger ;

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public void gotOn(int on){
        passenger+=on;
    }
    public void gotOff(int off){
        passenger-=off;
    }

}

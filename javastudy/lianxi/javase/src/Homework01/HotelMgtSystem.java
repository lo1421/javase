package Homework01;

import java.util.Scanner;
/*在这个类中将要完成对这个系统进行封装
封装的要求，定义四个方法：登录系统,进入系统，使用系统，退出系统
进入系统要求使用者输入正确的管理者的密码的情况下才可以使用，
并且要求用户仔细阅读完酒店管理系统的阅读手册，在阅读完的基础之上就可以使用
对应的功能编号来完成对酒店的管理。
如果输入错误的功能编号，将会自动退出系统。
管理者如果想继续使用，就必须重新进入酒店的管理系统
 */

public class HotelMgtSystem {
    Scanner s = new Scanner(System.in);
    Hotel hotel = new Hotel();
    //进入该系统方法
    public void login(){
        System.out.println("您好，管理者！欢迎您使用本酒店的管理系统，在使用本酒店管理系统之前，我们将核对" +
                "您的管理者的身份。");
        while(true) {
            System.out.print("请输入酒店管理系统的密码：");
            int key = s.nextInt();
            if (key == 20011008) {
                System.out.println("密码正确！ 欢迎您使用该酒店的管理系统！");
                //密码正确之后，就可以进入酒店的管理系统了，在这里就可以调用进入酒店管理系统的方法
                enter();
            } else {
                System.out.println("密码错误！请重新输入密码！");
            }
        }
    }

    public  void enter() {
        while (true) {
            System.out.println("请您仔细阅读酒店管理系统的操作手册，在使用酒店管理系统的时候，输入正确的对应的功能编号即可" +
                    "完成对应的酒店管理系统的功能。");
            System.out.println("[1]------查看酒店所有房间的信息");
            System.out.println("[2]------订房功能");
            System.out.println("[3]------退房功能");
            System.out.println("[4]------退出酒店管理系统");
            System.out.println("请问您是否仔细阅读了酒店系统的管理手册？回答“Yes”或者“No”：");
            String answer = s.next();
            if ("Yes".equals(answer)) {
                //在这里就可以调用使用酒店管理系统的方法了
                play();
            } else
                System.out.println();
        }
    }

    public  void play() {
        while(true) {
            System.out.print("请输入要完成的功能对应的功能编号：");
            int no = s.nextInt();
            switch (no) {
                case 1:
                    hotel.print();
                    break;
                case 2:
                    System.out.print("请输入要定的房的房间编号：");
                    int roomNo = s.nextInt();
                    hotel.order(roomNo);
                    break;
                case 3:
                    System.out.print("请输入要退的房的房间编号：");
                    int roomNo1 = s.nextInt();
                    hotel.exit(roomNo1);
                    break;
                case 4:
                    //在这里调用退出管理系统的房间
                    outer();
                    break;
                default:
                    System.out.println("您输入的功能编号有误");
            }
        }

    }

    public  void outer() {
        System.out.println("感谢您对该酒店管理系统的使用!期待您的下次光临！");
        System.exit(0);
    }
}

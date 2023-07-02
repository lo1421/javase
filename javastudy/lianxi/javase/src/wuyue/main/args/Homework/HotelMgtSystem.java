package wuyue.main.args.Homework;

import java.util.Scanner;
/*
(java软件工程师人生路上第一个小型项目。锻炼一下面向对象。)
为某个酒店编写程序: 酒店管理系统，模拟订房、退房、打印所有房间状态等功能
1、该系统的用户是: 酒店前台。
2、酒店使用一个二维数组来模拟。“Room[][] rooms;
3."酒店中的每一个房间应该是一个java对象: Room
4.每一个房间Room应该有: 房间编号、房间类型、房间是否空闲
5.系统应该对外提供的功能:
可以预定房间:用户输入房间编号，订房。
可以退房:用户输入房间编号，退房。
可以查看所有房间的状态: 用户输入某个指令应该可以查看所有房间状态。

首先我们先想好解题的思路：
1.由用户操作的酒店管理系统，我们可以看成这个酒店管理系统是用户的属性，酒店前台有一个酒店的管理系统，
属于has a 的关系，那么就把酒店管理系统写成酒店前台的一个属性
2.酒店管理系统中有几个操作，我们可以把这些操作写成方法，如：订房，退房，打印房间的所有的状态
3.搭建一个酒店，这个酒店里有Room,由于房间每层有很多，那么这些房间对象就可以储存到数组当中，那么我们应该把数组对象存到几维数组呢，
应该存到二维数组当中，因为酒店有横向和纵向之分，横向是楼层，纵向是每层的房间
4.酒店创建好了之后，就应该把房间对象创建好，因为酒店是面向对象编程，房间对象里面应该有一些房间的属性，这些属性是要封装起来的
Room房间对象有房间编号，房间类型，房间是否空闲的属性
5.定义一个HotelFromDesk类，这是代表酒店前台，这个酒店前台对象拥有酒店管理系统的属性
 */
public class HotelMgtSystem {
    Scanner input = new Scanner(System.in);
    Hotel hotel  = new Hotel();
    //在这个酒店系统里设置三个方法
    //进入系统的方法
    public void enter(){
        System.out.println("欢迎你进入本酒店的管理系统！我们将核验你的管理者的身份!");
        while(true) {
            System.out.print("请输入酒店管理系统的密码：");
            int key = input.nextInt();
            if (key == 20011008) {
                System.out.println("密码正确！正在为你加载酒店管理系统操作页面！");
                System.out.println("请您仔细阅读酒店管理系统的具体操作，输入正确的功能编号即可完成对应的功能，对应如下：");
                System.out.println("[1]——查看酒店所有房间的状态以及信息");
                System.out.println("[2]——订房");
                System.out.println("[3]——退房");
                System.out.println("[0]——退出酒店管理系统");
                System.out.println("请问您是否已经仔细阅读了酒店管理系统的操作规范，回答(true 或者 false)");
                boolean b = input.nextBoolean();
                if (b) {
                    //这是成功进入了酒店管理系统了，我们可以在这里调用play方法，完成用户操作这个系统的具体功能的关键步骤
                    play();
                } else {
                    System.out.println("很抱歉，请仔细阅读后再使用该系统");
                    return;
                }
            } else {
                System.out.println("很抱歉，您输入的酒店管理系统密码有误，无法进入酒店管理系统的页面！");
            }
        }

    }
    //play方法
    public void play(){
        while(true) {
            System.out.print("请输入你想完成的功能的功能的功能编号：");
            int no = input.nextInt();
            if(no==1){
              hotel.print();
            }else if(no==2){
                System.out.print("请输入你想定的房间的房间编号：");
                int roomNo = input.nextInt();
                hotel.order(roomNo);
            }else if(no==3){
                System.out.print("请输入你想退的房间的房间编号：");
                int RoomNo = input.nextInt();
                hotel.exit(RoomNo);
            }else if(no == 0){
                out();
                return;
            }else
                System.out.println("您输入的功能编号不存在，请重新输入!");
        }
    }
    //退出酒店管理系统的方法
    public void out(){
        System.out.println("您即将退出酒店管理系统，期待您下次使用本酒店管理系统，再见！");
        return;
    }
        }


package experiment.day02.exaltation;

/*
【提高篇】：
为方便管理个人通讯记录，编写一个简单的通讯录管理程序。系统记录必须有姓名、电话号码、QQ。
本系统应完成以下几方面的功能：
①	输入信息（enter（））: 调用此函数用以输入数据到内存中，此过程包括建立相应的链表或相应的数组，便于读取;
②	显示信息（display（））:用以显示输入的数据；
③	查找（search()）:以姓名作为关键字查找要找的信息;
④	删除信息（delete_name（））:用以删除选定的输入信息（姓名作为关键字）;
⑤	修改信息（change（））: 用以修改选定的输入信息（姓名作为关键字）;
⑥	打开通讯录（load（））：存储从文件中读取的字符；
⑦	添加信息（insert（））：用尾插法以添加信息；
⑧	保存（save()）:调用此函数将内存中的数据保存至磁盘中；
⑨   清屏（system("cls")）：执行cls命令。
 */

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressList {
    //创建一个顺序表
    ArrayList<LinkMan> list = new ArrayList<>();


    //①	输入信息（enter（））: 调用此函数用以输入数据到内存中，此过程包括建立相应的链表或相应的数组，便于读取;
    public void enter() {

        //创建联系人对象
        LinkMan p1 = new LinkMan();

        Scanner s = new Scanner(System.in);

        System.out.println("请完成新增联系人信息的录入");
        System.out.print("姓名：");
        p1.name = s.nextLine();

        System.out.print("电话：");
        p1.telN = s.nextLine();

        System.out.print("qq号：");
        p1.qqN = s.nextLine();

        //把该对象添加到链表中
        list.add(p1);

    }

    //④	删除信息（delete_name（））:用以删除选定的输入信息（姓名作为关键字）;
    public void delete_name() {
        if (list.isEmpty()) {
            throw new ListManEmptyException("联系人列表为空，删除失败！");
        }
        System.out.println("请输入你需要删除的联系人名字：");
        Scanner s = new Scanner(System.in);
        String LinkManName = s.nextLine();

        System.out.println("请问你确定要删除联系人 \"" + LinkManName + "\"对吗?" + "(回答yes或者no)");
        String confirm = s.nextLine();
        if (confirm.equals("yes")) {
            //这里使用迭代器遍历会更加好，因为不需要使用到下标
            for (LinkMan linkMan :
                    list) {
                if (linkMan.name.equals(LinkManName)) {
                    list.remove(linkMan);
                    System.out.println("删除成功！");
                    return;
                }
            }
            System.out.println("删除失败！联系人不存在！");

        } else {
            System.out.println("取消删除！");
        }
    }

    //③	查找（search()）:以姓名作为关键字查找要找的信息;
    public boolean search(String n) {
        if (list.isEmpty()) {
            throw new ListManEmptyException("联系人列表为空，查找失败！");
        } else {
            for (LinkMan linkMan :
                    list) {
                if (linkMan.name.equals(n)) {
                    System.out.println("联系人姓名：" + linkMan.name);
                    System.out.println("联系人号码：" + linkMan.telN);
                    System.out.println("联系人qq号：" + linkMan.qqN);
                    return true;
                }
            }

            System.out.println("该联系人不存在！");
            return false;
        }
    }


    //②	显示信息（display（））:用以显示输入的数据；
    public void display() {
        for (LinkMan linkMan :
                list) {
            System.out.println("联系人姓名：" + linkMan.name);
            System.out.println("联系人号码：" + linkMan.telN);
            System.out.println("联系人qq号：" + linkMan.qqN);
            System.out.println();
        }
    }

    //⑤	修改信息（change（））: 用以修改选定的输入信息（姓名作为关键字）;
    public void change(String n) {
        if (list.isEmpty()) {
            throw new ListManEmptyException("联系人列表为空，无法修改！");
        }
        for (LinkMan linkMan :
                list) {
            if (linkMan.name.equals(n)) {
                Scanner s = new Scanner(System.in);
                System.out.println("请问你要修改联系人的什么信息？");
                System.out.println("修改姓名请输入[1],修改号码请输入[2],修改qq号请输入[3]");
                int number = s.nextInt();
                if (number == 1) {
                    System.out.println("请填写修改后的名字：");
                    linkMan.name = s.nextLine();
                }
                if (number == 2) {
                    System.out.println("请填写修改后的号码：");
                    linkMan.telN = s.nextLine();
                }
                if (number == 3) {
                    System.out.println("请填写修改后的qq号：");
                    linkMan.qqN = s.nextLine();
                }
                System.out.println("修改成功！");
            }
        }
    }

    //

    //⑨   清屏（system("cls")）：执行cls命令。
    public void clear() {
        list.clear();
        System.out.println("清屏成功！");
    }

    //⑥	打开通讯录（load（））：存储从文件中读取的字符；
    public void load() {
        int readValue = 0;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("link_man_file");
            byte[] bytes = new byte[100];
            while ((readValue = fis.read(bytes)) != -1) {
                System.out.println(new String(bytes));
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.getMessage();
                }
            }
        }
    }


    //⑧	保存（save()）:调用此函数将内存中的数据保存至磁盘中；
    public void save() {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("link_man_file", true);
            Iterator<LinkMan> it = list.iterator();
            if (it.hasNext()) {
                byte[] bytes = list.toString().getBytes();
                fos.write(bytes);
                it.next();
            }
            if (fos != null) {
                fos.flush();
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("保存成功！");
    }

    //获取通讯录大小的方法
    public void getSize() {
        System.out.println("当前通讯录联系人总数为：" + list.size());
    }
}

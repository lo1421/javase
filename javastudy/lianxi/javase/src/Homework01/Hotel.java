package Homework01;



public class Hotel {
    //酒店一旦创建之后就会把房间的空间开辟出来
    Room[][] rooms ;
    //构造方法
    public Hotel(){
        //在创建酒店的时候，就会给酒店中的房间数组一个初始化的容量
        rooms = new Room[3][10];
        //在酒店被创建出来的时候，房间的属性能够确定的有房间的编号，而房间的类型，按照要求的话，第一层对应的是单人房，第二层对应的是标准间，
        // 第三层对应的是总统套房，那么就可以使用循环语句加上条件语句完成数组中元素的初始化
        //在这里给酒店中的房间数组中保存的房间进行初始化，通过循环实现遍历楼层和每层的所有的房间
        for(int i = 0; i<rooms.length ; i++){
            for(int j = 0 ;j<rooms[i].length;j++){
                if(i==0){
                    rooms[i][j] = new Room((100*(i+1)+j+1),"单人房",true);
                    //i==0 则表示楼层是一层，假设第一层的房间是单人房
                }else if(i==1){
                    rooms[i][j] = new Room((100*(i+1)+j+1),"标准间",true);
                }else
                    rooms[i][j] = new Room(100*(i+1)+j+1,"豪华总统套房",true);
            }
        }
    }
    //酒店中应该有几个方法可以完成几个具体的操作
//订房的方法
    public void order(int roomNo){
        Room room = rooms[roomNo/100-1][roomNo%100-1];
        if(room.getStatus()==true){
            //如果房间的状态为true为真的话，则表示该房间是空闲的，那么就可以完成定房间的功能
            //订房间的功能如果想要完成的话，那么就必须修改该房间的状态，将空闲改为占用，则表示该房间完成了订房的功能
            room.setStatus(false);
            System.out.println(roomNo+"订房成功！");
        }else {
            System.out.println(roomNo+"房间被占用");
        System.out.println("订房失败！");}
    }
    //退房的方法
    public void exit(int roomNo){
        Room room = rooms[roomNo/100-1][roomNo%100-1];
        //在进行退房之前要先确定即将退的房间是否是空闲的，如果是空闲的将无法进行退房的操作
        if(room.getStatus()==false){
            //既然房间是被占用的，那么既可以实现退房的功能,退房的具体的实现是将房间的状态修改为空闲即可
            room.setStatus(true);
            System.out.println(roomNo+"退房成功！");
        }else {
            System.out.println(roomNo+"房间为空闲");
            System.out.println("退房失败！");
        }

    }
    //遍历房间的方法
    //遍历房间的信息的要求其实就是把房间的所有的信息都打印出来，那么我是否可以使用Arrays类当中定义的ToString方法来实现数组内容的输出
   //不能在这里使用Arrays类中定义的方法，因为这个Hotel类只是一个没有main方法的类，那我试试能否自己定义一个方法，然后哦在这个方法的内部
    //再调用我需要使用的方法
    public void print(){

        for (

                Room[] i:
            rooms ) {
            for (Room j:
                 i) {
                System.out.print(j);
            }
            System.out.println();

        }
    }


}


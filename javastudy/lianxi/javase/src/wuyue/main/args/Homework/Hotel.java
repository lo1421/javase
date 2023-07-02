package wuyue.main.args.Homework;
/*
在搭建Hotel的时候，应该把酒店中的Room给建设好
 */
public class Hotel {
    Room[][] rooms = new Room[3][10];

    /*
    在这里我们使用的动态初始化一个二维数组，那么这个二维数组中保存的元素（引用类型对象）其实还没有创建出来，
    那么我们可以选择在调用Hotel的无参构造方法的时候，实现二维数组中元素的默认实现
     */
    public Hotel() {
        /*
        在创建房间的时候，我们已知房间的编号，这是可以推算出来的。我们还已知房间的状态，在酒店创建出来的时候，这些房间都是空闲的状态。
        由于这是二维数组的静态赋值，那么我们应该使用循环嵌套来完成。这里不能使用增强型的for循环，
        因为在循环当中我们需要具体用到自增的变量
         */
        for (int i = 0; i < rooms.length; i++) {//这里的i表示楼层的索引
            //这里是外层循环，目的是遍历楼层
            for (int j = 0; j < rooms[i].length; j++) {
            //这里是内层循环，目的是遍历当前楼层的所有的房间，在这里我们可以实现对每个房间的属性都初始化
                if(i==0){
                    //如果i==0，那么这表示当前的楼层处于第一层
                    rooms[i][j]  = new Room((i+1)*100+j+1,"单人间",true);
                }else if(i==1){
                    //如果i==1的话，那么就表示现在处于第二层
                    rooms[i][j] = new Room((i+1)*100+j+1,"标准间",true);
                }else {  //这里就是默认是第三层楼了
                    rooms[i][j] = new Room((i+1)*100+j+1,"豪华总统套房",true);
                }

            }
        }

    }
    //上述就完成了酒店如果创建了，那么房间也默认实现了创建和初始化
    //定义一个打印房间状态的方法
    public void print(){
        for(Room[] i :rooms){
            for(Room j: i){
                //内层循环是从一维数组中取出最后的引用类型的元素，那么这个元素的类型就应该是二维数组保存的元素的类型
                System.out.print(j);//完成了遍历数组的目的
            }
        }
        System.out.println();
    }
    //订房的方法
    public void order(int roomNo){
        /*
        在这里我们可以提前消除一些潜在的bug，例如：
        只能定空闲的房间
         */
        //我们需要先把这个传进来的编号找到是对应二维数组中的哪个元素，找到之后就声明一个变量去接收
        Room room  = rooms[roomNo/100-1][roomNo%100-1];
        //不要老是在取出数组中的元素的时候，使用类名中括号去取，应该使用引用加中括号去取数组中的元素
        if(room.getStatus()==true){
            //如果该编号的房间是空闲的，那么就允许订房，那么如何才能体现房间已经定好了呢？
            //那就是把该编号的房间的状态改为false即可，因为房间的状态属性是boolean类型的
            room.setStatus(false);
            System.out.println(roomNo+"订房成功！");
        }else
            System.out.println(roomNo+"房非空闲，订房失败！");
    }
    //退房的方法应该跟订房是一样的，只不过退房只能退已定的房
    public void exit(int roomNo){
        Room room  = rooms[roomNo/100-1][roomNo%100-1];
        if(room.getStatus()==false){
            room.setStatus(true);
            System.out.println(roomNo+"退房成功");
        }else
            System.out.println(roomNo+"房为空闲，退房失败！");
    }

}


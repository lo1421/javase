//这是一个封装好的Room类，当中有房间编号，房间类型，房间状态三种属性，这个类可以作为酒店中Room[][]二维数组中保存的元素。
public class Room {
    //房间编号
    private int no;
    //房间类型
    private String type;
    //房间状态
    private boolean status;
    //构造方法
    public Room(){

    }
    public Room(int no,String type,boolean status){
        this.no = no;
        this.type = type;
        this.status = status;
    }
    //setter and getter
    public void setNo(int no){
        this.no = no;
    }
    public int getNo(){
        return no;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
       this.type = type;
    }
//boolean类型的变量在IDEA中自动生成get方法的时候，get方法的名字默认是is而不是get，我们最好手动修改一下，修改成get
    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}

package day03;

/**
 * 这是一个测试类
 * 检测我们封装好的MyArray类
 */
public class TestDemo {
    public static void main(String[] args) {
        //创建MyArray对象
        MyArray myarray = new MyArray();
        //通过set方法，往数组中添加元素
        myarray.set(0,19);
        myarray.set(1,"hello");
        //通过getPOS方法来返回数组中指定下标的元素的值
        //String s = myarray.getPos(1);//这里会报错！
//报错原因分析：getPos方法返回的是一个Object类型的对象，我们使用String类型来接收的话，这是属于子类型引用指向父类型，需要强制类型转换
        //纠正：
        String s = (String)myarray.getPos(1);//这里使用了强制类型转换符，若要获取其他的元素，就会发现这个代码的弊端。
        //这个例子举的很好，便于引入泛型这个知识点。
    }
}
/**
 * 在这里定义一个类MyArray
 *该类是用来完成封装一个可以存放任意类型的数组的一个类
 * 这个类中有成员变量Object[]类型的数组
 * 成员方法获取数组中指定下标的的元素，
 * 成员方法在数组指定索引的位置存储指定的类型元素
 */
class MyArray{
    //创建实例变量Object[]
    public Object[] array = new Object[10];
    //定义实例方法：读数组中指定索引的元素
    public Object getPos(int pos){
        return this.array[pos];
    }
    //定义实例方法：在指定索引处往数组中存储元素
    public void set(int pos ,Object val){
        this.array[pos] = val;
    }
}
package june.selfStudy.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
在这个程序中我将进行对FileInputStream这个java.io包下的文件输入流进行最终的测试
 */
public class FileInputStreamTest01 {
public static void main(String[] args){
    /*创建一个文件输入流的对象，但是由于输入流对象的构造方法会抛出一个编译时异常FileNotFoundException
    所以我们在对这个编译是的异常进行处理的时候，选择使用try-catch 语句进行捕捉，而且由于这个文件输入流对象是跟底层的资源交互的
    为了防止资源浪费我们应该使用流实现的Closeable接口当中的close（）方法，来对使用完的流进行关闭。
    又因为流是一定要关闭的，这种即使发生异常也要执行的语句就应该写在finally语句当中，所以会在finally语句中执行这个关闭流的语句
    那么流对象的变量就应该声明在try-catch-finally 语句的外面，这样就可以在try语句和finally语句中都使用声明的流对象的变量了
    */
     FileInputStream fis = null;
    try {
        fis = new FileInputStream("tempfile01");
        //准备一个可以指定一次从磁盘的文件的内容中读几个字节，调用read（byte[] bytes）方法
        byte[] bytes = new byte[4];
        //使用循环调用read方法，知道循环到read方法返回的值是-1的时候才停止调用该方法，不然就一直调用下去
        //由于read（）方法返回的每次读到的字节的个数，那么我们可以提前定义一个int型的变量去接收这个返回值
        int  readCount = 0;
       /*
        while(readCount!=-1){
            readCount = fis.read(bytes);
            //这个方法的调用也会抛出一个IOException编译是的异常，只需要在再写一个catch语句
            //进行捕捉就好啦，因为catch语句是可以写好几个的，只不过必须满足由小到大的顺序，不然就是重复冗杂了
            System.out.print(new String(bytes,0,readCount));
            //这里是调用了一个String类中的有参构造方法，可以将byte[]数组的指定长度转换成一个新的字符串，然后我们输出了这个字符串
            //要注意这里的print不能写ln
        }
        */
        while(true) {
          readCount = fis.read(bytes);
            if (readCount == -1) {break;}
            System.out.print(new String(bytes, 0, readCount));
        }
    } catch (FileNotFoundException e) {
       e.printStackTrace();
    }catch(IOException e){
        e.printStackTrace();
    }finally{
        if(fis!=null){
            try {
                fis.close();//当这个文件输入流对象创建成功了，这个引用不为空的时候才能调用close方法，不然会发生空指针异常
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
}

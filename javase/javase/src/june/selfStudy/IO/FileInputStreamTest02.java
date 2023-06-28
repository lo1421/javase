package june.selfStudy.IO;

import java.io.*;


/*
java中的IO流：
将内存中的文件输入到内存中，这里使用FileInputStream流来实现将内存中的文件读入到内存当中
 */
public class FileInputStreamTest02 {
    public static void main(String[] args) {
        //创建流对象
        FileInputStream fis = null;
        //由于流对象的构造方法会给调用者使用throws关键字抛出一个FileNotFoundException异常，那么我们应该在调用该方法
        //的时候对由于调用方法而接收到的编译时的异常进行处理才可以，编译时的异常是在运行时发生的，但是必须在编译时期进行处理
        //否则就会报错！！
        try {
            fis = new FileInputStream("tempfile01");//这里调用的是参数为String类型的，而这里的String应该是磁盘中文件的路径：
            // 这里的路径既可以是绝对路径又可以是相对路径
           byte[] bytes = new byte[4];
           while(true){
               int readCount = fis.read(bytes);
               if(readCount==-1) break;
               System.out.print(new String(bytes,0,readCount));
           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //流使用完之后必须将流进行关闭，这是由于有的流是和底层资源（文件，网络连接，数据库连接），
            // 关闭流之可以关闭流可以确保这些资源在使用完毕后被及时释放，避免资源泄漏和浪费。

            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

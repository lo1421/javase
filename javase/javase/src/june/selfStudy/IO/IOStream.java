package june.selfStudy.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
java中的所有的IO流全部都在java.io.*这个包中

流的分类可以通过流的输出方式分为输入流和输出流，按照数据的类型可以分为字节流和字符流，其中字节流又可以称为二进制流，字符流又可以称为文本流。
字节流是一个一个字节的读和写，字符流值一个一个字符的读和写。

读就是read，这是将磁盘中的文件读之后输入到内存中。
写就是write，这是将内存中的文件写之后输出成磁盘中的文件。
可以观察一下API帮助文档中输入输出流都有什么特点，或者分别都实现了什么接口？

 */
public class IOStream {
    public static void main(String[] args) {
     //创建一个一个文件输入流对象（输入输出流在java中都是以类的形式存在）
        FileInputStream fis = null;
        //提前在try-catch-finally语句外面声明一个FileInputStream 类型的变量，为的是可以在try ，catch，finally这几个域当中
        //都能使用fis这个声明好的变量
        try {
           // fis = new FileInputStream("src/Test01/tempfile");//IDEA中默认的当前路径其实是跟project一个等级的项目下
            //在这里我们就使用的当前路径，而不是绝对路径
            fis = new FileInputStream("tempfile");//由于我在IDEA的工程的目录下新建了一个tempfile文件，那么就可以直接使用当前路径
            //接下来这一行就是绝对路径
            //可以先准备一个byte数组用来一次多读几个
            byte[] b = new byte[1024];
           int length = fis.available();
            int readCount =  fis.read(b,0,length);//使用有参数的read方法来完成读的工作
            //这个时候返回的就是一次读取到的字节的数，而不是没有参数的read方法读取之后返回的是字节本身，例如a就返回97
            //将读取在byte数组中的元素的转换为一个字符串，这里需要调用String类当中的方法
            String s = new String(b);
            System.out.println(s);
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if(fis!=null){
                try {
                    fis.close();//调用close方法会给调用者抛出一个异常IOException
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        /*
        FileInputStream 这个类中有很多的构造方法，我们先使用参数是文件路径的构造方法，来创建并初始化输入流对象
        FileInputStream(String name)打开一个连接到一个实际的文件创建一个 FileInputStream，文件由文件系统中的路径名 name命名。
        D:\Users\14214\javase（这是我设置的IDEA生成的工程储存在计算机的D盘目录下，然后从就可以找到我编写的所有的IDEA中的字节码文件）
         */

    }
}

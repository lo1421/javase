package june.selfStudy.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 在这里将对java中文件专属字节输出流进行测试FileOutputStream
 * 输出指的是从程序将内容输出到磁盘中，输入输出都是针对的内存/程序
 */
public class FileOutputStreamTest01 {
    public static void main(String[] args){
        //先声明一个文件字节输出流的变量
        FileOutputStream fos = null;
        try {
            //创建一个输出流对象，这个构造方法会抛出一个FileNotFoundException编译时异常，所以我们需要对编译时的异常进行处理
            fos = new FileOutputStream("tempfile02");//这里会在当前的工程下生成一个tempfile02.txt的文件
            //接下来就可以开始写文件了
            byte[] bytes = "我们现在在学习Java中的IO流！".getBytes();
            fos.write(bytes,0,bytes.length);
            //养成一个好习惯，输出流使用完之后，要手动的刷新管道，防止资源浪费和泄露
            if(fos!=null) {
                fos.flush();//这个方法也会抛出来一个异常
            }
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            //养成一个好习惯，流使用完毕之后要关闭，无论是手动关或者自动关闭
            if(fos!=null){
                try {
                    fos.close();//这个方法也会报错
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

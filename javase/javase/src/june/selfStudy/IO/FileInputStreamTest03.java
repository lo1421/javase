package june.selfStudy.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
java 中的流的四大家族：
java.io.InputStream;字节输入流
java.io.OutputStream;字节输出流
java.io.Writer;字符输出流
java.io.Reader;字节输入流

注意：java中的大部分接触底层资源的输入或者输出流在使用完之后都必须要关闭，而关闭的方式可以手动调用实现Closeable接口中的close方法来手动关闭
流。或者使用实现Closeable子接口AutoCloseable接口中的try-with-resources语句块来显式的关闭流资源
java中的输出流在使用完之后都必须使用从flushable接口中实现的flush方法来实现对流的刷新，所有的流都实现了java.io.Flushable接口，这意味着所有的
输出流都是可以刷新的，都有flush方法，养成一个好习惯，输出流在最终输出之后，一定要记得flush方法刷新一下，这个刷新表示将通道或者管道中的剩余的
未输出的数据强行输出成功，也就是清空管道，刷新的作用的作用就是清空管道，如果没有使用flush方法去清空输出流管道，就会导致数据丢失。

 注意：在java中但凡是以Stream结尾的都是字节流，以reader和writer结尾的都是字符流。
 java中必须掌握的流有16个：
 文件专属流：
 java.io.FileInputStream
 java.io.FileOutputStream
 java.io.FileWriter
 java.io.FileReader
 缓冲流专属：
 java.io.BufferedInputStream
 java.io.BufferedOutputStream
 java.io.BufferedReader
 java.io.BufferedWriter
 转换流：字节流转换为字符流
 java.io.InputStreamReader
 java.io.OutputStreamWriter
 数据流专属：
 java.io.DataInputStream
 java.io.DataOutputStream
 对象专属流：
 java.io.ObjectInputStream
 java.io.ObjectOutputStream
 标准输出流：默认往控制台输出，其中有特定的方法可以完成对输出方向的改变
 java.io.PrintWriter标准字符输出流
 java.io.PrintStream标准字节输出流
 */

/**
 * 文件专属输入流和文件专属输出流的使用
 * java.io.FileInputStream
 * java.io.FileOutputStream
 * java.io.FileWriter
 * java.io.FileReader
 * 输入流中有读文件的方法，输出流当中有写文件的方法，字符流是一次读取或者写入一个字符，字节流是一次读取或者写入一个字节
 * 在windows系统中英文字母采用的是ASCII编码，一个英文要一个字节，而一个汉字使用UTF-6编码要两个字节。
 * 而使用字符的话，那么不论是一个英文字母还是一个汉字都是一个字符，使用字符流/文本流，就是一次读取一个字符即可
 */
public class FileInputStreamTest03 {
    public static void main(String[] args){
        //先声明一个文件专属的字符输入流，输入是Input或者reader，表示将磁盘上的文件读取到内存中，或者程序中
        FileInputStream fis = null;//此处声明的是一个文件输入字节流，如果读取汉字：例如'中'，那么读一次就只能把这个汉字读一半，而‘a’这个
        //字母可以一次读完，因为在windows系统中英文字母占一个字节
        //创建文件输入流对象
        try {
            fis = new FileInputStream("tempfile01");
            //在这里可以使用度文件袋呃方法，然后可以输出到控制台上，可以先使用read()无参数的读的方法，一次读取一个字节
           int readValue = fis.read();//返回的就是读取的int型的值，例如文件中的a，读取出来就是97，但是这个方法会抛出一个IOException
            System.out.println(readValue);//空格读出来是32
             readValue = fis.read();
            System.out.println(readValue);//p读出来是112
            /*
            现在使用有参数的read(byte[] bytes)方法来一次读取指定长度的字节，但是这种方式不建议读太大的数据量，因为是读到byte数组中
            ，而byte数组不能储存非常大的数据量
            要使用这种往byte数组当中的read方法，就必须提前准备一个byte数组，准备好byte数组之后，就可以调用read（byte[] bytes）方法，把byte数组
            传进去，然后要想把读到byte数组中的内容打印到控制台上，就必须调用String类中的一个构造方法，这个构造方法是将一个byte数组传到
            有参构造方法当中，然后转换成一个字符串对象，也就是相当于返回一个字符串。
            当然，你可以搭配着循环语句一起使用。
             */
            int readValue1  = 0;
            byte[] bytes = new byte[4];//这表示调用有参read方法的时候，一次读取四个字节到byte数组当中
            //read方法都是当读到文件末尾的时候，无法继续读下去的时候就会返回-1，那么-1就可以作为我们循环语句当中的一个判断条件
            while((readValue1 = fis.read(bytes))!=-1){
                System.out.print(new String(bytes));//由于当中有中文，所以有的时候会一个汉字两个字节读不完，感觉如果是汉字的话，
                //还是使用字符输出流可能会好点
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e){//在这里继续捕捉即可，因为一个try可以搭配多个catch语句
            e.printStackTrace();
        }finally{
            //在这里需要关闭使用完的流！！
            if(fis!=null){//这里提前判断是否为空，是为了防止出现空指针异常，如果引用是空的那么就没有必要再调用关闭流的方法了
                try {
                    fis.close();//这里会报错IOException，继续在finally语句中使用try-catch语句
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

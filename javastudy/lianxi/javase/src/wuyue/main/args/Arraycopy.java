package wuyue.main.args;

public class Arraycopy {
    public static void main(String[] args) {
        //java中当一个数组的容量不在满足要求的时候，我们就会想到将这个数组进行扩容
        //那么java中的数组扩容要怎么实现呢，可以调用java.lang.System.arraycopy()方法来完成数组的扩容
        //那么在进行数组的扩容之前，要先了解数组的复制
        /*
        拷贝数组需要调用到System.arraycopy()方法,System.arraycopy()方法的具体实现是：
        public static native void arraycopy(Object src,int srcPos,Object dest,int destPos,int length);
        可以看出来arraycopy方法是native修饰的以分号结尾的本地方法
        1.本地方法：
        本地方法的具体实现是在其它编程语言中完成的，而不是在Java中，本地方法通常用于与底层系统进行交互，访问硬件设备，或者执行更高级别的
        功能和性能，本地方法的实现通常是通过使用java中的本地接口JNI来与底层代码进行绑定和调用，在运行java程序时，
        java虚拟机JVM会在运行时加载和执行与本地方法相关的文件
         2.arraycopy（）方法
         arraycopy方法有五个参数，其中两个是引用数据类型和三个基本数据类型
         所以在调用arraycopy方法的时候需要传进来五个参数，才能调用，现在我们一一了解每个参数的含义和引用吧
         arc：源数组，表示需要进行复制的原始数组对象
         arcPos：源数组中要开始复制的起始位置索引
         dest： 目标数组，表示将元素复制到的目标数组
         destPos：目标数组中复制到的起始位置索引
         length：要复制的元素的数量
        通过将需要扩容的源数组中的所有元素都复制到目标数组中，往往此时的目标数组的容量一定是大于源数组的，因为这样才能达到将数组扩容的目的
        小容量的数组后续就会被处理成垃圾对象，被GC回收，内存释放

         */
        //定义一个数组，动态初始化
        int[] src = new int[5];
        for(int i = 0;i<src.length;i++){
            src[i] = 1;
        }
        //我们现在需要将这个数组进行扩容
        int[] dest = new int[20];
        for(int i = 0;i< dest.length;i++){
            dest[i] = 2;
        }
        //将src源数组当中的所有的元素全部复制到dest目标数组当中
        System.arraycopy(src,0,dest,0,src.length);
        //思考：我们在拷贝数组的时候，其实从源数组拷贝到目标数组的时候，拷贝的是数组的内容，还是拷贝的元素的地址
        /*
        我们其实可以验证一下，我们到底拷贝的是数组的什么
        如果拷贝的是源数组对象的具体内容，那么，当我们后续继续对源数组的内容进行修改之后再对目标数组进行遍历，就会发现，目标数组的内容还是之前的，没有
        相应的也发生改变
        如果拷贝的是源数组的元素的内存地址，那么，我们在后续对源数组的内容进行修改之后，再遍历目标数组的所有元素，会发现目标数组中从源数组当中
        复制过来的那部分也发生了相应的变化
        现在我们来验证一下吧

         */
        //现在我们遍历一下目标数组当中的元素
        for(int i = 0 ;i<dest.length;i++){
            System.out.println(dest[i]);
        }
        /*我们完成对源数组的扩容，就应该把源数组变成垃圾对象
        src = null;
         */
        //这里是后续对源数组的内容进行改变
        for(int i = 0 ;i<src.length;i++){
            src[i] = 3;
        }
        for (int j = 0; j < src.length; j++) {
            System.out.println(src[j]);
        }

    }




}
class Product{

}
/*
需要注意的是，System.arraycopy()方法在程序中并不直接进行数组的扩容操作。
它仅用于将源数组的元素复制到目标数组中，而实际的扩容是通过创建一个更大容量的新数组并将原数组的元素复制到新数组中实现的。
 */
package wuyue.main.args;

public class ArrayDeep02 {
    public static void main(String[] args) {
        //在这里我将证明java中调用System.arraycopy方法对引用类型数组的复制，其本质是将源数组当中元素的地址拷贝给目标数组
        //这里创建两个数组对象，一个是小容量的，一个是大容量的
        //拷贝数组的同时还可以完成数组的扩容
        User[] src ={new User(),new User()};
        /*
        刚开始我对源数组进行初始化的方式是动态初始化，代码如下
        User[] src = new User[2];
        如果只有这样的一行代码，其实在内存图中User类型的数组的对象在堆内存中是没有创建出来的，只有这一行代码其实
        只完成了在堆内存中开辟出长度为2的数组的内存空间，User类型的对象还没有new出来，系统默认这样的数组对象值为null
         */


        for (int i = 0; i < src.length; i++) {
            System.out.println(src[i]);
        }
        System.out.println();
        User[] dest = {new User(),new User(),new User(),new User(),new User(),new User(),new User(),new User()};
        //现在将源数组拷贝到目标数组当中，同时实现数组的扩容
        System.arraycopy(src,0,dest,0,src.length);
        //现在开始遍历目标数组
        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }
        System.out.println("-----------------------------------------------------------");
        //现在对源数组进行改写
        for (int i = 0; i < src.length; i++) {
            src[i] = new U1();
        }
        //遍历改变之后的源数组
        for (int i = 0; i < src.length; i++) {
            System.out.println(src[i]);
        }
        System.out.println();
        //现在继续再遍历目标数组的所有元素
        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }
    }
}
class User{

}
class U1 extends User{

}
/*
wuyue.main.args.User@1b28cdfa
wuyue.main.args.User@eed1f14

wuyue.main.args.User@1b28cdfa
wuyue.main.args.User@eed1f14
wuyue.main.args.User@7229724f
wuyue.main.args.User@4c873330
wuyue.main.args.User@119d7047
wuyue.main.args.User@776ec8df
wuyue.main.args.User@4eec7777
wuyue.main.args.User@3b07d329
-----------------------------------------------------------
wuyue.main.args.U1@404b9385
wuyue.main.args.U1@6d311334

wuyue.main.args.User@1b28cdfa
wuyue.main.args.User@eed1f14
wuyue.main.args.User@7229724f
wuyue.main.args.User@4c873330
wuyue.main.args.User@119d7047
wuyue.main.args.User@776ec8df
wuyue.main.args.User@4eec7777
wuyue.main.args.User@3b07d329

 */
/*
对于浅层复制，虽然目标数组保存的是源数组对象的表层内存地址，但是通过这些内存地址可以访问到相同的对象。如果通过源数组保存的对象的内存地址去修改对象的属性或者调用方法，那么目标数组通过相应的内存地址访问的对象也会受到影响，因为它们引用的是同一个对象。

可以将浅层复制理解为两个数组共享同一个对象实例，它们的引用指向相同的对象。因此，对对象的修改会在两个数组中都反映出来。这是因为它们指向的是同一个对象。

这与深层复制不同，深层复制创建了新的对象，源数组和目标数组中的对象是完全独立的，它们有不同的内存地址。因此，对源数组中对象的修改不会影响目标数组中的对象。
 */
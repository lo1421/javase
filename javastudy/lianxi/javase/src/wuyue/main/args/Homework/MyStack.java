package wuyue.main.args.Homework;
//在这里我将重新编写一次，使用一位数组来模拟栈数据结构Stack
/*
栈：是一种基本的数据结构，用来储存元素的容器，遵守后进先出“last-in-first-out”原则，
在现实生活中可以类比成一叠盘子，后叠的盘子先取出来

概念：
栈帧：位于栈顶部的元素，活跃度最高的元素

栈中有几种基本的操作
1.压栈，入栈，进栈，push
将元素添加到栈的顶部，新元素成为的栈帧，而原来的栈帧先下移动，这个过程就被称为“压栈”
2.弹栈，出栈，pop
将栈顶部的元素即栈帧移除，栈顶的元素被删除，并且下面的元素成为新的栈帧，这个过程就被称为“弹栈”
除了以上两种基本操作之外，栈中还有其它的操作
3.查看栈顶部的元素Peek：
获取栈顶部的元素，栈不会发生改变
4.判空isEmpty：
判断栈是否为空，即看栈中是否没有元素
5.获取栈的大小Size：
即返回栈的大小

那么我们现在要使用一维数组来模拟栈
基本的思路
1.定义一个类MyStack，这个类中应该把模拟栈的一维数组定义成一个成员变量
定义一个变量index，要求这个变量始终是指向栈中的顶部，即栈帧元素
用一维数组的理解就是，index这个变量必须一直是数组当中储存的最后一个元素的索引。
而且很显然，这个索引index是只要发生了压栈或者弹栈都会跟着改变的
2.创建一个一维数组，要求这个数组可以储存任何的引用数据类型的对象，那么这个数组就可以模拟栈的储存元素的功能
要求初创建数组对象的时候为数组初始化一个长度
3.定义若干个方法，这些方法分别完成栈可以实现的基本操作
压栈的方法push
弹栈的方法pop
查找栈顶元素的方法peek
判空的方法isEmpty
获取栈大小的方法size
4.定义一个测试类，在测试类中完成对模拟栈数据结构的使用，包括压栈，弹栈获取栈的大小
 */
class Test{
    public static void main(String[] args) {
        //创建MyStack对象
        MyStack ms = new MyStack();
        E e = new E();
        ms.push(e);
        E e1 = new E();
        ms.push(e1);
        ms.pop();
        ms.pop();
        ms.pop();

    }
}
class E{

}
public class MyStack {
    //模拟栈储存数据作为容器的功能
    private Object[] elements;
    //始终指向栈顶部的变量
    private int index;

    //构造方法，要求在这里给数组默认一个最大容量，同时给index一个默认数值
    public MyStack() {
        elements = new Object[10];
        index = -1;
        //解释这里的index为什么会等于负一
        /*
        在调用构造方法的时候会完成对数组一个默认的初始化处理
        当这个一维数组被创建出来的时候，这个栈的模拟储存数据的功能已经完成了，但由于index是始终保存
        栈中栈帧元素的索引，那么在这个时候在一维数组中还没有任何数据，那么就认为定义这个index=-1是很合适的
         */
    }
    //setter and getter

    public Object[] getElements() {

        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public int getIndex() {

        return index;
    }

    public void setIndex(int index) {

        this.index = index;
    }
    /*
push方法传进来的参数是一个Object类型的引用，只要传的不是Object类型的参数，那么这个传参数的过程传任何其他的参数，全部都会
涉及到多态的知识点，发生向上转型，这是由于任何类都是Object类的子类，父类型引用指向子类型对象就是多态
 */

    //模拟压栈push的操作
    public Object push(Object obj) {
        //在这里调用判满的方法
        if (isOutOfBounds()) {
            //进行压栈的操作，将新的元素放到栈的顶部成为新的栈帧，而之间的旧栈帧向下移动
            index++;//先自增后赋值
            elements[index] = obj;//这样就完成了把新的元素储存到栈中，这个元素也顺利变成了新的栈帧
            System.out.println("压栈成功！");
        } else
            System.out.println("StackIndexOutOfBoundsException!——压栈失败！");//调用获取栈大小的方法
        System.out.println("栈储存的元素个数为：" + size());

        return elements[index];
    }

    //模拟弹栈pop的操作
    public Object pop() {
        Object poppedElement = null;
        //在进行弹栈的时候，应该先判断一下栈是否为空，调用判空的方法
        if (isEmpty()) {
            //能进入if条件语句当中，则表明栈不为空，可以实现栈的弹栈的操作，
            //弹栈是除去栈顶的元素，删去该栈顶的元素之后，该元素下面一个元素就变成了新的栈帧
            poppedElement = elements[index];//把弹出去的元素的对象地址赋值给一个变量，防止后续在外部使用者个弹出去的元素
            elements[index] = null;//先赋值后自减
            //这里其实是因为弹出去一个元素之后，那么这个索引指的元素为空了，是可以保存其它的元素的
            index--;
            System.out.println("弹栈成功！");
        } else
            System.out.println("StackEmptyError——弹栈失败！");
        //调用获取栈大小的方法
        System.out.println("栈储存的元素个数为：" + size());

        return poppedElement;
    }


    //判满的方法
    public boolean isOutOfBounds() {
        if (index >= elements.length - 1) {
            System.out.println("栈溢出错误——StackIndexOutOfBoundsException!");

            return false;
        } else
            return true;
    }

    //判空的方法
    public boolean isEmpty() {
        if (index < 0) {
            System.out.println("空栈错误——EmptyStackError!");
            return false;
        } else
            return true;
    }

    //获取栈大小的方法
    public int size() {
        return index + 1;
    }


}


package TextReport;

import java.util.Stack;

public class StackTest {
    /*
    在这个方法中进行测试Stack数据结构
     */
    public static void main(String[] args) {
       /* Stack<Integer> stack = new Stack<>();
        //调用方法
        //压栈方法
        stack.push(10);
        stack.push(12);
        stack.push(1);
        stack.push(2);

        System.out.println(stack);

        //弹栈方法
        stack.pop();
        stack.pop();

        System.out.println(stack);

        //获取栈顶元素的方法
        System.out.println(stack.peek());

        //判空方法
        System.out.println(stack.empty());
*/

        //在这里进行测试我们自定义的栈数据结构

        MyStack myStack = new MyStack();
        myStack.push(10);
        myStack.push(23);
        myStack.push(19);
        System.out.println("栈的大小：" + myStack.getSize());

        myStack.pop();
        myStack.pop();
        System.out.println("获取栈顶元素：" + myStack.peek());


    }
}

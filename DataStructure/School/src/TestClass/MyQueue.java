package TestClass;

import java.util.LinkedList;
import java.util.Stack;


class MyQueue {

    //准备两个栈
    Stack<Integer> s1;
    Stack<Integer> s2;


    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        //指定s1用来入队
        s1.push(x);
    }


    public int pop() {
        if (empty()) {
            return -1;
        }
        //s2拿来出队
        if (s2.empty()) {
            //如果s2是空的，那么就把s1中的元素倒过来
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
        }
        //当程序走到这里的时候，就表明s2当中一定是有元素的，那么现在就可以进行pop了
        return s2.pop();
    }

    public int peek() {
        if (empty()) {
            return -1;
        }
        //s2拿来出队
        if (s2.empty()) {
            //如果s2是空的，那么就把s1中的元素倒过来
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
        }
        //当程序走到这里的时候，就表明s2当中一定是有元素的，那么现在就可以进行pop了

        return s2.peek();
    }

    public boolean empty() {
        return s1.empty() && s2.empty();
    }
}

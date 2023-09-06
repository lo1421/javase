package TestClass;

import java.util.LinkedList;
import java.util.Queue;

//用队列实现栈
public class MyStack {
    //准备两个队列
    Queue<Integer> que1;
    Queue<Integer> que2;

    //栈长度计数器
    int usedSize;

    public MyStack() {
        que1 = new LinkedList<>();
        que2 = new LinkedList<>();
    }

    public void push(int x) {
        if (!que1.isEmpty()) {
            que1.offer(x);
        } else if (!que2.isEmpty()) {
            que2.offer(x);
        } else {
            //如果两个队列都为空，那么就可以自定义放在任何一个列表里面
            que1.offer(x);
        }
        usedSize++;
    }

    public int pop() {
        if (empty()) {
            return -1;
        }
        if (!que1.isEmpty()) {
            int curSize = que1.size();
            for (int i = 0; i < curSize - 1; i++) {
                que2.offer(que1.poll());
            }
            usedSize--;
            return que1.poll();
        } else {
            int curSize = que2.size();
            for (int i = 0; i < curSize - 1; i++) {
                que1.offer(que2.poll());
            }
            usedSize--;
            return que2.poll();
        }

    }

    public int top() {
        if (empty()) {
            return -1;
        }
        if (!que1.isEmpty()) {
            int curSize = que1.size();
            int temp = -1;
            for (int i = 0; i < curSize; i++) {
                temp = que1.poll();
                que2.offer(temp);
            }
            return temp;
        } else {
            int curSize = que2.size();
            int temp = -1;
            for (int i = 0; i < curSize; i++) {
                temp = que2.poll();
                que1.offer(temp);
            }
            return temp;
        }
    }

    public boolean empty() {
        return que1.isEmpty() && que2.isEmpty();
    }
}

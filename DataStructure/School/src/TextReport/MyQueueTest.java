package TextReport;

public class MyQueueTest {
    public static void main(String[] args) {
        //测试我们编写的队列
        MyQueue myQueue = new MyQueue();
        //添加元素到队列中
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        myQueue.offer(4);

        //遍历队列
        myQueue.display();

        //出队
        System.out.println(myQueue.poll());//1
        //查看队头元素
        System.out.println(myQueue.peek());//2
    }
}

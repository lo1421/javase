package javase.Eleven;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        int[] array = {1, 5, 3, 7, 6, 9};

        // 创建优先级队列对象
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // 将整数数组的元素插入队列
        for (int num : array) {
            queue.offer(num);
        }

        // 输入并观察结果
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}

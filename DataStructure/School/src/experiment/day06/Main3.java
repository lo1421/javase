package experiment.day06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Queue<Integer> queue1 = new LinkedList<>();

        while (s.hasNext()) { // 检查是否还有输入
            while (true) {
                int val = s.nextInt();
                queue1.offer(val);
                if (val == 0) break;
            }

            Queue<Integer> queue2 = new LinkedList<>();
            while (!queue1.isEmpty()) {
                int a = queue1.poll();
                int b = queue1.poll();
                int c = a * b;
                if (c != 0) {
                    queue2.offer(c);
                    int d = b - 1;
                    queue2.offer(d);
                }
            }

            boolean firstOutput = true;
            while (!queue2.isEmpty()) {
                if (!firstOutput) {
                    System.out.print(" ");
                }
                System.out.print(queue2.poll());
                firstOutput = false;
            }
            System.out.println(); // 输出换行，确保多组测试用例之间不会有额外的空格
        }
    }
}

package day11;

public class Test {
    public static void main(String[] args) {
        TestHeap testHeap = new TestHeap();
        int[] arr = {27, 15, 19, 18, 28, 34, 65, 49, 25, 37};
        testHeap.initialArray(arr);

        testHeap.createHeap();
        testHeap.display();
      
    }
}

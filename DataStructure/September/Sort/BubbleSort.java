//冒泡排序
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 26, 3, 65, 12, 11, 7};
        bubbleSort(arr);
        display(arr);
    }

    //冒泡排序
    public static void bubbleSort(int[] arr) {
        for (int j = arr.length; j > 0; j--) {
            boolean flag = true;
            for (int i = 0; i < j - 1; i++) {
                if (arr[i + 1] < arr[i]) {
                    int tmp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = tmp;
                    flag = false;
                }
            }
            if (flag) return;
        }
    }

    public static void display(int[] arr) {
        for (int x :
                arr) {
            System.out.print(x + " ");
        }
    }

}

package day01;


public class eg {
    public static void main(String[] args){
        func1(10);
        func1(100);
        func1(1000);
        func1(10000);
        /*
        130
        10210
        1002010
        100020010
        随着N的增大，会发现2*N+10对语句执行次数的影响越来越小，最终可以忽略
        这里我们就可以引入“大O渐进法”来表示时间复杂度
        */
        int[] arr ={5,3,87,90,1,39};
      eg e = new eg();
      e.func5(arr);
    }
    public static void func1(int N){
        int count = 0;
        for(int i = 0;i<N;i++){
            for (int j = 0; j < N; j++) {//执行N*N次
                count++;
            }
        }
        for (int k = 0; k < 2*N; k++) {//执行2*N次
            count++;
        }
        int M = 10;
        while((M--)>0){//执行10次
            count++;
        }
        System.out.println(count);
        //func1总共执行 N^2+2*N+10次，这也是准确的时间复杂度
    }
    public static void func2(int N){
        int count =0;
        for (int i = 0; i < 2*N; i++) {//2*N
            count++;
        }
        int M =10;
        while((M--)>0){//10
            count++;
        }
        // F(N)=2*N +10;精确的时间复杂度
        //O(N)大O渐进表示法的时间复杂度
        System.out.println(count);
    }
    public static void func3(int N ,int M){
        int count = 0;
        for (int i =0;i < N;i++){//N
            count++;
        }
        for (int j = 0;j < M;j++){//M
            count++;
        }
        System.out.println(count);
        //F(N) =M+N;精确的时间复杂度
        //O(M+N)大O渐进法表示的时间复杂度
    }
    public static void func4(int N){
        int count=0;
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println(count);
        //F(N)=100;
        //O(1)
    }
    //计算bubbleSort冒泡排序的时间复杂度
    public void func5(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j <array.length-i-1; j++) {
                if(array[j]>array[j+1]){
                    int t = 0;
                    t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }
        }
        showArray(array);
   }
   public void showArray(int[] array){
       for (int i:
            array) {
           System.out.println(i);
       }
   }
}


package day04;

class Alg<T> {

    public void FindMaxVal(T[] arr) {
        Number[] array = (Number[]) arr;
        //找出数组中的最大值
        int max = 0;
        if (array instanceof Integer[]) {
            Integer[] a = (Integer[]) array;

            for (int i = 1; i < array.length; i++) {
                if (a[max] < a[i]) {
                    max = i;
                }
            }
            System.out.println("max-->" + a[max]);
        }
        if (array instanceof Double[]) {
            Double[] a = (Double[]) array;

            for (int i = 1; i < array.length; i++) {
                if (a[max] < a[i]) {
                    max = i;
                }
            }
            System.out.println("最大值-->" + a[max]);
        }

    }
}

    public  class TestDemo1 {
        public static void main(String[] args) {
            Integer[] arr = {1,4,2,10};
            Alg alg = new Alg();
            alg.FindMaxVal(arr);
            Float[] arr1 ={0.0f,0.2f};
            alg.FindMaxVal(arr1);
        }
    }


package day04;

public class TestDemo2 {
    public static void main (String[] args){
    Integer[] arrInt = {1,2,3,4,5};
    Float[] arrFloat = {0.1f,0.2f,0.3f,0.4f};
    //调用findMaxVal()方法
        int value = Alg2.findMaxVal(arrInt);//没有显式的给findMaxVal方法传类型参数，这是因为编译器可以通过方法的实际参数以及调用
        //方法时候的上下文识别出类型参数，这是泛型中的类型推断机制
        System.out.println(value);
        float value2 =Alg2.<Float>findMaxVal(arrFloat);//显式的传类型参数给方法
        System.out.println(value2);
    }
}

class Alg2{
    public static <T extends Comparable<T>>T findMaxVal(T[] arr){
    T max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i].compareTo(max)>0){
                max =arr[i];
            }
        }
        return max;
    }
}
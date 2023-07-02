package wuyue.main.args;

public class ArraysEquals2 {
    public static boolean equals(int[] t1, int[] t2) {
        if (t1 == t2)
            return true;
        if (t1 == null || t2 == null)
            return false;
        if(t1.length == t2.length){
            for(int i = 0;i<t2.length;i++){
                if(!(t1[i]==t2[i])){
                    return  false;
                }
            }
            return true;
        }else
            return false;

    }

    public static void main(String[] args) {

        int[] i1 = {10,20};
        int[] i2 = {10,20};

        System.out.println(ArraysEquals2.equals(i1,i2));
    }
}

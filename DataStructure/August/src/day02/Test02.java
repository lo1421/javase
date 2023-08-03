package day02;

public class Test02 {
    public static int firstUniqChar(String s) {
        int[] count = new int[256];
        //统计每个出现的次数
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        //找到第一个只出现一次的字符
        for (int i = 0; i < s.length(); i++) {
            if (1 == count[s.charAt(i)]) {
                return i;
            }
        }
        return -1;
    }
public static void main(String[] args){
    System.out.println( firstUniqChar("hello"));
}
}



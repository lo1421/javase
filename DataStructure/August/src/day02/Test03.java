package day02;

import java.util.Locale;

public class Test03 {
    public static void main(String[] args) {
    //测试toLowerCase()方法
        String originalString = args[0]+args[1];
        String lowerCaseString = originalString.toLowerCase();
        System.out.println("originalString:"+originalString);
        System.out.println("lowerCaseString:"+lowerCaseString);
    }
    public static boolean isPalindrome(String s){
     //将大小写统一起来
     s = s.toLowerCase();//将传进来的字符串全部转换为小写后储存在新字符串中并返回这个新字符串
     int left = 0,right = s.length()-1;
     while(left<right){
         //1、从左侧找到一个有效的字符
         while(left<right && !isValidChar(s.charAt(left))){
             left++;
         }
         //2、从右侧找到一个有效的字符
         while(left<right && !isValidChar(s.charAt(right))){
            right--;
         }
         if(s.charAt(left)!=s.charAt(right)){
             return false;
         }else {
             left++;
             right--;
         }
     }
     return true;
    }
    public static boolean isValidChar(char ch){
        if(ch>='a'&&ch<='z'||(ch>='0'&&ch<='9')){
            return true;
        }
        return  false;
    }

}

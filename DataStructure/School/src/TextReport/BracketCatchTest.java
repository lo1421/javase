package TextReport;

import java.util.Stack;

/*
括号匹配的题目，使用栈数据结构来实现，利用栈数据结构的先进后出的特点实现，边压栈边匹配
 */
public class BracketCatchTest {
    public static void main(String[] args) {
        System.out.println(isValid("[[])"));
        System.out.println(isValid("[])"));
        System.out.println(isValid("{}()"));
        System.out.println(isValid("([)]"));//这里不满足

    }

    static boolean isValid(String s) {
        //准备一个栈
        Stack<Character> stack = new Stack<>();
        //使用循环来获取字符串当中的字符
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            //如果是左括号就push到栈中
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                //这里表示是右括号
                if (stack.empty()) {
                    return false;
                }
                char top = stack.peek();
                if (ch == ')' && top == '(' || ch == '}' && top == '{' || ch == ']' && top == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        //整个字符串如果遍历完了之后，还要判断一下栈中是否是空的，若不为空，则表示左括号多，如是空的，那么就表示是匹配的
        if (stack.empty()) {
            return true;
        } else {
            return false;
        }
    }
}

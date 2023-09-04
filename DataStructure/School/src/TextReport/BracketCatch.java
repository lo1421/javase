package TextReport;

import java.util.Stack;

/*
我写的这个方法其实无法应对所有的情况，而且当我把字符串当中的字符获取出来，存放到两个栈当中的时候，根本就没有用到栈这种数据结构的特点，因为我
没有一边压栈一边弹栈，而是采用把左括号放在一个栈中，把有括号放在一个栈中，然后再分别取出来进行匹配，这样就会出现一个问题本来([)]这个是不满足匹配的，
但是当我分别放到两个栈中之后，就会出现左边的栈是（[,右边的栈是)],然后进行弹栈的时候就会发现，括号是匹配的，而([]),这种左边是([右边是])，弹出来就
不是匹配的，所以我这样的解法是错误的。错误的原因其实是右边括号的存放顺序是先遇见的先存从而导致后出，而匹配的时候就是左边后遇见的与右边后遇见的匹配了。
这样是错误的。但是如果我把存放右边的括号的栈逆序弹出，那么就可以实现目的了。

而老师之前讲过用迭代方法来实现栈的逆序输出

正确的应该是后遇见的左括号和先遇见的有括号开始匹配，如果只拿一个链表来装左括号，等装满之后，再弹出来后遇见的左括号跟先遇见的右括号开始匹配之后就能够完成目的了。


 */
public class BracketCatch {
    public static void main(String[] args) {
        System.out.println(isValid("[[])"));
        System.out.println(isValid("[])"));
        System.out.println(isValid("{}()"));
        System.out.println(isValid("([)]"));//这里不满足

    }

    static boolean isValid(String s) {
        Stack<Character> stackL = new Stack<>();
        Stack<Character> stackR = new Stack<>();
        int countL = 0;
        int countR = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stackL.push(c);
                countL++;
            } else {
                stackR.push(c);
                countR++;
            }
        }
        if (countL != countR) {
            return false;
        } else {

            while (!stackL.isEmpty() && !stackR.isEmpty()) {
                char left = stackL.peek();
                char right = stackR.peek();
                if ((left == '(' && right == ')') || (left == '{' && right == '}') || (left == '[' && right == ']')) {
                    left = stackL.pop();
                    right = stackR.pop();
                } else {
                    return false;
                }
            }

        }
        return true;
    }

}

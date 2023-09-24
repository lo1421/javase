package src;

import javax.sound.sampled.EnumControl;
import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 *   public ListNode(int val) {
 *     this.val = val;
 *   }
 * }
 */

public class Solution1 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param head1 ListNode类
     * @param head2 ListNode类
     * @return ListNode类
     */
    public ListNode addInList(ListNode head1, ListNode head2) {
        int a = ListToNum(head1);
        int b = ListToNum(head2);
        int num = a + b;
        return NumToList(num);

    }

    public int ListToNum(ListNode head) {
        ListNode cur = head;
        int num = 0;
        while (cur != null) {
            num = num * 10 + cur.val;
            cur = cur.next;
        }
        return num;
    }

    public ListNode NumToList(int num) {
        if (num == 0) {
            return new ListNode(0);
        }
// 将数字转换为字符串，以便逐位提取
        String s = Integer.toString(num);
        // 创建虚拟头节点
        ListNode newHead = new ListNode(-1);
        newHead.next = null;
        ListNode cur = newHead;
        for (int i = 0; i < s.length(); i++) {
            int value = Character.getNumericValue(s.charAt(i));
            ListNode node = new ListNode(value);
            cur.next = node;
            cur = cur.next;
        }
        return newHead.next;
    }
}
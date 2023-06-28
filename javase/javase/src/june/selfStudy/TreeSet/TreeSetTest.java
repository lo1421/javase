package june.selfStudy.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
public static void main(String[] args){
    Set<String> strs = new TreeSet<>();
    strs.add("c");
    strs.add("b");
    strs.add("a");
    for (String s :
         strs) {
        System.out.println(s);
    }
    /*运行结果：
    a
    b
    c
     */
}
}


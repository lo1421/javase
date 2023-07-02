package wuyue.main.args;

public class ArrayDeep01 {
    public static void main(String[] args) {
        int[] i = {1,2,3};
        int[] i1 = {9,9,9,9,9,9,9,9,9,};
        System.arraycopy(i,0,i1,0,i.length);
        for (int k = 0; k < i1.length; k++) {
            System.out.println(i1[k]);
        }
        System.out.println("-------------------------------------------");
        for (int k = 0; k < i.length; k++) {
            i[k] = 6;
        }
        for (int k = 0; k < i.length; k++) {
            System.out.println(i[k]);
        }
        for (int k = 0; k < i1.length; k++) {
            System.out.println(i1[k]);
        }

    }
}
/*
是的，这个例子确实证明了对于基本类型数组，`System.arraycopy()`方法会将源数组对象的元素值复制给目标数组。

在这个例子中，定义了两个整型数组 `i` 和 `i1`，并初始化它们的值。然后使用 `System.arraycopy()` 方法将 `i` 数组的元素值复制到 `i1` 数组中。

接着，通过遍历 `i1` 数组，我们可以看到 `i1` 数组中的元素值已经被成功复制为 `i` 数组中的元素值。这证明了基本类型数组的复制是通过复制元素值来完成的。

然后，在对 `i` 数组的元素进行修改后，再次遍历 `i1` 数组。我们可以看到 `i1` 数组的元素值没有受到影响，仍然保持着最初的复制结果。这是因为基本类型数组的复制是复制元素值本身，而不是复制对应位置的引用。

因此，这个例子确实证明了对于基本类型数组，`System.arraycopy()` 方法是将源数组对象的元素值复制给了目标数组。
 */
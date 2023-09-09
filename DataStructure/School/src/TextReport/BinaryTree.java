package TextReport;


public class BinaryTree {

    //遍历二叉树的几个方法
    //前序遍历
    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //中序遍历
    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    //后续遍历
    public void lastOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        lastOrder(root.left);
        lastOrder(root.right);
        System.out.print(root.val + " ");
    }
    //使用穷举法模拟实现一个二叉树
    public TreeNode createBinaryTree() {
        TreeNode A = new TreeNode('A');
        TreeNode B = new TreeNode('B');
        TreeNode C = new TreeNode('C');
        TreeNode D = new TreeNode('D');
        TreeNode E = new TreeNode('E');
        TreeNode F = new TreeNode('F');
        TreeNode G = new TreeNode('G');
        TreeNode H = new TreeNode('H');

        //目前上述所有的节点之间还没有关系，我们可以手动使其链接
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        E.right = H;
        C.left = F;
        C.right = G;

        //返回根节点
        return A;
    }

    //封装一个节点类
    static class TreeNode {
        //val域
        char val;
        //左孩子
        TreeNode left;
        //右孩子
        TreeNode right;

        //构造方法
        public TreeNode(char val) {
            this.val = val;
        }
    }


}

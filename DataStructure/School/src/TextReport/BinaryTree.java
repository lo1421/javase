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

    //返回第k层的节点数=左树的k层节点个数+右树的k层节点的个数
    public int getKLevelNodeCount(TreeNode root, int k) {
        if (k < 0) {
            return -1;
        }
        if (k == 0) return 1;
        if (root == null) return 0;
        if (k == 1) {
            return 1;
        }
        return getKLevelNodeCount(root.left, k - 1) + getKLevelNodeCount(root.right, k - 1);
    }

    //获取树中节点的个数 = 左树的节点的总数+右树的节点的总数 +根节点的个数（1）
    //用子问题来解题
    public int size(TreeNode root) {
        if (root == null) return 0;
        return size(root.left) + size(root.right) + 1;
    }

    //获取叶子节点的个数 = 左树的叶子节点的个数+右树叶子节点的个数
    //那么判断叶子树也就是当一个节点的左孩子和有孩子都为空的时候就是叶子结点
    public int getLeafNodeCount(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) {
            return 1;
        }
        return getLeafNodeCount(root.left) + getLeafNodeCount(root.right);
    }

    //获取二叉树的高度=max(左子树的高度，右子树的高度)+1(根节点)
    public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        if (leftHeight > rightHeight) {
            return leftHeight + 1;
        } else {
            return rightHeight + 1;
        }
    }

    public TreeNode find(TreeNode root, char value) {
        if (root == null) return null;
        if (root.val == value) return root;


        TreeNode leftTree = find(root.left, value);
        if (leftTree != null) {
            return leftTree;
        }
        TreeNode rightTree = find(root.right, value);
        if (rightTree != null) {
            return rightTree;
        }
        return null;
    }

    //传进来一个字符串，这个字符串是一棵树的前序遍历的结果，我们通过这个前序遍历创建一颗二叉树
    public TreeNode createPreTree(String s) {
        int i = 0;
        //这是根节点
        TreeNode root = new TreeNode(s.charAt(i));
        for (int j = 1; j < s.length(); j++) {
            char val = s.charAt(j);
            if (val != '#') {
                TreeNode leftTree = new TreeNode(val);
                
            }
        }
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

package TextReport;

public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        BinaryTree.TreeNode root = binaryTree.createBinaryTree();
        System.out.println("=================前序遍历===================");
        binaryTree.preOrder(root);
        System.out.println();
        System.out.println("=================中序遍历===================");
        binaryTree.inOrder(root);
        System.out.println();
        System.out.println("=================后序遍历===================");
        binaryTree.lastOrder(root);
        System.out.println();
        //查看二叉树第k层的节点数
        System.out.println("二叉树第4层的节点数:" + binaryTree.getKLevelNodeCount(root, 4));
        //查看树的节点总数
        System.out.println("树的节点总数：" + binaryTree.size(root));
        //查看树的叶子节点个数
        System.out.println("树的叶子结点个数为：" + binaryTree.getLeafNodeCount(root));
        System.out.println("二叉树的高度：" + binaryTree.getHeight(root));
        //查找树中是否存在元素val
        System.out.println(binaryTree.find(root, 'E').val);
    }
}

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
    }
}

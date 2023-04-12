package Lab16;

public class BinarySearchTreeTraversal {
    public static void preOrderTraversal(Node root) {
        if (root == null)
            return;

        System.out.println(root.getData() + " ");
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }

    public static void inOrderTraversal(Node root) {
        if (root == null)
            return;

        inOrderTraversal(root.leftChild);
        System.out.println(root.getData() + " ");
        inOrderTraversal(root.rightChild);
    }

    public static void postOrderTraversal(Node root) {
        if (root == null)
            return;

        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.println(root.getData() + " ");
    }

    public static void main(String[] args) {
        BST tree = new BST();
        // 10, 5, 11, 3

        tree.add(10);
        tree.add(5);
        tree.add(11);
        tree.add(3);

        // print in preOrder
        System.out.println("preOrderTraversal = ");
        preOrderTraversal(tree.root);
        System.out.println();

        System.out.println("inOrderTraversal = ");
        inOrderTraversal(tree.root);
        System.out.println();

        System.out.println("postOrderTraversal = ");
        postOrderTraversal(tree.root);
    }
}

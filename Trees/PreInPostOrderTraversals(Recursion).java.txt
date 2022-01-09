public class Main {
    public static class Node {
        Node left,right;
        int data;
        Node(int data) {
            this.data = data;
            left = right = null;
        }

    }
    public static class BinaryTree {
        Node root;
        BinaryTree() {
            this.root = null;
        }

    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(1);
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(3);
        binaryTree.root.left.left = new Node(4);
        binaryTree.root.left.right = new Node(5);

        preOrderTraversal(binaryTree.root);
        System.out.println("-------------");
        inOrderTraversal(binaryTree.root);
        System.out.println("-------------");
        postOrderTraversal(binaryTree.root);

    }

    public static void inOrderTraversal(Node node) {
        if(node == null) {
            return ;
        }
        inOrderTraversal(node.left);
        System.out.println(node.data);
        inOrderTraversal(node.right);
    }
    public static void preOrderTraversal(Node node) {
        if(node == null) {
            return ;
        }
        System.out.println(node.data);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);

    }

    private static void postOrderTraversal(Node root) {
        if(root == null) {
            return ;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.data);
    }
}

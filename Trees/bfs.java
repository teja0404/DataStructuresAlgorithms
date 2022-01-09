import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static class Node {
        Node left, right;
        int data;
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static class BinaryTree{
        Node root;
        BinaryTree() {
            this.root = null;
        }
    }

    public static  void bfs(Node node) {

        Queue<Node> q = new LinkedList<>();
        if(node != null) {
            q.add(node);
        }

        while (!q.isEmpty()) {
            Node top = q.poll();
            if(top != null) {
                System.out.println(top.data);
                q.add(top.left != null ? top.left : null);
                q.add(top.right != null ? top.right : null);
            }
        }
    }
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(1);
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(3);
        binaryTree.root.left.right = new Node(5);
        binaryTree.root.right.right = new Node(7);

        bfs(binaryTree.root);

    }

}

package Traversal;


public class Postorder_traversal {
    static void postorderTraversal(Node node) {

        // Base case:
        if (node == null)
            return;

        // Recur on the left subtree
        postorderTraversal(node.left);

        // Recur on the right subtree
        postorderTraversal(node.right);

        // Visit the current node
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(10);
        root.left.left.right = new Node(11);
        root.left.left.right.left = new Node(12);
        root.left.left.right.right = new Node(13);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.right = new Node(8);
        root.right.right.right.right = new Node(9);

        postorderTraversal(root);
    }
}

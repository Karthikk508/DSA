package Hard;

import java.util.ArrayList;

public class Children_sum {


    public static void main(String[] args) {


        ArrayList<Integer> ans = new ArrayList<>();
        Node root = new Node(35);
        root.left = new Node(20);
        root.right = new Node(15);
        root.left.left = new Node(15);
        root.left.right = new Node(5);
        root.right.left = new Node(10);
        root.right.right = new Node(5);
        //root.right.left.left = new Node(80);
        //root.right.right.left = new Node(90);

        System.out.println(check(root));

    }

    public static int check(Node node) {


        if (node == null) return 1;
        if (node.right == null && node.left == null) return 1;

        int sum = 0;
        if(node.left != null) sum += node.left.val;
        if(node.right != null) sum += node.right.val;

        if (node.val == sum)
            return check(node.left) & check(node.right);

        return 0;
    }
}

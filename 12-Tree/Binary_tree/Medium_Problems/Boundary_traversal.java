package Medium_Problems;

import java.util.ArrayList;

public class Boundary_traversal {

    private static boolean isLeaf(Node node)
    {
        return node.left == null && node.right == null;
    }
    private static void addLeaves(Node node, ArrayList<Integer> ans) {
        if(isLeaf(node))
        {
            ans.add(node.val);
            return;
        }
        addLeaves(node.left,ans);
        addLeaves(node.right,ans);
    }
    private static void addRightBoundary(Node node, ArrayList<Integer> ans) {

        Node cur = node.right;
        ArrayList<Integer> temp = new ArrayList<>();

        while(cur != null)
        {
            if(!isLeaf(cur)) temp.add(cur.val);

            if(cur.right != null) cur = cur.right;
            else
                cur = cur.left;
        }

        for(int i = temp.size()-1; i>=0; i--)
        {
            ans.add(temp.get(i));
        }

    }
    private static void addLeftBoundary(Node node, ArrayList<Integer> ans) {

        Node cur = node.left;

        while(cur != null)
        {
            if(!isLeaf(cur)) ans.add(cur.val);

            if(cur.left != null) cur = cur.left;
            else
                cur = cur.right;
        }
    }
    public static void main(String[] args) {

        ArrayList<Integer> ans = new ArrayList<>();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

//        if (root == null) {
//            System.out.println("false");
//        }
        if (!isLeaf(root)) {
            ans.add(root.val);
        }

        addLeftBoundary(root,ans);
        addLeaves(root,ans);
        addRightBoundary(root,ans);


        System.out.println(ans);
    }
}

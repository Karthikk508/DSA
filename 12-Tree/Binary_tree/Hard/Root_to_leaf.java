package Hard;

import java.util.ArrayList;
import java.util.Arrays;

class Node {
    int val;
    Node left;
    Node right;
    Node() {}
    Node(int val) { this.val = val; }
    Node(int val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class Root_to_leaf {


    public static void rootToLeaf(Node node, ArrayList<Integer> arr)
    {
        if(node == null)
        {
            return;
        }

        arr.add(node.val);

        if(node.right == null && node.left == null)
        {
            System.out.println(arr);
        }

        rootToLeaf(node.left,arr);
        rootToLeaf(node.right,arr);

        arr.remove(arr.size()-1);
    }


    public static void main(String[] args) {

        ArrayList<Integer> ans = new ArrayList<>();
        Node root = new Node(10);
        root.left = new Node(20);
        //root.right = new Node(30);
        //root.left.left = new Node(40);
        root.left.right = new Node(50);
        //root.right.left = new Node(60);
        //root.right.right = new Node(70);
        //root.right.left.left = new Node(80);
        //root.right.right.left = new Node(90);

        rootToLeaf(root,ans);
    }
}

package Leetcode.Easy;

import com.sun.source.tree.Tree;

public class Invert {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        //invertTree(root);

       // System.out.println();

        //printTree(root);

        System.out.println();

        invertTree2(root);



    }

    private static void printTree(TreeNode root) {

        if(root == null) return;

        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }

    public static void invertTree(TreeNode root) {

        if(root == null) return ;

        invertTree(root.left);
        invertTree(root.right);


        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        System.out.print(root.val + " ");
    }
    public static TreeNode invertTree2(TreeNode root) {

        if(root == null) return null;

        invertTree(root.left);
        invertTree(root.right);


        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        System.out.print(root.val + " ");

        return root;
    }



}

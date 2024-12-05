package Traversal.Iterative;

import java.util.*;

class Inorder {

    public static List<Integer> InorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;

        while(true)
        {
            if(node != null)
            {
                stack.push(node);
                node = node.left;
            }
            else {
                if(stack.isEmpty()) break;

               node = stack.pop();
               inorder.add(node.val);
               node = node.right;

            }
        }
        return inorder;

    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(10);
        root.left.left.right = new TreeNode(11);
        root.left.left.right.left = new TreeNode(12);
        root.left.left.right.right = new TreeNode(13);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.right.right = new TreeNode(8);
        root.right.right.right.right = new TreeNode(9);
        System.out.println(InorderTraversal(root));
    }
}
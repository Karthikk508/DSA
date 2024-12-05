package Leetcode.Easy;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class Minimum_depth {

    public static int minDepth(TreeNode root) {
        if(root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);

        if(left == 0 || right == 0)
        {
            return left + right + 1;
        }

        return  Math.min(left,right) + 1;

    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);
        root.left.left = new TreeNode(10);
        root.left.left.right = new TreeNode(5);

        root.right = new TreeNode(10);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(2);
        root.right.right.right = new TreeNode(3);
        root.right.right.right.right = new TreeNode(4);
        


        System.out.println(minDepth(root));
    }
}

//
//public class Solution {
//    public int minDepth(TreeNode root) {
//        if(root == null) return 0;
//        int left = minDepth(root.left);
//        int right = minDepth(root.right);
//        return (left == 0 || right == 0) ? left + right + 1: Math.min(left,right) + 1;
//
//    }
//}

//
//public static int minDepth(TreeNode root) {
//
//    if(root == null) return 0;
//
//    int lh = findLeft(root);
//    int rh = findRight(root);
//
//    if(root.right == null)
//    {
//        return lh;
//    }
//    if(root.left == null)
//    {
//        return rh;
//    }
//
//    if(lh < rh) return lh;
//
//    return rh;
//}
//public static void findLeft(int[] arr,TreeNode root)
//{
//    if(root == null) return;
//
//    if(root.right == null && root.left == null) return;
//
//    arr[0]++;
//
//    findLeft(arr,root.right);
//    findLeft(arr,root.left);
//
//}
//public static int findLeft(TreeNode root)
//{
//    int count = 1;
//    while(root.left != null)
//    {
//        count++;
//        root = root.left;
//    }
//    return count;
//}
//public static int findRight(TreeNode root)
//{
//    int count = 1;
//    while(root.right != null)
//    {
//        count++;
//        root = root.right;
//    }
//    return count;
//}

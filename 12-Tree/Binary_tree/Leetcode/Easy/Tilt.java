package Leetcode.Easy;

public class Tilt {

    public static int findSum(TreeNode root)
    {

        if(root == null) return 0;


        int left = findSum(root.left);
        int right = findSum(root.right);

        return left+right+root.val;

    }

    public static void tilt(int[] arr,int ans,TreeNode root)
    {
        if(root == null) return;

        tilt(arr,ans,root.left);
        tilt(arr,ans,root.right);

        if(root.left != null && root.right != null ) ans = Math.abs(findSum(root.left) - findSum(root.right));
        if(root.left == null && root.right != null) ans = Math.abs(findSum(root.right));
        if(root.left != null && root.right == null) ans = Math.abs(findSum(root.left));

        arr[0] += ans;
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(2);
        root.right = new TreeNode(9);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(5);

        root.right.right = new TreeNode(7);

        int[] arr = new int[1];

        tilt(arr,0,root);

        System.out.println(arr[0]);



    }
}

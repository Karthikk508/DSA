package Leetcode.Easy;


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}

public class TargetSumToroot {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.left.left = new TreeNode(5);

        TreeNode node = root;


        System.out.println(find(6,0,node,root));


    }
    public static boolean find(int targetSum,int sum,TreeNode node,TreeNode root)
    {
        if(node == null) return false;

        sum += node.val;
        int sum1 = sum;

        if(node != root && node.left == null && node.right == null && sum1 == targetSum){
            return true;
        }

        return  find(targetSum,sum,node.left,root) || find(targetSum,sum,node.right,root);
    }
//    public static boolean find(int targetSum,int sum,TreeNode node)
//    {
//        if(node == null) return false;
//
//        sum += node.val;
//        int sum1 = sum;
//
//        if(sum1 == targetSum){
//            return true;
//        }
//
//        return  find(targetSum,sum,node.left) || find(targetSum,sum,node.right);
//    }
}

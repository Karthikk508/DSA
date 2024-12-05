package Leetcode.Easy;

import java.util.*;

class Root_to_leaf {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        // Left subtree
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);

        // Right subtree
        root.right = new TreeNode(3);

        binaryTreePaths(root);




    }
    public static List<String> binaryTreePaths(TreeNode root) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> track = new ArrayList<>();
        paths(track,ans,root);
        List<String> list = new ArrayList<>();

        System.out.println(ans);

        for(int i = 0; i<ans.size(); i++)
        {
            String ans1 = "";
            for(int j = 0; j<ans.get(i).size(); j++)
            {
                ans1 += ans.get(i).get(j);
            }
            list.add(ans1);
        }
        return list;
    }

    public static void paths(ArrayList<Integer> track,ArrayList<ArrayList<Integer>> ans,TreeNode root)
    {

        if(root == null)
        {
            return;
        }
        track.add(root.val);
        if (root.left == null && root.right == null)  ans.add(new ArrayList<>(track));

        paths(track,ans,root.left);
        paths(track,ans,root.right);
        track.remove(track.size()-1);
    }
}
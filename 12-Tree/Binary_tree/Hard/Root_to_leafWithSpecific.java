package Hard;

import java.util.ArrayList;

public class Root_to_leafWithSpecific {


    public static boolean find(int x, Node node, ArrayList<Integer> arr)
    {
        if(node == null) {
            return false;
        }
        arr.add(node.val);


        if(node.val == x)
        {
            return true;
        }

        if(find(x,node.left,arr) || find(x,node.right,arr))
        {
            return true;
        }

        arr.removeLast();

        return false;
    }


    public static void main(String[] args) {


        ArrayList<Integer> ans = new ArrayList<>();
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        root.right.left.left = new Node(80);
        root.right.right.left = new Node(90);

        System.out.println(find(70,root,ans));

        System.out.println(ans);

    }
}

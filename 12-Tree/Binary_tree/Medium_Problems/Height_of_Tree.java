package Medium_Problems;



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

class Height_of_Tree {


    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(6);
        root.right.left.left = new Node(5);

        System.out.println(maxDepth(root));

    }

    public static int maxDepth(Node root) {

        if(root == null) return 0;

        int ln = maxDepth(root.left);
        System.out.println(ln);
        int rn = maxDepth(root.right);
        System.out.println(rn);


        return 1 + Math.max(ln,rn);

    }
}
package Medium_Problems;


import java.util.*;


class Pair<K, V> {
    private K key;
    private V value;

    // Constructor
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // Getter methods
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}


public class Vertical_traversal {

    public List<List<Integer>> findVertical(Node root) {

        Map<Integer, Map<Integer, TreeSet<Integer>>> nodes = new TreeMap<>();

       
        Queue<Pair<Node, Pair<Integer, Integer>>> todo = new LinkedList<>();

        // Push the root node with initial vertical
        // and level values (0, 0)
        todo.add(new Pair<>(root, new Pair<>(0, 0)));

        // BFS traversal
        while (!todo.isEmpty()) {
            // Retrieve the node and its vertical
            // and level information from
            // the front of the queue
            Pair<Node, Pair<Integer, Integer>> p = todo.poll();
            Node temp = p.getKey();

            // Extract the vertical and level information
            // x -> vertical
            int x = p.getValue().getKey();
            // y -> level
            int y = p.getValue().getValue();

            // Insert the node value into the
            // corresponding vertical and level
            // in the map
            nodes.computeIfAbsent(x, k -> new TreeMap<>())
                    .computeIfAbsent(y, k -> new TreeSet<>())
                    .add(temp.val);

            // Process left child
            if (temp.left != null) {
                todo.add(new Pair<>(temp.left, new Pair<>(x - 1, y + 1)));
            }

            // Process right child
            if (temp.right != null) {
                todo.add(new Pair<>(temp.right, new Pair<>(x + 1, y + 1)));
            }
        }

        // Prepare the final result list
        // by combining values from the map
        List<List<Integer>> ans = new ArrayList<>();
        for (Map.Entry<Integer, Map<Integer, TreeSet<Integer>>> entry : nodes.entrySet()) {
            List<Integer> col = new ArrayList<>();
            for (TreeSet<Integer> set : entry.getValue().values()) {
                // Insert node values
                // into the column list
                col.addAll(set);
            }
            // Add the column list
            // to the final result
            ans.add(col);
        }
        return ans;
    }

    // Helper function to
    // print the result
    private static void printResult(List<List<Integer>> result) {
        for (List<Integer> level : result) {
            for (int node : level) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(10);
        root.left.left.right = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(3);
        root.right.right = new Node(10);
        root.right.left = new Node(9);

        Vertical_traversal solution = new Vertical_traversal();

        // Get the Vertical traversal
        List<List<Integer>> verticalTraversal = solution.findVertical(root);

        // Print the result
        System.out.print("Vertical Traversal: ");
        printResult(verticalTraversal);
    }
}


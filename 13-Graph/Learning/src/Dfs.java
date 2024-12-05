import java.util.*;


public class Dfs {

    public static void dfs(int node,boolean[] vis,ArrayList<Integer> dfs,ArrayList<ArrayList<Integer>> adj)
    {

        vis[node] = true;
        dfs.add(node);

        for(Integer it : adj.get(node))
        {
            if(!vis[it])
            {
                dfs(it,vis,dfs,adj);
            }
        }

//        for(int i = 0; i<adj.get(node).size(); i++)
//        {
//            if(!vis[adj.get(node).get(i)])
//            {
//                dfs(adj.get(node).get(i),vis,dfs,adj);
//            }
//        }

    }
    public static ArrayList<Integer> dfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer> dfs = new ArrayList<>();
        boolean[] vis =  new boolean[V+1];
        dfs(1,vis,dfs,adj);
        return dfs;

    }

    public static void main(String args[]) {

        ArrayList <ArrayList< Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 9; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(1).add(2);
        adj.get(1).add(3);
        adj.get(2).add(1);
        adj.get(2).add(5);
        adj.get(2).add(6);
        adj.get(3).add(1);
        adj.get(3).add(4);
        adj.get(3).add(7);
        adj.get(4).add(3);
        adj.get(4).add(8);
        adj.get(5).add(2);
        adj.get(6).add(2);
        adj.get(7).add(3);
        adj.get(7).add(8);
        adj.get(8).add(4);
        adj.get(8).add(7);



        Dfs sl = new Dfs();
        ArrayList < Integer > ans = sl.dfsOfGraph(8, adj);
        int n = ans.size();
        for(int i = 0;i<n;i++) {
            System.out.print(ans.get(i)+" ");
        }
    }
}
package Graph;

import java.util.*;

class Graph{
    public int n;
    ArrayList<Integer>[] adj;

    public Graph(int n){
        this.n = n;
        adj = new ArrayList[n];
        for(int i = 0; i < n; i++)
            adj[i] = new ArrayList<>();
    }

    //unweighted
    public void addEdge(int src, int dest){
        adj[src].add(dest);
        adj[dest].add(src); //undirected
    }
}


public class AdjaciencyList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            Graph g = new Graph(n);

            int e = sc.nextInt();
            while(e-- > 0){
                int src = sc.nextInt();
                int dest = sc.nextInt();
                g.addEdge(src,dest);
            }

            for(int i = 0; i< n; i++){
                System.out.println(g.adj[i]);
            }
        }
}

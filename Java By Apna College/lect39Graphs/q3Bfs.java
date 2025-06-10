import java.util.*;

// // // time complecxity is O(V+E) of graphs bfs
// class Edge {
//     int src;
//     int dest;
//     int weight;

//     public Edge(int s, int d) {
//         this.src = s;
//         this.dest = d;
//     }
// }

// class createGraph {
//     public void graphcreation(ArrayList<Edge> graph[]) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<Edge>();
//         }

//         graph[0].add(new Edge(0, 1));
//         graph[0].add(new Edge(0, 2));

//         graph[1].add(new Edge(1, 0));
//         graph[1].add(new Edge(1, 3));

//         graph[2].add(new Edge(2, 0));
//         graph[2].add(new Edge(2, 4));

//         graph[3].add(new Edge(3, 1));
//         graph[3].add(new Edge(3, 4));
//         graph[3].add(new Edge(3, 5));

//         graph[4].add(new Edge(4, 2));
//         graph[4].add(new Edge(4, 3));
//         graph[4].add(new Edge(4, 5));

//         graph[5].add(new Edge(5, 3));
//         graph[5].add(new Edge(5, 4));
//         graph[5].add(new Edge(5, 6));

//         graph[6].add(new Edge(6, 5));
//     }
// }

// class Solution {
//     public void bfs(ArrayList<Edge> graph[], int v,boolean[] vist,int st) {
//         Queue<Integer> q = new LinkedList<>();

//         // boolean vist[] = new boolean[v];
//         // Arrays.fill(vist, false);
//         // q.add(0);
//         q.add(st);

//         while (!q.isEmpty()) {
//             int node = q.remove();
//             if (vist[node] == false) {
//                 System.out.print(node + " ");
//                 vist[node] = true;
//                 for (int i = 0; i < graph[node].size(); i++) {
//                     Edge eg = graph[node].get(i);
//                     q.add(eg.dest);
//                 }
//             }
//         }
//     }
// }

// // 0-> 1 2
// // 1-> 0 3
// // 2-> 0 4
// // 3-> 1 4 5
// // 4-> 2 3 5
// // 5-> 3 4 6
// // 6-> 5
// public class q3Bfs {
//     public static void main(String[] args) {
//         // Scanner sc= new Scanner(System.in);
//         // int v=sc.nextInt();
//         // int e=sc.nextInt();

//         //    1 --- 3
//         //  / |      \
//         // 0  |       5 -- 6
//         //  \ |       /
//         //    2 ---- 4
//         int v = 7;
//         @SuppressWarnings("unchecked")
//         ArrayList<Edge> gh[] = new ArrayList[v];

//         createGraph cgh = new createGraph();
//         cgh.graphcreation(gh);

//         boolean vist[] = new boolean[v];
//         Arrays.fill(vist, false);
//         Solution sb = new Solution();
//         // this approach is for disconnected graphs or where tow components 
//         for (int i = 0; i < vist.length; i++) {
//             if (vist[i] == false)
//                sb.bfs(gh, v, vist, i);
//         }
//     }
// }

// BFS using list of list graph
class Edge{
    int src;
    int dest;
    int wt;

    public Edge(int s,int d){
        this.src=s;
        this.dest=d;
    }
}

class Graph{
    public List<List<Edge>> adjList;
    public Graph(int v){
        adjList = new ArrayList<>();
        for (int i=0;i<v;i++){
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u,int v){
        adjList.get(u).add(new Edge(u,v));
        adjList.get(v).add(new Edge(v,u));
    }

    public void printGraph(){
        for (int i = 0; i < adjList.size(); i++) {
            System.out.print(i+"-> ");
            for (int j = 0; j < adjList.get(i).size(); j++) {
                Edge eg = adjList.get(i).get(j);
                System.out.print(eg.dest+" ");
            }
            System.out.println();
        }
    }

}

class Solution{
    public void BFS(List<List<Edge>> adjList,int V){
        Queue<Integer> q =new LinkedList<>();

        boolean[] vist =new boolean[V];
        q.add(0);

        while(!q.isEmpty()){
            int node = q.poll();
            if (!vist[node]){
                vist[node]=true;
                System.out.print(node+" ");
                for (Edge eg: adjList.get(node)) {
                    q.add(eg.dest);
                }
            }
        }
    }
}
public class q3Bfs {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int V=sc.nextInt();
        int E=sc.nextInt();

        //    1 --- 3
        //  / |      \
        // 0  |       5 -- 6
        //  \ |       /
        //    2 ---- 4

        Graph cg = new Graph(V);
        for (int i = 0; i <E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            cg.addEdge(u, v);
        }
        cg.printGraph();
        // cg.BFS(V);

        List<List<Edge>> gh = cg.adjList;
        Solution s= new Solution();
        s.BFS(gh, V);
    }
}
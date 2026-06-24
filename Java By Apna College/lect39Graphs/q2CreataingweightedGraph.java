import java.util.*;

// class Edge {
//     int src;
//     int dest;
//     int weight;

//     public Edge(int src, int dest, int weight) {
//         this.src = src;
//         this.dest = dest;
//         this.weight = weight;
//     }
// }

// class createGraph {
//     public void graphcreation(ArrayList<Edge> graph[]) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<Edge>();
//         }

//         graph[0].add(new Edge(0, 2, 2));

//         graph[1].add(new Edge(1, 2, 10));
//         graph[1].add(new Edge(1, 3, 0));

//         graph[2].add(new Edge(2, 0, 2));
//         graph[2].add(new Edge(2, 1, 10));
//         graph[2].add(new Edge(2, 3, -1));

//         graph[3].add(new Edge(3, 1, 0));
//         graph[3].add(new Edge(3, 2, -1));
//     }
// }

// public class q2CreataingweightedGraph {
//     public static void main(String[] args) {
//         int v = 4;
//         ArrayList<Edge> graph[] = new ArrayList[v];

//         createGraph cg = new createGraph();
//         cg.graphcreation(graph);

//         for (int i = 0; i < graph.length; i++) {
//             System.out.print(i + "-> ");
//             for (int j = 0; j < graph[i].size(); j++) {
//                 Edge e = graph[i].get(j);
//                 System.out.print("(w:"+e.weight + ")"+"d:"+e.dest);
//                 if (j < graph[i].size()-1){
//                     System.out.print(", ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// Create graph using List<List<>>
class Edge{
    int src;
    int dest;
    int wt;

    public Edge(int s,int d,int w){
        this.src=s;
        this.dest=d;
        this.wt=w;
    }
}

class Graph{
    List<List<Edge>> adjList;
    public Graph(int v){
        adjList = new ArrayList<>();
        for (int i=0;i<v;i++){
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u,int v,int w){
        adjList.get(u).add(new Edge(u,v,w));
    }

    public void printGraph(){
        for (int i = 0; i < adjList.size(); i++) {
            System.out.print(i+"-> ");
            for (int j = 0; j < adjList.get(i).size(); j++) {
                Edge eg = adjList.get(i).get(j);
                System.out.print(eg.dest+"("+eg.wt+") ");
            }
            System.out.println();
        }
    }
}
public class q2CreataingweightedGraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        int E = sc.nextInt();

        Graph cg = new Graph(V);
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            cg.addEdge(u,v,w);
        }

        cg.printGraph();
    }
}
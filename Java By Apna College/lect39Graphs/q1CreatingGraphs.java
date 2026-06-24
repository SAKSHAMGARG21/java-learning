import java.util.*;

class Edge {
    int src;
    int dest;

    public Edge(int src, int dest) {
        this.src = src;
        this.dest = dest;
    }
}

class createGraph {
    public void graphcreation(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        // graph[0].add(new Edge(0, 2));

        // graph[1].add(new Edge(1, 2));
        // graph[1].add(new Edge(1, 3));

        // graph[2].add(new Edge(2, 0));
        // graph[2].add(new Edge(2, 1));
        // graph[2].add(new Edge(2, 3));

        // graph[3].add(new Edge(3, 1));
        // graph[3].add(new Edge(3, 2));

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }
}

public class q1CreatingGraphs {
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph cg = new createGraph();
        cg.graphcreation(graph);

        for (int i = 0; i < graph.length; i++) {
            System.out.print(i + "-> ");
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                System.out.print("{"+e.src+","+e.dest + "}");
                if (j<graph[i].size()-1){
                    System.out.print(";");
                }
            }
            System.out.println();
        }
    }
}

// import java.util.*;

// // input:
// // 5 4
// // 1 3
// // 0 2
// // 3 0
// // 4 3
// // 1 3
// // output:
// // 0-> 2 
// // 1-> 3 
// // 2-> 
// // 3-> 0 
// // 4-> 3 

// // input:
// // 7 16
// // 0 1
// // 0 2
// // 1 0
// // 1 3
// // 2 0
// // 2 4
// // 3 1
// // 3 4
// // 3 5
// // 4 2
// // 4 3
// // 4 5
// // 5 3
// // 5 4
// // 5 6
// // 6 5
// // output:
// // 0-> 1 2 
// // 1-> 0 3 
// // 2-> 0 4 
// // 3-> 1 4 5 
// // 4-> 2 3 5 
// // 5-> 3 4 6 
// // 6-> 5 

// class Edge{
//     int src;
//     int dest;
//     int wt;

//     public Edge(int s,int d){
//         this.src=s;
//         this.dest=d;
//     }
// }

// class Graph{
//     List<List<Edge>> adjList;
//     public Graph(int v){
//         adjList = new ArrayList<>();
//         for (int i=0;i<v;i++){
//             adjList.add(new ArrayList<>());
//         }
//     }

//     public void addEdge(int u,int v){
//         adjList.get(u).add(new Edge(u,v));
//     }

//     public void printGraph(){
//         for (int i = 0; i < adjList.size(); i++) {
//             System.out.print(i+"-> ");
//             for (int j = 0; j < adjList.get(i).size(); j++) {
//                 Edge eg = adjList.get(i).get(j);
//                 System.out.print(eg.dest+" ");
//             }
//             System.out.println();
//         }
//     }
// }
// public class q1CreatingGraphs {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int V = sc.nextInt();
//         int E = sc.nextInt();

//         Graph cg = new Graph(V);
//         for (int i = 0; i < E; i++) {
//             int u = sc.nextInt();
//             int v = sc.nextInt();
//             cg.addEdge(u,v);
//         }

//         cg.printGraph();
//     }
// }
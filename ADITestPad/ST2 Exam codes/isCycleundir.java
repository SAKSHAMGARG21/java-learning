
class Edge {
    int src;
    int dest;

    public gh(int s,int d){
        this.src=s;
        this.dest=d;
    }
}

class creategh {
    public void createGraph(ArrayList<Edge>[] gh, int[][] arr) {
        for (int i = 0; i < gh.length; i++) {
            gh[i] = new ArrayList<>();
        }

        for (int i = 0; i < arr.length; i++) {
            gh[arr[i][0]].add(new Edge(arr[i][0], arr[i][1]));
            gh[arr[i][1]].add(new Edge(arr[i][1], arr[i][0]));
        }
    }

    public void printgh(ArrayList<Edge>[] gh) {

        for (int i = 0; i < gh.length; i++) {
            System.out.print(i + "->");
            for (int j = 0; j < gh[i].size(); j++) {
                System.out.print(gh[i].get(j) + " ");
            }
            System.out.println();
        }
    }
}

class solution {

    public boolean isCyclye(ArrayList<Edge>[] gh, boolean[] vist, int curr, int par) {
        vist[curr] = true;
        for (int i = 0; i < gh.length; i++) {
            for (int j = 0; j < gh[i].size(); j++) {
                Edge eg = gh[i].get(i);
                if (!vist[eg.dest]) {
                    if (isCyclye(gh, vist, eg.dest, curr)) {
                        return true;
                    }
                } else if (curr != par) {
                    return true;
                }
            }
        }
        return false;
    }
}

public class isCycleundir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int e = sc.nextInt();

        int[][] arr = new int[e][2];
        for (int i = 0; i < e; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        ArrayList<Edge>[] gh = new ArrayList[v];

        creategh cg = new creategh();
        cg.createGraph(gh, arr, e, v);

        cg.printgh();

        solution sb = new solution();
        sb.isCyclye();

    }
}

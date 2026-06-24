import java.util.*;

// class Pair implements Comparable<Pair> {
//     int data;
//     String name;

//     Pair(int d, String s) {
//         this.data = d;
//         this.name = s;
//     }

//     public int compareTo(Pair obj) {
//         if (this.data == obj.data) {
//             return this.name.compareTo(obj.name);
//         }
//         return this.data - obj.data;
//     }

//     public String toString() {
//         return "Item ->" + "[ " + data + " : " + name + " ]";
//     }
// }

class Pair {
    int data;
    String name;

    Pair(int d, String s) {
        this.data = d;
        this.name = s;
    }

    public String toString() {
        return "Item ->" + "[ " + data + " : " + name + " ]";
    }
}

public class revise {
    public static void main(String[] args) {
        ArrayList<Pair> arr = new ArrayList<Pair>();

        arr.add(new Pair(1, "atony"));
        arr.add(new Pair(4, "cLoki"));
        arr.add(new Pair(2, "bhulk"));
        arr.add(new Pair(3, "ethor"));
        arr.add(new Pair(5, "fdon"));

        // Collections.sort(arr, (a, b) -> a.data - b.data);
        Collections.sort(arr, new Comparator<>() {
            public int compare(Pair p1, Pair p2) {
                if (p1.data == p2.data) {
                    return p1.name.compareTo(p2.name);
                }
                return p1.data - p2.data;
            }
        });
        for (Pair p : arr)
            System.out.println(p + " ");
    }
}

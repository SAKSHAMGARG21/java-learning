import java.util.*;

class Pair implements Comparable<Pair> {
    int fst;
    int sec;

    public Pair(int f, int s) {
        this.fst = f;
        this.sec = s;
    }

    public int compareTo(Pair ob) {
        return this.sec - ob.sec;
    }

    public String toString() {
        return "Pairs -> " + fst + ":" + sec;
    }
}

class Solution {
    public int maxPairs(int[] arr1, int[] arr2) {
        int n = arr1.length;

        ArrayList<Pair> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(new Pair(arr1[i], arr2[i]));
        }

        Collections.sort(arr);

        int mx = 0;// max pairs
        int lastvalue = -1111;
        for (int i = 0; i < arr.size(); i++) {
            if (lastvalue < arr.get(i).fst) {
                lastvalue = arr.get(i).sec;
                mx++;
            }
        }
        return mx;
    }
}

public class sortPairs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = sc.nextInt();
        }

        Solution sb = new Solution();
        System.out.println(sb.maxPairs(arr1, arr2));
    }
}

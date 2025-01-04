
// User function Template for Java
import java.util.*;

class Solution {

    ArrayList<Integer> search(String pat, String txt) {
        // your code here
        ArrayList<Integer> arr = new ArrayList<>();
        int id = 0;
        while (id != -1) {
            id = txt.indexOf(pat, id);
            if (id != -1) {
                arr.add(id);
                id++;
            }
        }
        return arr;
    }
}

public class kmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String txt = sc.next();
            String pat = sc.next();
            Solution s = new Solution();
            ArrayList<Integer> res = s.search(pat, txt);
            if (res.size() == 0) {
                System.out.println("-1");
            } else {
                for (int i = 0; i < res.size(); i++) {
                    System.out.print(res.get(i) + " ");
                }
                System.out.println();
            }
        }
    }
}

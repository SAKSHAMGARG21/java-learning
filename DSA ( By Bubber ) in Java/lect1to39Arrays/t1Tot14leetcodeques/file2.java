import java.util.*;

public class file2 {

    public static ArrayList<Integer> makearray(int[] arr, int n) {
        ArrayList<Integer> lt = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int val= arr[i];
            while (lt.contains(val)) {
                val++;
            }
            lt.add(val);
        }
        return lt;
    }

    // public static boolean checkAB(String str,int e){
    //     int Acnt=0;
    //     int Bcnt=0;
    //     for (int i = 0; i <= e; i++) {
    //         if (str.charAt(i)=='A'){
    //             Acnt++;
    //         }else{
    //             Bcnt++;
    //         }
    //     }
    //     return Acnt == Bcnt;
    // }
    // public static int longestEqualString(String str,int n){
    //     int s=0;
    //     int e= n-1;
    //     while(s<e) {
    //         if (checkAB(str,e)){
    //             return e+1;
    //         }
    //         e--;
    //     }
    //     return 0;
    // }

    public static int longestBalancedSubstring(String str) {
        int maxLen = 0;
        int n = str.length();
        
        for (int i = 0; i < n; i++) {
            int Acnt = 0, Bcnt = 0;
            for (int j = i; j < n; j++) {
                char ch = str.charAt(j);
                if (ch == 'A') Acnt++;
                else if (ch == 'B') Bcnt++;
    
                if (Acnt > 4 || Bcnt > 4) break;
    
                if (Acnt == 4 && Bcnt == 4) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
    
        return maxLen;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }

        // ArrayList<Integer> res = makearray(arr, n);
        // System.out.println(res);

        String str=sc.nextLine();
        int res= longestBalancedSubstring(str);
        System.out.println(res);
    }
}

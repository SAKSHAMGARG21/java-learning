import java.util.ArrayList;

public class nextbigElemetn {
    public static void solve(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> res =new ArrayList<>();
        for (int i = 0; i < n-1; i++) {
            int flag=1;
            for (int j = i + 1; j < n; j++) {
                if(arr[i] < arr[j]){
                    flag=0;
                }
            }
            if (flag == 1){
                res.add(arr[i]);
            }
        }
        res.add(arr[n-1]);
        System.out.println(res);
    }

    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        solve(arr);
    }
}

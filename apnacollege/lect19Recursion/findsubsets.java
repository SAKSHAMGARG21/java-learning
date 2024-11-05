import java.util.*;

public class findsubsets {
    public static void printsubsets(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }

    public static void funfindsubsets(int n, ArrayList<Integer> arr) {
        if (n == 0) {
            printsubsets(arr);
            return;
        }
        // add
        arr.add(n);
        funfindsubsets(n - 1, arr);

        // remove
        arr.remove(arr.size() - 1);
        funfindsubsets(n - 1, arr);

    }

    public static void main(String[] args) {

        int n = 3;
        ArrayList<Integer> arr = new ArrayList<>();
        funfindsubsets(n, arr);
    }
}

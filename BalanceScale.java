import java.util.*;

public class BalanceScale {
    public static String canBalance(int X, int Y, int[] weights) {
        if (X == Y)
            return "YES";

        for (int i = 0; i < weights.length; i++) {
            int xw = X + weights[i];
            if (xw == Y)
                return "YES";
        }
        for (int i = 0; i < weights.length; i++) {
            int yw = Y + weights[i];
            for (int j = 0; j < weights.length; j++) {
                int xw = X + weights[j];
                if (xw == yw)
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        // Example Test Cases
        System.out.println(canBalance(3, 7, new int[] { 2, 3, 5, 18, 4 })); // YES
        System.out.println(canBalance(5, 8, new int[] { 2, 9, 4, 11, 6 })); // YES
        System.out.println(canBalance(4, 8, new int[] { 2, 1, 1, 9, 7 })); // NO
    }
}

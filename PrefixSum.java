import java.util.*;

public class PrefixSum {
    private int[] prefix;

    public PrefixSum(int[] arr) {
        prefix = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }
    }

    public int rangeSum(int left, int right) {
        return prefix[right + 1] - prefix[left];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        PrefixSum ps = new PrefixSum(arr);
        System.out.println(ps.rangeSum(1, 3)); // Output: 9 (2+3+4)
    }
}

// package t4Arrays;

// import java.lang.*;
import java.util.Scanner;

public class forEachloop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // 1D array
        // int nums[]= {1,2,3,4};
        // for (int i : nums) {
        // System.out.println(i);
        // }
        // 2D Array
        int nums[][] = {{1, 2}, {3, 4}, {5, 6}};
        for (int i[] : nums) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

}

// package t4Arrays;

import java.util.Scanner;

public class Declare2dArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // statically in stack allocation of 2D array
        // int nums[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 2; j++) {
        // System.out.print(nums[i][j] + " ");
        // }
        // System.out.println();
        // }

        // dynamically in heap allocation of 2D array
        // int ros = sc.nextInt();
        // int col = sc.nextInt();
        // int nums[][]=new int[ros][col];

        // for (int i = 0; i < ros; i++) {
        // for (int j = 0; j < col; j++) {
        // nums[i][j]=sc.nextInt();
        // }
        // }

        // for (int i = 0; i < ros; i++) {
        // for (int j = 0; j < col; j++) {
        // System.out.print(nums[i][j]+" ");
        // }
        // System.out.println();
        // }

        // Jagged array
        int nums[][] = new int[100][100];
        int ros = sc.nextInt();
        int colm[] = new int[ros];

        for (int i = 0; i < colm.length; i++) {
            colm[i] = sc.nextInt();
        }
        for (int i = 0; i < ros; i++) {
            for (int j = 0; j < colm[i]; j++) {
                nums[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < ros; i++) {
            for (int j = 0; j < colm[i]; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

    }
}

import java.util.*;
public class file {
    public static boolean searchMatrix(int[][] arr, int target) {
        int rs = arr.length;
        int cs = arr[0].length;

        int s = 0;
        int e = (rs * cs) - 1;

        while (s <= e) {
            int mid = (s + e) / 2;
            int element = arr[mid / cs][mid % cs];

            if (element == target) {
                return true;
            } else if (element < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
            matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the target element to search:");
        int target = sc.nextInt();

        boolean result = searchMatrix(matrix, target);
        if (result) {
            System.out.println("Target found in the matrix.");
        } else {
            System.out.println("Target not found in the matrix.");
        }

        sc.close();
    }
}

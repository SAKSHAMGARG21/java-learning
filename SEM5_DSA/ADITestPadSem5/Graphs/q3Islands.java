
import java.util.*;

class Result {

    static boolean isValid(int[][] mat, int row, int col) {
        return (row >= 0 && row < mat.length && col >= 0 && col < mat[0].length && mat[row][col] == 1);
    }

    static void markVisited(int[][] mat, int row, int col) {
        if (!isValid(mat, row, col)) {
            return;
        }

        mat[row][col] = -1; // Mark the cell as visited by setting it to -1

        // Check all 4 possible directions (up, down, left, right)
        markVisited(mat, row - 1, col); // up
        markVisited(mat, row + 1, col); // down
        markVisited(mat, row, col - 1); // left
        markVisited(mat, row, col + 1); // right
    }

    static int countIslands(int[][] mat, int m, int n) {
        int cntIsland = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    cntIsland++;
                    markVisited(mat, i, j);
                }
            }
        }
        return cntIsland;
    }
}

public class q3Islands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int res = Result.countIslands(arr, n, m);
        System.out.println(res);
    }
}

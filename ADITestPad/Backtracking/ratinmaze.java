
import java.util.*;

// class ratinmaze {
//     public static boolean isSafe(int[][] maze, int x, int y, int[][] vist) {
//         return (x >= 0 && x < maze.length && y >= 0 && y < maze[0].length && vist[x][y] == 0 && maze[x][y] == 0);
//     }

//     public static int helper(int[][] maze, int x, int y, int[][] vist, int size) {
//         if (x == size - 1 && y == size - 1) {
//             return 1;
//         }

//         vist[x][y] = 1;

//         int[] rowNum = {-1, 1, 0, 0};  // Up, Down
//         int[] colNum = {0, 0, -1, 1};  // Left, Right

//         int count = 0;
//         for (int i = 0; i < 4; i++) {
//             int sr = x + rowNum[i];
//             int sc = y + colNum[i];
//             if (isSafe(maze, sr, sc, vist)) {
//                 count += helper(maze, sr, sc, vist, size);
//             }
//         }

//         vist[x][y] = 0;  // Backtrack
//         return count;
//     }

//     public static int countPaths(int maze[][], int size) {
//         if (maze[0][0] == -1) {
//             return 0;
//         }

//         int[][] vist = new int[size][size];
//         for (int i = 0; i < size; i++) {
//             Arrays.fill(vist[i], 0);
//         }

//         return helper(maze, 0, 0, vist, size);
//     }

//     public static void main(String[] args) {
//         int[][] maze = {
//             {0, 0, -1, 0},
//             {0, -1, 0, 0},
//             {0, 0, 0, -1},
//             {0, -1, 0, 0}
//         };
//         int size = maze.length;
//         int result = countPaths(maze, size);
//         System.out.println("Number of paths: " + result);
//     }
// }

import java.util.*;

class ratinmaze {
    public static boolean isSafe(int[][] maze, int x, int y, int[][] vist) {
        return (x >= 0 && x < maze.length && y >= 0 && y < maze[0].length && vist[x][y] == 0 && maze[x][y] == 0);
    }

    public static int helper(int[][] maze, int x, int y, int[][] vist, int size) {
        if (x == size - 1 && y == size - 1) {
            return 1;
        }

        vist[x][y] = 1;

        int[] rowNum = { 1, 0 }; // Down, Right
        int[] colNum = { 0, 1 }; // Down, Right

        int count = 0;
        for (int i = 0; i < 2; i++) {
            int sr = x + rowNum[i];
            int sc = y + colNum[i];
            if (isSafe(maze, sr, sc, vist)) {
                count += helper(maze, sr, sc, vist, size);
            }
        }

        vist[x][y] = 0; // Backtrack
        return count;
    }

    public static int solveMaze(int maze[][], int size) {
        if (maze[0][0] == -1) {
            return 0;
        }

        int[][] vist = new int[size][size];
        for (int i = 0; i < size; i++) {
            Arrays.fill(vist[i], 0);
        }

        return helper(maze, 0, 0, vist, size);
    }

    public static void main(String[] args) {
        int[][] maze = { { 0, 0, -1, 0 }, { 0, -1, 0, 0 }, { 0, 0, 0, -1 }, { 0, -1, 0, 0 } };
        int size = maze.length;
        int result = solveMaze(maze, size);
        System.out.println("Number of paths: " + result);
    }
}

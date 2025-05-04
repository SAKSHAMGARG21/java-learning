

import java.util.Scanner;

public class WordCountInBoard {
    // Directions arrays for exploring neighbors (up, down, left, right)
    private static final int[] rowDir = {-1, 1, 0, 0};
    private static final int[] colDir = {0, 0, -1, 1};

    public static int countWordInBoard(char[][] board, int m, int n, String word) {
        int count = 0;
        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    count += dfs(board, visited, word, 0, i, j, m, n);
                }
            }
        }
        return count;
    }

    private static int dfs(char[][] board, boolean[][] visited, String word, int index, int row, int col, int m, int n) {
        if (index == word.length()) {
            return 1;
        }

        if (row < 0 || row >= m || col < 0 || col >= n || board[row][col] != word.charAt(index) || visited[row][col]) {
            return 0;
        }

        visited[row][col] = true;
        int count = 0;

        for (int dir = 0; dir < 4; dir++) {
            int newRow = row + rowDir[dir];
            int newCol = col + colDir[dir];
            count += dfs(board, visited, word, index + 1, newRow, newCol, m, n);
        }

        visited[row][col] = false;
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();  // Consume newline

        char[][] board = new char[m][n];
        for (int i = 0; i < m; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < n; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        String word = sc.nextLine();
        int result = countWordInBoard(board, m, n, word);
        System.out.println(result);

        sc.close();
    }
}


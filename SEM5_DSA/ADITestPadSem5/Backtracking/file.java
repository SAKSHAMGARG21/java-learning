// Do not change the class name
// Do not change the class name
class Result {
    static boolean isSafe(char board[][], boolean[][] vist, String word, int idx, int m, int n, int x, int y) {
        return (x >= 0 && x < m && y >= 0 && y < n && idx < word.length() && board[x][y] == word.charAt(idx)
                && !vist[x][y]);
    }

    static int dfs(char[][] board, boolean[][]k vist, String word, int idx, int r, int c, int m, int n) {
        if (idx == word.length() - 1) {
            return 1;
        }
        int cnt = 0;
        int[] row = { -1, 0, 1, 0 };
        int[] col = { 0, 1, 0, -1 };
        vist[r][c] = true;
        for (int i = 0; i < 4; i++) {
            int nrow = r + row[i];
            int ncol = c + col[i];
            if (isSafe(board, vist, word, idx + 1, m, n, nrow, ncol)) {
                cnt += dfs(board, vist, word, idx + 1, nrow, ncol, m, n);
            }
        }
        vist[r][c] = false;
        return cnt;
    }

    static int countWord(char board[][], String word, int m, int n) {
        // Write your code here
        int cnt = 0;
        boolean[][] vist = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    cnt += dfs(board, vist, word, 0, i, j, m, n);
                }
            }
        }
        return cnt;
    }
}

// Do not change the class name
class Result {
    static boolean isSafe(char board[][], boolean[][] vist, String word, int idx, int m, int n, int x, int y) {
        return (x >= 0 && x < m && y >= 0 && y < n && idx < word.length() && board[x][y] == word.charAt(idx)
                && !vist[x][y]);
    }

    static int dfs(char[][] board, boolean[][] vist, String word, int idx, int r, int c, int m, int n) {
        // Check if the entire word is matched
        if (idx == word.length() - 1) {
            return 1; // Count the occurrence when the entire word is matched
        }

        int cnt = 0;
        int[] row = { -1, 0, 1, 0 }; // Directions for moving up, right, down, left
        int[] col = { 0, 1, 0, -1 };

        vist[r][c] = true; // Mark the current cell as visited

        // Explore all four possible directions
        for (int i = 0; i < 4; i++) {
            int nrow = r + row[i];
            int ncol = c + col[i];
            if (isSafe(board, vist, word, idx + 1, m, n, nrow, ncol)) {
                cnt += dfs(board, vist, word, idx + 1, nrow, ncol, m, n); // Recur for the next character
            }
        }

        vist[r][c] = false; // Backtrack: unmark the current cell
        return cnt; // Return the count of occurrences found
    }

    static int countWord(char board[][], String word, int m, int n) {
        int cnt = 0; // Initialize count of occurrences
        boolean[][] vist = new boolean[m][n]; // Visited array

        // Iterate through each cell in the board
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If the current cell matches the first character of the word
                if (board[i][j] == word.charAt(0)) {
                    cnt += dfs(board, vist, word, 0, i, j, m, n); // Start DFS from this cell
                }
            }
        }

        return cnt; // Return the total count of occurrences
    }
}
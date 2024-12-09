import java.util.*;

class Solution {
    public static boolean isSafe(int row, int col, char[][] board) {

        // row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == 'Q') {
                return false;
            }
        }

        // col
        for (int i = 0; i < board[0].length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // upper left
        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // upper right
        r = row;
        for (int c = col; c < board[0].length && r >= 0; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // lower left
        r = row;
        for (int c = col; r < board.length && c >= 0; c--, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // lower right
        r = row;
        for (int c = col; c < board[0].length && r < board.length; c++, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void saveBoard(char[][] board, List<List<String>> allBoards) {
        String row = "";
        List<String> boardlist = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            row = "";
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q') {
                    row += 'Q';
                } else {
                    row += '.';
                }
            }
            boardlist.add(row);
        }

        allBoards.add(boardlist);
    }

    public static void helper(int col, int n, char[][] board, List<List<String>> allBoards) {
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (isSafe(i, col, board)) {
                board[i][col] = 'Q';
                helper(col + 1, n, board, allBoards);
                board[i][col] = '.';
            }
        }

    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(0, n, board, allBoards);
        return allBoards;
    }
}

public class nqueen {
    public static void main(String[] args) {
        int n = 2;
        Solution solution = new Solution();
        List<List<String>> result = solution.solveNQueens(n);
        System.out.println(result);
    }
}

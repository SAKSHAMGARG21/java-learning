
class Result {
    static boolean isSafe(int[][] mat, int row, int col, int num) {
        for (int i = 0; i < 9; i++) {
            if (mat[row][i] == num || mat[i][col] == num) {
                return false;
            }
        }

        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (mat[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean helper(int[][] mat, int row, int col) {
        if (row == 9) {
            return true;
        }

        int nextRow = (col == 8) ? row + 1 : row;
        int nextCol = (col == 8) ? 0 : col + 1;

        if (mat[row][col] != 0) {
            return helper(mat, nextRow, nextCol);
        } else {
            for (int num = 1; num <= 9; num++) {
                if (isSafe(mat, row, col, num)) {
                    mat[row][col] = num;
                    if (helper(mat, nextRow, nextCol)) {
                        return true;
                    }
                    mat[row][col] = 0; // backtrack
                }
            }
        }
        return false;
    }

    static boolean solveSudoku(int[][] mat) {
        return helper(mat, 0, 0);
    }

    // Helper method to print the solved Sudoku board
    static void printBoard(int[][] mat) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class sudoko {
    public static void main(String[] args) {
        int[][] mat = { { 5, 3, 0, 0, 7, 0, 0, 0, 0 }, { 6, 0, 0, 1, 9, 5, 0, 0, 0 }, { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 }, { 4, 0, 0, 8, 0, 3, 0, 0, 1 }, { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 }, { 0, 0, 0, 4, 1, 9, 0, 0, 5 }, { 0, 0, 0, 0, 8, 0, 0, 7, 9 } };

        if (Result.solveSudoku(mat)) {
            System.out.println("Sudoku solved successfully!");
            Result.printBoard(mat);
        } else {
            System.out.println("No solution exists for the given Sudoku puzzle.");
        }
    }
}

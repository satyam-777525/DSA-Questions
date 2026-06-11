
class Solution {
    public int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        int count=solve(board, 0);
        return count;
    }

    int solve(boolean[][] board, int row) {
        if (row == board.length) {
            return 1;
        }
        int count=0;

        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count+=solve(board, row + 1 );
                board[row][col] = false; // backtrack
            }
        }
        return count;
    }

    boolean isSafe(boolean[][] board, int row, int col) {
        // check vertical
        for (int i = 0; i < row; i++) {
            if (board[i][col]) return false;
        }

        // check top-left diagonal
        for (int i = 1; i <= Math.min(row, col); i++) {
            if (board[row - i][col - i]) return false;
        }

        // check top-right diagonal
        for (int i = 1; i <= Math.min(row, board.length - col - 1); i++) {
            if (board[row - i][col + i]) return false;
        }

        return true;
    }

    
}

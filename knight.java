public class knight {

    public static boolean isvalidmove(char[][] board, int row, int col) {
        int n = board.length;
        if (row >= 0 && row < n && col >= 0 && col < n && board[row][col] == 'X') {
            return true;
        } else {
            return false;
        }
    }

    public static void knightmoves(char[][] board, int row, int col, int count) {
        if (count == board.length * board.length) {
            printboard(board);
            return;
        }
        int[] dx = { -2, -1, 1, 2, 2, 1, -1, -2 };
        int[] dy = { 1, 2, 2, 1, -1, -2, -2, -1 };
        for (int i = 0; i < 8; i++) {
            int newrow = row + dx[i];
            int newcol = col + dy[i];
            if (isvalidmove(board, newrow, newcol)) {
                board[newrow][newcol] = 'K';
                knightmoves(board, newrow, newcol, count + 1);
                board[newrow][newcol] = 'X';
            }
        }
    }

    public static void printboard(char[][] board) {
        System.out.println("_____chessBoard______");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        board[0][0] = 'K';
        knightmoves(board, 0, 0, 1);
    }

}

public class sudoko {

    public static boolean issafe(int[][] sudoko, int row, int col, int digit) {
        for (int i = 0; i <= 8; i++) {
            if (sudoko[i][col] == digit) {
                return false;
            }
        }

        for (int j = 0; j <= 8; j++) {
            if (sudoko[row][j] == digit) {
                return false;
            }
        }
        // grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoko[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sudokoSolver(int sudoko[][], int row, int col) {
        if (row == 9 && col == 0) {
            return true;
        }

        // recursion
        int nextrow = row;
        int nextcol = col + 1;
        if (col + 1 == 9) {
            nextrow = row + 1;
            nextcol = 0;
        }
        if (sudoko[row][col] != 0) {
            return sudokoSolver(sudoko, nextrow, nextcol);
        }

        for (int digit = 1; digit <= 9; digit++) {

            if (issafe(sudoko, row, col, digit)) {
                sudoko[row][col] = digit;
                if (sudokoSolver(sudoko, nextrow, nextcol)) {
                    return true;
                }
            }
            sudoko[row][col] = 0;
        }
        return false;
    }

    public static void printsudko(int[][] sudoko) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoko[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int sudoko[][] = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

        if (sudokoSolver(sudoko, 0, 0)) {
            System.out.println("Solution exists");
            printsudko(sudoko);
        } else {
            System.out.println("Solution not exists");
        }
    }
}

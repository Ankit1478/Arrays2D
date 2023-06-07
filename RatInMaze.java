public class RatInMaze {
    public static boolean issafe(int[][] maze, int x, int y) {
        return (x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] == 1);
    }

    public static boolean solvemazeUtil(int[][] maze, int x, int y, int[][] sol) {
        if (x == maze.length - 1 && y == maze.length - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }
        if (issafe(maze, x, y) && sol[x][y] == 0) {
            sol[x][y] = 1;
            // This condition checks whether the current cell is safe to move to and has not
            // been visited before.
            // So, if the current cell is safe to move to and has not been visited before,
            // we mark it as visited by setting sol[x][y] = 1.
            if (solvemazeUtil(maze, x + 1, y, sol) || solvemazeUtil(maze, x, y + 1, sol)) {
                return true;
            }
            sol[x][y] = 0;
            return false;
        }

        return false;
    }

    public static void printmaze(int maze[][]) {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean solvemaze(int maze[][]) {
        int n = maze.length;
        int sol[][] = new int[n][n];
        if (solvemazeUtil(maze, 0, 0, sol) == false) {
            return false;
        }
        printmaze(sol);
        System.out.println("Solution exists");
        return true;
    }

    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 0, 1, 0, 1 }, { 0, 1, 1, 1 } };
        solvemaze(maze);
    }

}

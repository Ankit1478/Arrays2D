public class stairCase {
    public static boolean staircase(int matrix[][], int key) {
        int row = 0;
        int column = matrix[0].length - 1;
        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] == key) {
                System.out.println("key found at (" + row + "," + column + ")");
                return true;
            } else if (key < matrix[row][column]) {
                column--;
            } else {
                row++;
            }
        }
        System.out.println("key not found ");
        return false;
    }

    public static boolean staircase2(int matrix[][], int key) {
        int row = matrix.length - 1;
        int column = 0;
        while (row >= 0 && column < matrix[0].length) {
            if (matrix[row][column] == key) {
                System.out.println("key found at (" + row + "," + column + ")");
                return true;
            } else if (key > matrix[row][column]) {
                column++;
            } else {
                row--;
            }
        }
        System.out.println("key not found ");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        System.out.println(staircase(matrix, 11));
    }
}

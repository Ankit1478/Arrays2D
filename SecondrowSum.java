public class SecondrowSum {
    // second Row sum
    public static int secondsum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix[1].length; i++) {
            sum = sum + matrix[1][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        System.out.println(secondsum(sum));
    }

}

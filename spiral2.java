import java.util.ArrayList;
import java.util.List;

public class spiral2 {
    public static List<Integer> spiral(int matrix[][]) {
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length - 1;
        int endcol = matrix[0].length - 1;

        List<Integer> result = new ArrayList<>();
        while (startrow <= endrow && startcol <= endcol) {
            // right ->
            for (int i = startcol; i <= endcol; i++) {
                result.add(matrix[startrow][i]);
            }
            // bottom
            for (int i = startrow + 1; i <= endrow; i++) {
                result.add(matrix[i][endcol]);
            }
            for (int i = endcol - 1; i >= startcol; i--) {
                if (startrow == endrow) {
                    break;
                }
                result.add(matrix[endrow][i]);
            }
            for (int i = endrow - 1; i >= startrow + 1; i--) {
                if (startcol == endcol) {
                    break;
                }
                result.add(matrix[i][startcol]);
            }
            startrow++;
            endrow--;
            startcol++;
            endcol--;

        }
        return result;

    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        System.out.println(spiral(matrix));
    }
}

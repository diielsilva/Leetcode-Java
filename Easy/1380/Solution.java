import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> lucky = new ArrayList<>();

        for (int a = 0; a < matrix.length; a++) {
            int minimum = matrix[a][0];
            int maximum = matrix[a][0];
            int pos = 0;

            for (int b = 1; b < matrix[a].length; b++) {

                if (matrix[a][b] < minimum) {
                    minimum = matrix[a][b];
                    maximum = minimum;
                    pos = b;
                }

            }

            for (int c = 0; c < matrix.length; c++) {

                if (matrix[c][pos] > maximum) {
                    maximum = matrix[c][pos];
                }

            }

            if (minimum == maximum) {
                lucky.add(minimum);
            }

        }

        return lucky;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 10, 4, 2 },
                { 9, 3, 8, 7 },
                { 15, 16, 17, 12 }
        };
        Solution solution = new Solution();
        System.out.println(solution.luckyNumbers(matrix));
    }

}
public class Solution {

    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int end = mat.length;

        for (int i = 0; i < mat.length; i++) {
            end--;
            sum += mat[i][i];
            if (i != end) {
                sum += mat[i][end];
            }
        }

        return sum;
    }

}
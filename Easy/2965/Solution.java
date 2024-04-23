import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] findMissingAndRepeatedValues(int[][] grid) {
        List<Integer> aux = new ArrayList<>();
        int maximum = 0;
        int[] answer = { 0, 0 };

        for (int a = 0; a < grid.length; a++) {

            for (int b = 0; b < grid[a].length; b++) {

                boolean isMissing = true;

                if (grid[a][b] > maximum) {
                    maximum = grid[a][b];
                }

                for (int c = 0; c < aux.size(); c++) {

                    if (grid[a][b] == aux.get(c)) {
                        isMissing = false;
                        answer[0] = grid[a][b];
                        break;
                    }

                }

                if (isMissing) {
                    aux.add(grid[a][b]);
                }

            }
        }

        for (int a = maximum - 1; a >= 1; a--) {
            boolean contains = aux.contains(a);

            if (!contains) {
                answer[1] = a;
                break;
            }

        }

        if (answer[1] == 0) {
            answer[1] = maximum + 1;
        }

        return answer;
    }

}
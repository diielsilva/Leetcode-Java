import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int deleteGreatestValue(int[][] grid) {
        int result = 0;
        int current = 1;
        int total = grid.length * grid[0].length;

        while (current <= total) {
            List<Integer> biggestsFromEachRows = new ArrayList<>();

            for (int i = 0; i < grid.length; i++) {
                int biggestFromRow = 0;
                int pos = 0;

                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] > 0 && grid[i][j] > biggestFromRow) {
                        biggestFromRow = grid[i][j];
                        pos = j;
                    }

                }

                grid[i][pos] = -1;
                biggestsFromEachRows.add(biggestFromRow);

            }

            int aux = 0;
            for (int i : biggestsFromEachRows) {
                if (i > aux) {
                    aux = i;
                }
            }

            result += aux;
            current++;
        }

        return result;
    }
}
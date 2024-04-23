import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] kWeakestRows(int[][] mat, int k) {
        List<Integer> strengths = new ArrayList<>();
        int[] result = new int[k];

        for (int a = 0; a < mat.length; a++) {
            int strength = 0;

            for (int b = 0; b < mat[a].length; b++) {

                if (mat[a][b] == 1) {
                    strength++;
                }

            }

            strengths.add(strength);
        }

        for (int a = 0; a < k; a++) {
            int strength = 999;
            int pos = 0;

            for (int b = 0; b < strengths.size(); b++) {

                if (strengths.get(b) >= 0 && strengths.get(b) < strength) {
                    strength = strengths.get(b);
                    pos = b;
                }

            }

            result[a] = pos;
            strengths.set(pos, -1);

        }

        return result;
    }
}

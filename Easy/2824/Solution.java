
import java.util.List;

public class Solution {

    public int countPairs(List<Integer> nums, int target) {
        int ans = 0;

        for (int a = 0; a < nums.size(); a++) {

            for (int b = a + 1; b < nums.size(); b++) {
                if (nums.get(a) + nums.get(b) < target) {
                    ans++;
                }
            }

        }

        return ans;
    }

}

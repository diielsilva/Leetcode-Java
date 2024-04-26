import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        List<Integer> res = new ArrayList<>();

        for (int a = 0; a < nums.length; a++) {
            if (a < n) {
                x.add(nums[a]);
            } else {
                y.add(nums[a]);
            }
        }

        for (int a = 0; a < x.size(); a++) {
            res.add(x.get(a));
            res.add(y.get(a));
        }

        for (int a = 0; a < res.size(); a++) {
            ans[a] = res.get(a);
        }

        return ans;
    }

}
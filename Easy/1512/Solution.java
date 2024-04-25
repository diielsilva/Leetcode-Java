public class Solution {

    public int numIdenticalPairs(int[] nums) {
        int ans = 0;

        for (int a = 0; a < nums.length; a++) {

            for (int b = a + 1; b < nums.length; b++) {
                if (nums[a] == nums[b]) {
                    ans++;
                }
            }

        }

        return ans;
    }

}

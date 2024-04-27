
public class Solution {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];

        for (int a = 0; a < nums.length; a++) {

            int amount = 0;

            for (int b = a + 1; b < nums.length; b++) {
                if (nums[a] > nums[b]) {
                    amount++;
                }
            }

            for (int c = a - 1; c >= 0; c--) {
                if (nums[a] > nums[c]) {
                    amount++;
                }
            }

            ans[a] = amount;

        }

        return ans;
    }

}

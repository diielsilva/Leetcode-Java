public class Solution {

    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int a = 0; a < ans.length; a++) {
            int aux = nums[a];
            ans[a] = nums[aux];
        }

        return ans;
    }

}
public class Solution {

    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int aux = 0;

        for (int a = 0; a < ans.length; a++) {

            if (aux == nums.length) {
                aux = 0;
            }

            ans[a] = nums[aux];
            aux++;

        }

        return ans;
    }

}


public class Solution {

    public int findMax(int[] nums) {
        int ans = -1;
        int max = 0;

        for (int a = 0; a < nums.length; a++) {

            if (nums[a] > max) {

                int aux = nums[a] * -1;
                boolean contains = false;

                for (int b = 0; b < nums.length; b++) {

                    if (nums[b] == aux) {
                        contains = true;
                        break;
                    }

                }

                if (contains) {
                    max = nums[a];
                }

            }

        }

        return max == 0 ? ans : max;
    }

}

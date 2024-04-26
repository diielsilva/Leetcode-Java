public class Solution {

    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int ans = 0;

        for (int a = 0; a < hours.length; a++) {

            if (hours[a] >= target) {
                ans++;
            }

        }

        return ans;
    }

}

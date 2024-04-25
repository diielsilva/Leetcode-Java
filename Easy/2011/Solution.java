public class Solution {

    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;

        for (int a = 0; a < operations.length; a++) {

            if (operations[a].equals("++X") || operations[a].equals("X++")) {
                ans++;
            } else {
                ans--;
            }

        }

        return ans;
    }
}
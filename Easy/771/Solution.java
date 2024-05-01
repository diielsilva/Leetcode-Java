
public class Solution {

    public int numJewelsInStones(String jewels, String stones) {
        int ans = 0;

        for (char stone : stones.toCharArray()) {

            for (char jewel : jewels.toCharArray()) {
                if (stone == jewel) {
                    ans++;
                    break;
                }
            }

        }

        return ans;
    }

}

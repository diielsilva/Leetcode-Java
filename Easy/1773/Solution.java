
import java.util.List;

public class Solution {

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;
        int index = switch (ruleKey) {
            case "type" ->
                0;
            case "color" ->
                1;
            case "name" ->
                2;
            default ->
                -1;
        };

        for (int a = 0; a < items.size(); a++) {

            if (items.get(a).get(index).equals(ruleValue)) {
                ans++;
            }

        }

        return ans;
    }

}

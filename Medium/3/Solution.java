
import java.util.HashMap;
import java.util.Map;

class Solution {

    public int lengthOfLongestSubstring(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            Map<Character, Boolean> map = new HashMap<>();

            map.put(s.charAt(i), true);

            for (int j = i + 1; j < s.length(); j++) {

                if (!map.containsKey(s.charAt(j))) {
                    map.put(s.charAt(j), true);
                } else {

                    if (map.size() > answer) {
                        answer = map.size();
                    }

                    break;

                }

            }

            if (map.size() > answer) {
                answer = map.size();
            }

        }

        return answer;

    }

}

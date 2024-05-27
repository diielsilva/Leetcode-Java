
import java.util.HashMap;
import java.util.Map;

class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map01 = new HashMap<>();
        Map<Character, Integer> map02 = new HashMap<>();

        for (Character character : s.toCharArray()) {
            Integer value = map01.get(character);
            if (value == null) {
                map01.put(character, 1);
            } else {
                map01.replace(character, value + 1);
            }
        }

        for (Character character : t.toCharArray()) {
            Integer value = map02.get(character);
            if (value == null) {
                map02.put(character, 1);
            } else {
                map02.replace(character, value + 1);
            }
        }

        for (Character index : map01.keySet()) {
            Integer value1 = map01.get(index);
            Integer value2 = map02.get(index);

            if (!value1.equals(value2)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        var solution = new Solution();
        System.out.println(solution.isAnagram("rat", "car"));
    }
}

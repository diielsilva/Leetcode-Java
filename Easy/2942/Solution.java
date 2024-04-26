import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();

        for (int a = 0; a < words.length; a++) {
            String word = words[a];

            for (int b = 0; b < word.length(); b++) {
                if (word.charAt(b) == x) {
                    ans.add(a);
                    break;
                }
            }
        }

        return ans;
    }
}
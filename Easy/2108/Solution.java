
public class Solution {

    public String firstPalindrome(String[] words) {

        for (String word : words) {

            StringBuilder builder = new StringBuilder();

            for (int a = word.length() - 1; a >= 0; a--) {
                builder.append(word.charAt(a));
            }

            if (builder.toString().equals(word)) {
                return word;
            }

        }

        return "";
    }

}

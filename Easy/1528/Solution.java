
public class Solution {

    public String restoreString(String s, int[] indices) {
        StringBuilder builder = new StringBuilder();
        char[] ans = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {

            ans[indices[i]] = s.charAt(i);

        }

        for (char ch : ans) {
            builder.append(ch);
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.err.println(s1.restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}));
    }

}

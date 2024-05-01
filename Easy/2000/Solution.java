

public class Solution {

    public String reversePrefix(String word, char ch) {
        String[] ans = word.split("");
        int index = -1;

        for (int a = 0; a < ans.length; a++) {

            if (ans[a].charAt(0) == ch) {
                index = a;
                break;
            }

        }

        if (index == -1) {
            return word;
        }

        int start = 0;

        while (start < index) {
            String aux = ans[start];
            ans[start] = ans[index];
            ans[index] = aux;
            start++;
            index--;
        }

        return String.join("", ans);
    }

}

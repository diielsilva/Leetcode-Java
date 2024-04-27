
public class Solution {

    public int mostWordsFound(String[] sentences) {
        int ans = 0;

        for (String sentence : sentences) {
            int aux = 0;

            for (int b = 0; b < sentence.length(); b++) {
                if (sentence.charAt(b) == ' ') {
                    aux++;
                }
            }

            if (aux > ans) {
                ans = aux;
            }

        }

        return ans + 1;
    }

}

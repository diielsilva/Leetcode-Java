
public class Solution {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder builderW1 = new StringBuilder();
        StringBuilder builderW2 = new StringBuilder();

        for (String word : word1) {
            builderW1.append(word);
        }

        for (String word : word2) {
            builderW2.append(word);
        }

        return builderW1.toString().equals(builderW2.toString());
    }

}

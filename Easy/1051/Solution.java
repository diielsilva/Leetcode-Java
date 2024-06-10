
class Solution {

    public int heightChecker(int[] heights) {
        int answer = 0;
        int[] expected = heights.clone();

        for (int i = 0; i < expected.length; i++) {
            for (int j = 0; j < expected.length - 1; j++) {
                if (expected[j] > expected[j + 1]) {
                    int aux = expected[j];
                    expected[j] = expected[j + 1];
                    expected[j + 1] = aux;
                }

            }

        }

        for (int i = 0; i < expected.length; i++) {
            if (heights[i] != expected[i]) {
                answer++;
            }
        }

        return answer;
    }
}

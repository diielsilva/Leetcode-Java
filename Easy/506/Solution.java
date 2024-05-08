
class Solution {

    public String[] findRelativeRanks(int[] score) {
        int[] temp = score.clone();
        String[] ans = new String[score.length];

        for (int i = 0; i < score.length; i++) {

            for (int j = 0; j < score.length - 1; j++) {
                if (score[j] < score[j + 1]) {
                    int aux = score[j + 1];
                    score[j + 1] = score[j];
                    score[j] = aux;
                }
            }

        }

        for (int i = 0; i < temp.length; i++) {

            int index = 0;

            for (int j = 0; j < score.length; j++) {

                if (temp[i] == score[j]) {
                    index = j;
                    break;
                }

            }

            switch (index) {
                case 0:
                    ans[i] = "Gold Medal";
                    break;
                case 1:
                    ans[i] = "Silver Medal";
                    break;
                case 2:
                    ans[i] = "Bronze Medal";
                    break;
                default:
                    ans[i] = String.valueOf(index + 1);
                    break;
            }

        }

        return ans;
    }
}

class Solution {

    public String[] sortPeople(String[] names, int[] heights) {
        int aux = 0;
        String[] answer = new String[names.length];

        for(int i = 0; i < heights.length; i++) {
            int pos = 0;
            int biggest = heights[0];

            for(int j = 0; j < heights.length; j++) {
                if(heights[j] > biggest) {
                    biggest = heights[j];
                    pos = j;
                }
            }

            answer[aux] = names[pos];
            aux++;
            heights[pos] = -1;
        }

        return answer;
    }

}
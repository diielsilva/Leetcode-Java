class Solution {

    public int numWaterBottles(int numBottles, int numExchange) {
        int emptyBottles = numBottles;
        
        while(emptyBottles >= numExchange) {
            emptyBottles -= numExchange;
            numBottles++;
            emptyBottles++;
        }

        return numBottles;
    }

}
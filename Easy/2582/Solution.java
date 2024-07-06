
public class Solution {

    public int passThePillow(int n, int time) {
        int pos = 1;
        int pass = 1;

        while (time > 0) {
            if (pass == 1) {

                if (pos == n) {
                    pass = 0;
                    pos--;
                } else {
                    pos++;
                }

            } else {

                if (pos == 1) {
                    pass = 1;
                    pos++;
                } else {
                    pos--;
                }

            }

            time--;
        }

        return pos;
    }

}

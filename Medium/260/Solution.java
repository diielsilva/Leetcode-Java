
import java.util.HashMap;
import java.util.Map;

class Solution {

    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        int[] answer = new int[2];

        for (int num : nums) {

            if (map.containsKey(num)) {
                int temp = map.get(num);
                map.replace(num, temp + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (int key : map.keySet()) {
            int num = map.get(key);

            if (num == 1) {
                answer[index] = key;
                index++;

                if (index > 1) {
                    break;
                }

            }
        }

        return answer;
    }

}

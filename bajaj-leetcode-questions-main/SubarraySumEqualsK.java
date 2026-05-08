import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        count.put(0, 1);

        int sum = 0;
        int answer = 0;

        for (int num : nums) {
            sum += num;
            answer += count.getOrDefault(sum - k, 0);
            count.put(sum, count.getOrDefault(sum, 0) + 1);
        }

        return answer;
    }
}

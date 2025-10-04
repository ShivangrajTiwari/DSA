package DSA;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            int secno= target - nums[i];

            if(map.containsKey(secno)){
                return new int[]{map.get(secno), i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};

    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 13;

        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + Arrays.toString(result));
    }
}

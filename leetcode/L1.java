import java.util.*;

class L1 {

    public static void main(String[] args) {
        twoSum(new int[] {2, 7, 11, 15}, 13);
    }

    public static int[] twoSum(int[] nums, int target) {
        
        for(int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println(i + " " + j);
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

    public static int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> record = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (record.containsKey(nums[i])) {
                System.out.println(i + " " + record.get(nums[i]));
                return new int[] {i, record.get(nums[i])};
            }
            record.put(target - nums[i], i);
            
        }
        
        return null;
    }
}
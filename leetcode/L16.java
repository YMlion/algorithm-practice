import java.util.Arrays;

public class L16 {
    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[] { -1, 2, 1, -4 }, 1));
    }// -4 -1 1 2

    public static int threeSumClosest(int[] nums, int target) {
        int sum = 0;
        if (nums == null) {
            return sum;
        }
        if (nums.length < 3) {
            for (int num : nums) {
                sum += num;
            }
            return sum;
        }
        int dis = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int e = nums.length - 1;
            while (j < e) {
                int sumTmp = nums[i] + nums[j] + nums[e];
                int d = Math.abs(target - sumTmp);
                if (d == 0) {
                    return sumTmp;
                } else if (d < dis) {
                    dis = d;
                    sum = sumTmp;
                }
                if (sumTmp > target) {
                    e--;
                } else {
                    j++;
                }
            }
        }
        return sum;
    }
}
public class L45 {
    public static void main(String[] args) {
        System.out.println(jump(new int[] { 2, 1, 1, 1, 1 }));
    }

    public static int jump(int[] nums) {
        int step = 0;
        if (nums.length == 1) {
            return 0;
        }
        if (nums[0] >= nums.length - 1) return 1;

        for (int i = 0; i < nums.length - 2; i++) {
            int max = i + 1;
            for (int j = i + 1; j <=  i + nums[i]; j++) {
                int t = nums[j] + j;
                if (t >= nums.length - 1) {
                    return step + 2;
                }
                if (t >= nums[max] + max) {
                    max = j;
                }
            }
            i = max - 1;
            step++;
        }

        return step;
    }
}
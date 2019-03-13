public class L41 {
    public static void main(String[] args) {
        int r = firstMissingPositive(new int[] { 3, 4, -1, 1 });
        System.out.println("result is : " + r);
    }

    public static int firstMissingPositive(int[] nums) {
        int l = nums.length;
        if (l == 0) {
            return 1;
        }
        for (int i = 0; i < l; i++) {
            if (nums[i] > 0 && nums[i] < l && nums[i] != nums[nums[i]]) {
                int t = nums[i];
                nums[i] = nums[t];
                nums[t] = t;
                System.out.println(". " + nums[i] + " " + nums[t]);
                i--;
            }
            System.out.println("i " + i);
        }
        for (int i = 1; i < l; i++) {
            System.out.println("  " + nums[i]);
            if (nums[i] != i) {
                return i;
            }
        }
        if (nums[0] == l) {
            return l + 1;
        }
        return l;
    }
}
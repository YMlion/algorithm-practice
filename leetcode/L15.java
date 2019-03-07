import java.util.*;

public class L15 {
    public static void main(String[] args) {
        System.out.println("result is : ");
        List<List<Integer>> s = threeSum(new int[] { -2, 0, 1, 1, 2 });
        for (int i = 0; i < s.size(); i++) {
            System.out.println("\n" + i + ": ");
            for (int j = 0; j < s.get(i).size(); j++) {
                System.out.print(s.get(i).get(j) + "\t");
            }
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> s = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return s;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2;) {
            int j = i + 1;
            int e = nums.length - 1;
            while (j < e) {
                int r = nums[i] + nums[j] + nums[e];
                if (r == 0) {
                    List<Integer> item = new ArrayList<>();
                    item.add(nums[i]);
                    item.add(nums[j]);
                    item.add(nums[e]);
                    s.add(item);
                    while (j < e && nums[j] == nums[++j]);
                    while (j < e && nums[e] == nums[--e]);

                } else if (r > 0) {
                    e--;
                } else {

                    j++;
                }
            }
            do
                i++;
            while (i < nums.length - 2 && nums[i] == nums[i - 1]);
        }

        return s;
    }
}
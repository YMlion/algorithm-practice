import java.util.*;

public class L47 {
    public static void main(String[] args) {
        permute(new int[] { 1, 1, 2 });
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        permute(list, nums, 0, nums.length - 1);
        return list;
    }

    public static void permute(List<List<Integer>> list, int[] nums, int s, int e) {
        if (s == e) {
            List<Integer> item = new ArrayList<>();
            for (int i : nums) {
                item.add(i);
                System.out.print(i + "\t");
            }
            System.out.println();
            list.add(item);
        }

        for (int i = s; i <= e; i++) {
            if (find(nums, s, i)) {
                continue;
            }
            swap(nums, s, i);
            permute(list, nums, s + 1, e);
            swap(nums, s, i);
        }

    }

    public static boolean find(int[] nums, int s, int p) {
        for (int i = s; i < p; i++) {
            if (nums[i] == nums[p]) {
                return true;
            }
        }
        return false;
    }

    public static void swap(int nums[], int s, int e) {
        int t = nums[s];
        nums[s] = nums[e];
        nums[e] = t;
    }
}
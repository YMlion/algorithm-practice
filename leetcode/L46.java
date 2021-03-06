import java.util.*;
public class L46 {
    public static void main(String[] args) {
        permute(new int[] {1,2,3});
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        permute(list, nums, 0, nums.length - 1);
        return list;
    }

    public static void permute(List<List<Integer>> list, int[] nums, int s, int e) {
        if (s == e) {
            List<Integer> item = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                item.add(nums[i]);
                System.out.print(nums[i] + "\t");
            }
            System.out.println();
            list.add(item);
        }

        for (int i = s; i <= e; i++) {
            swap(nums, s, i);
            permute(list, nums, s + 1, e);
            swap(nums, s, i);
        }
        
    }

    public static void swap(int nums[], int s, int e) {
        int t = nums[s];
        nums[s] = nums[e];
        nums[e] = t;
    }
}
class L26 {
    public static void main(String[] args) {
        removeDuplicates(new int[] { 1, 1, 1, 2, 3, 4, 5, 5, 6, 7, 7, 8, 9, 9 });
    }

    public static int removeDuplicates(int[] nums) {
        int s = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[s++] = nums[i];
            }
        }
        
        return s;
    }
}
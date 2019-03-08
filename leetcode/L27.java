class L27 {
    public static void main(String[] args) {
        removeElement(new int[] { 1, 1, 1, 2, 3, 4, 5, 5, 6, 7, 7, 8, 9, 9 }, 5);
    }

    public static int removeElement(int[] nums, int val) {
        int s = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[s++] = nums[i];
            }
        }

        return s;
    }
}
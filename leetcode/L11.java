public class L11 {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));
    }

    public static int maxArea(int[] height) {
        int s = 0, e = height.length - 1;
        int max = 0;
        while(s < e) {
            max = Math.max(max, Math.min(height[s], height[e]) * (e - s));
            if (height[s] < height[e]) {
                s++;
            } else {
                e--;
            }
        }
        return max;
    }
}
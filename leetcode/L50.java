public class L50 {
    public static void main(String[] args) {
        System.out.println(myPow(2.00000, 10));
        System.out.println(myPow(2.10000, 3));
        System.out.println(myPow(2.00000, -2));
    }

    public static double myPow(double x, int n) {
        double r = 1.0;
        for (int i = n; i != 0; i /= 2) {
            if (i % 2 != 0) {
                r *= x;
            }
            x *= x;
        }
        return n > 0 ? r : 1 / r;
    }
}
class L29 {
    public static void main(String[] args) {
        divide(7, -3);
        divide(10, 3);
    }

    public static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        boolean flag = (dividend > 0) ^ (divisor > 0);
        int r = 0;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        while (dividend >= divisor) {
            int tmp = 1;
            int m = divisor;
            while (dividend >= m << 1) {
                m <<= 1;
                tmp <<= 1;
            }
            dividend -= m;
            r += tmp;
        }
        System.out.println(flag ? r : -r);


        

        return flag ? r : -r;
    }
}
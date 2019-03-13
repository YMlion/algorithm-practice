public class L43 {
    public static void main(String[] args) {
        System.out.println(multiply("123", "456"));
    }

    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int[] result = new int[num1.length() + num2.length()];

        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                result[i + j + 1] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
            }
        }

        int c = 0;
        for (int i = result.length - 1; i >= 0; i--) {
            int r = result[i] + c;
            result[i] = r % 10;
            c = r / 10;
        }

        int s = 0;
        while (result[s++] == 0)
            ;
        StringBuilder builder = new StringBuilder();
        for (s = s - 1; s < result.length; s++) {
            builder.append(result[s]);
        }

        return builder.toString();
    }
}
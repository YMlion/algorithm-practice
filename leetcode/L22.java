import java.util.*;

class L22 {
    public static void main(String[] args) {
        List<String> list = generateParenthesis(4);
    }

    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        helper(list, "", n, 0);
        return list;
    }

    public static void helper(List<String> list, String str, int left, int right) {
        if (left == 0 && right == 0) {
            list.add(str);
            System.out.println(str);
            return;
        }
        if (right > 0) {
            helper(list, str + ")", left, right - 1);
        }
        if (left > 0) {
            helper(list, str + "(", --left, ++right);
        }
    }
}
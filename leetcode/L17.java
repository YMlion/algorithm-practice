import java.util.*;

public class L17 {

    private static String[] map = new String[] { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static void main(String[] args) {
        List<String> list = letterCombinations("23");
        for (String s : list) {
            System.out.print(s + "\t");
        }
    }

    public static List<String> letterCombinations(String digits) {
        LinkedList<String> list = new LinkedList<>();
        if (digits.length() == 0) {
            return list;
        }
        list.add("");

        for (int i = 0; i < digits.length(); i++) {
            while (list.getFirst().length() == i) {
                String item = list.removeFirst();
                for (char c : map[digits.charAt(i) - '2'].toCharArray()) {
                    list.add(item + c);
                }
            }
        }

        return list;
    }
}
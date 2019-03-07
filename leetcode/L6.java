import java.util.*;

public class L6 {
    public static void main(String[] args) {
        System.out.println(convert("123456789", 4));
    }

    public static String convert(String s, int numRows) {
        List<StringBuilder> strings = new ArrayList<>();
        int size = Math.min(numRows, s.length());
        for (int i = 0; i < size; i++) {
            strings.add(new StringBuilder());
        }
        int j;
        for (int i = 0; i < s.length();) {
            for (j = 0; j < strings.size() && i < s.length(); i++, j++) {
                strings.get(j).append(s.charAt(i));
            }
            for (j = strings.size() - 2; j > 0 && i < s.length(); i++, j--) {
                strings.get(j).append(s.charAt(i));
            }
        }
        StringBuilder build = new StringBuilder();
        for (StringBuilder b : strings) {
            build.append(b);
        }
        return build.toString();
    }
}
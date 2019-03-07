import java.util.*;

public class L3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabaccbadbcaccb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int start = 0;
        int length = 0;
        HashMap<Character, Integer> cp = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Integer p = cp.get(s.charAt(i));
            if (p != null && p >= start) {
                start = p + 1;
            } else {
                length = Math.max(length, i - start + 1);
            }
            
            cp.put(s.charAt(i), i);
        }

        return length;
    }
}
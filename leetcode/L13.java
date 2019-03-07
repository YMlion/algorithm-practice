import java.util.HashMap;

public class L13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int c = map.get(s.charAt(i));
            if (i < s.length() - 1 && c < map.get(s.charAt(i + 1))) {
                sum-= c;
            } else {
                sum += c;
            }
        }
        return sum;
    }
}
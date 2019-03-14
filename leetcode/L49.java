import java.util.*;

public class L49 {
    public static void main(String[] args) {
        List<List<String>> list = groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" });
        for (List<String> l : list) {
            for (String s : l) {
                System.out.print(s + "\t");
            }
            System.out.println();
        }
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        int p = 0;
        for(String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = String.valueOf(chars);
            if (map.containsKey(sorted)) {
                list.get(map.get(sorted)).add(s);
            } else {
                map.put(sorted, p++);
                List<String> t = new ArrayList<>();
                t.add(s);
                list.add(t);
            }

        }

        return list;
    }
}
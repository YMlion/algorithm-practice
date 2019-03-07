import java.util.LinkedList;

class L20 {
    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
        System.out.println(isValid("([)]"));
    }

    public static boolean isValid(String s) {
        if (s == null || s.length() == 0)
            return true;
        LinkedList<Character> list = new LinkedList<>();
        list.add('#');
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Character last = list.getLast();
            switch (c) {
            case '[':
                list.add(c);
                break;
            case ']':
                if (last == null) {
                    return false;
                }
                if (last == '[') {
                    list.removeLast();
                } else {
                    list.add(c);
                }
                break;
            case '{':
                list.add(c);
                break;
            case '}':
                if (last == null) {
                    return false;
                }
                if (last == '{') {
                    list.removeLast();
                } else {
                    list.add(c);
                }
                break;
            case '(':
                list.add(c);
                break;
            case ')':
                if (last == null) {
                    return false;
                }
                if (last == '(') {
                    list.removeLast();
                } else {
                    list.add(c);
                }
                break;
            case ' ':
                continue;

            default:
                return false;
            }
        }
        return list.size() == 1;
    }
}
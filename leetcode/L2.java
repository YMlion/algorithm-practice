/**
 * L2
 */
public class L2 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        l1.next = l2;
        ListNode l3 = new ListNode(8);
        l2.next = l3;
        ListNode l4 = new ListNode(5);
        l2 = new ListNode(6);
        l4.next = l2;
        l3 = new ListNode(4);
        l2.next = l3;
        ListNode f = addTwoNumbers(l1, l4);
        while (f != null) {
            System.out.print(f.val);
            f = f.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c = 0;
        ListNode r = new ListNode(0);
        ListNode t = r;
        while (l1 != null || l2 != null) {
            int sum = c;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            ListNode tmp = new ListNode(sum % 10);
            c = sum / 10;
            t.next = tmp;
            t = tmp;
        }
        if (c == 1) {
            t.next = new ListNode(1);
        }
        return r.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
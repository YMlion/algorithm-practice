
class L25 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode head = l1;
        for (int i = 2; i < 6; i++) {
            ListNode l2 = new ListNode(i);
            l1.next = l2;
            l1 = l2;
        }
        ListNode h = new L25().reverseKGroup(head, 3);
        while (h != null) {
            System.out.print(h.val + "->");
            h = h.next;
        }

    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode p = new ListNode(0);
        p.next = head;
        ListNode root = p;

        for (int i = 1; head != null; i++) {
            if (i % k == 0) {
                p = reverse(p, head.next);
                head = p.next;
            } else {
                head = head.next;
            }
        }

        return root.next;
    }

    public ListNode reverse(ListNode pre, ListNode next) {
        ListNode head = pre.next;
        ListNode move = head.next;
        while (move != next) {
            head.next = move.next;
            move.next = pre.next;
            pre.next = move;
            move = head.next;
        }

        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
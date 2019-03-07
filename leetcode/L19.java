class L19 {

    public static void main(String[] args) {
        
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode l1 = head, l2 = head;
        while (n > 0) {
            l1 = l1.next;
            n--;
        }
        if (l1 == null) {
            return head.next;
        }
        while (l1.next != null) {
            l1 = l1.next;
            l2 = l2.next;
        }

        l2.next = l2.next.next;

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
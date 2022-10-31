 public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        
        head.next = removeElements(head.next, val);
        if (val == head.val) {
            return head.next;
        }
        return head;
    }
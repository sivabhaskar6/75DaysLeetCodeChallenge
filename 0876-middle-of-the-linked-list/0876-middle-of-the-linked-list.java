class Solution {
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int mid = count / 2;
        temp = head;
        for (int i = 0; i < mid; i++) {
            temp = temp.next;
        }

        return temp; 
    }
}

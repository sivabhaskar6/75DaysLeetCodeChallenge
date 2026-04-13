/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        if(head.next==null)
        {
            return null;
        }
        ListNode temp=head;
        ListNode dummy=head;
        ListNode pre=null;
        int count=0;
        int res=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        count=count-n;
        if(count==0)
        {
            return head.next;
        }
        for(int i=1;i<count;i++)
        {
            dummy=dummy.next;
        }
        dummy.next=dummy.next.next;
        return head;
    }
}
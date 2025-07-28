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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        ListNode curr=dummy;
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            curr.next=new ListNode(temp.val);
            curr=curr.next;
            int value=gcd(temp.val,temp.next.val);
            curr.next=new ListNode(value);
            curr=curr.next;
            temp=temp.next;
        }
        curr.next=new ListNode(temp.val);
        return dummy.next;
    }

    public int gcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return Math.abs(num1);
    }
}
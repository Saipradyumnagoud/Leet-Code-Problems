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
    public int getDecimalValue(ListNode head) {
        StringBuilder binaryNum=new StringBuilder();
        if(head==null){
            return 0;
        }
        ListNode curr=head;
        while(curr!=null){
            binaryNum.append(curr.val);
            curr=curr.next;
        }
        int result = Integer.parseInt(binaryNum.toString(), 2);
        return result;
    }
}
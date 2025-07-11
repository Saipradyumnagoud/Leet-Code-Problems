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
    public ListNode middleNode(ListNode head) {
        List<Integer> nums=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            nums.add(curr.val);
            curr=curr.next;
        }
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        int n=nums.size()/2;
        for(int i=n;i<nums.size();i++){
            ListNode node = new ListNode(nums.get(i));
            temp.next=node;
            temp=temp.next;
        }
        return dummy.next;
    }
}
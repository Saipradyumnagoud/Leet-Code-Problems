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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
        return null;

        PriorityQueue<ListNode> Heap=new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode list: lists){
            if(list!=null){
                Heap.add(list);
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        while (!Heap.isEmpty()) {
            ListNode smallestNode = Heap.poll();
            current.next = smallestNode;
            current = current.next;
            if (smallestNode.next != null) {
                Heap.add(smallestNode.next);
            }
        }
        return dummy.next;
    }
}
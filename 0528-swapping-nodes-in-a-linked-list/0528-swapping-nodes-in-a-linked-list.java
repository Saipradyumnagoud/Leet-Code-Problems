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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        List<Integer> list = new ArrayList<>();
        while (temp != null) {
            int value = temp.val;
            list.add(value);
            temp = temp.next;
        }
        int n = list.size();
        int temp1 = list.get(k - 1);
        list.set(k - 1, list.get(n - k));
        list.set(n - k, temp1);

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int i = 0; i < list.size() && curr != null; i++) {
            curr.next = new ListNode(list.get(i));
            curr = curr.next;
        }
        return dummy.next;
    }
}
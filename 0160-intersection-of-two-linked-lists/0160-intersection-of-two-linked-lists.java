/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        var current = headA;
        while(current != null){
            set.add(current);
            current = current.next;
        }

        var temp = headB;
        while(temp != null){
            if(set.contains(temp)){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
}
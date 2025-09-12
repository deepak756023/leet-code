
class Solution {
    public void deleteNode(ListNode node) {
        var temp = node.next;
        node.val = temp.val;
        node.next = node.next.next;
    }
}

class Solution {
    public ListNode oddEvenList(ListNode head) {

        var prev = head;
        var curr = head.next;
        int count = 1;

        while(curr != null){
            if(count % 2 == 0){
                var temp1 = prev.next;
                var temp2 = curr.next;
                prev.next = curr;
                curr.next = temp1;

                while(temp1.next != curr){
                    temp1 = temp1.next;
                }
                temp1.next = temp2;
                prev = prev.next;
                curr = temp2;
                count++;
                continue;
            }

            curr = curr.next;
            count++;
        }

        return head;
        
    }
}
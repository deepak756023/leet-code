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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        

   
        if(list1!=null && list2!=null){
        if(list1.val<list2.val){
            list1.next=mergeTwoLists(list1.next,list2);
            return list1;
            }
            else{
                list2.next=mergeTwoLists(list1,list2.next);
                return list2;
        }
        }
        if(list1==null)
            return list2;
        return list1;
        







        // ArrayList<Integer> arr = new ArrayList<>();

        // while (list1.next != null) {
        //     arr.add(list1.val);

        //     list1 = list1.next;
        // }

        // while (list2.next != null) {
        //     arr.add(list2.val);

        //     list1 = list2.next;
        // }

        // Collections.sort(arr);

        // var finalList = new ListNode(-1);
        // var curr = finalList;

        // for (int i = 0; i < arr.size(); i++) {
        //     var node = new ListNode(arr.get(i));
        //     curr.next = node;
        //     curr = curr.next;

        // }

        // return finalList.next;

    }
}
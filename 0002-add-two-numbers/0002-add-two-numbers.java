import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigInteger first = BigInteger.ZERO;
        BigInteger second = BigInteger.ZERO;
        int i = 0, j = 0;

        while (l1 != null) {
            first = first.add(BigInteger.valueOf(l1.val).multiply(BigInteger.TEN.pow(i)));
            i++;
            l1 = l1.next;
        }

        while (l2 != null) {
            second = second.add(BigInteger.valueOf(l2.val).multiply(BigInteger.TEN.pow(j)));
            j++;
            l2 = l2.next;
        }

        BigInteger number = first.add(second);
        ListNode sum = new ListNode(-1);
        ListNode dummy = sum;

        if (number.equals(BigInteger.ZERO)) {
            return new ListNode(0);
        }

        while (number.compareTo(BigInteger.ZERO) > 0) {
            BigInteger[] divRem = number.divideAndRemainder(BigInteger.TEN);
            dummy.next = new ListNode(divRem[1].intValue()); // create node
            dummy = dummy.next;
            number = divRem[0];
        }

        return sum.next;
    }
}

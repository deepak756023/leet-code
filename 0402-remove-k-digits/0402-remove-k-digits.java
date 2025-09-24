class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>(); // stack to keep digits in increasing order

        // go through each digit from left to right
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i); // current digit character

            // if we can remove more digits (k>0) and the top of stack is bigger than current,
            // then removing that top will make the number smaller — so pop it
            while (k > 0 && !st.isEmpty() && st.peek() > c) {
                st.pop();
                k--; // used one removal
            }

            st.push(c); // keep the current digit
        }

        // if removals remain after scanning all digits, remove from the end (largest remaining digits)
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

        // build the result by popping stack (this gives reversed order)
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) sb.append(st.pop());
        sb.reverse(); // reverse to get correct left-to-right order

        // remove leading zeros: move i past all '0's at the start
        int i = 0;
        while (i < sb.length() && sb.charAt(i) == '0') i++;

        String res = sb.substring(i); // substring without leading zeros

        // if result is empty (all digits removed or only zeros remained), return "0"
        return res.isEmpty() ? "0" : res;
    }
}
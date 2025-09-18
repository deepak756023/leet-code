// class Solution {
//     public String makeGood(String s) {
//         if (s.length() < 2) {
//             return s;
//         }

//         Stack<Character> stack = new Stack<>();

//         for(var ch : s.toCharArray()){
//             if(!stack.empty()){
//                 if(Math.abs(ch - (stack.peek())) == 32){
//                     stack.pop();
//                     continue;
//                 }
               
//             }
//              stack.push(ch);
//         }

//         StringBuilder good = new StringBuilder();
//         while(!stack.empty()){
//             good.insert(0, stack.pop());
//         }

//         return good.toString();
//     }
// }

class Solution {
    public String makeGood(String s) {
        StringBuilder ans = new StringBuilder();
        for(char ch: s.toCharArray()){
            int len = ans.length();
            if(len>0 && Math.abs(ans.charAt(len-1) -ch) == 32)
            {
                ans.deleteCharAt(len-1);
            }else {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}
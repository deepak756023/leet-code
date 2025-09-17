import java.util.Stack;

// class Solution {
//     public int calPoints(String[] operations) {
//         int sum = 0;
//         Stack<Integer> stack = new Stack<>();

//         for (String op : operations) {
//             if (isInteger(op)) {
//                 int val = Integer.parseInt(op);
//                 stack.push(val);
//                 sum += val;
//             } else if (op.equals("C")) {
//                 sum -= stack.pop();
//             } else if (op.equals("D")) {
//                 int val = stack.peek() * 2;
//                 stack.push(val);
//                 sum += val;
//             } else if (op.equals("+")) {
//                 int top1 = stack.pop();
//                 int top2 = stack.peek();
//                 int val = top1 + top2;
//                 stack.push(top1);
//                 stack.push(val);      
//                 sum += val;
//             }
//         }

//         return sum;
//     }

//     public static boolean isInteger(String str) {
//         if (str == null || str.isEmpty()) {
//             return false;
//         }
//         try {
//             Integer.parseInt(str);
//             return true;
//         } catch (NumberFormatException e) {
//             return false;
//         }
//     }
// }

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String num : operations){
            if(num.equals("+")){
                int sum1=stack.pop();
                int sum2=stack.peek();
                stack.push(sum1);
                stack.push(sum1+sum2);
            }
            else if(num.equals("C")) stack.pop();
            else if(num.equals("D")) stack.push(stack.peek()*2);
            else stack.push(Integer.valueOf(num));
        }
        int sum=0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        return sum;
    }
}

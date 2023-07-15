/* 1221. Split a String in Balanced Strings
 * Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
Given a balanced string s, split it into some number of substrings such that:
Each substring is balanced.
Return the maximum number of balanced strings you can obtain.
 * 
 * Example 1:

Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
 * 
 * Example 2:

Input: s = "RLRRRLLRLL"
Output: 2
Explanation: s can be split into "RL", "RRRLLRLL", each substring contains same number of 'L' and 'R'.
Note that s cannot be split into "RL", "RR", "RL", "LR", "LL", because the 2nd and 5th substrings are not balanced.

 *Example 3:

Input: s = "LLLLRRRR"
Output: 1
Explanation: s can be split into "LLLLRRRR".
 */

public class isBalancedStr {
    public static int balancedStringSplit(String s, int index){
        if(index >= s.length()) return 0;

        int countL = 0;
        int countR = 0;
        while(index <= s.length()){
            if(s.charAt(index) == 'R') countR++;
            else countL++;
            if(countL == countR){
                return 1 + balancedStringSplit(s, index+1);
            }
            index++;
        }

        return balancedStringSplit(s, index);
    }

    public static int balancedStringSplit(String s){
        return balancedStringSplit(s, 0);
    }

    public static void main(String[] args) {
        String str = "LLLLRRRR";
        int result = balancedStringSplit(str);
        System.out.println(result);
    }
}

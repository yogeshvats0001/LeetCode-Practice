/*20. Valid Parentheses
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 * 
 * Input: s = "()"
Output: true
 * 
 * Input: s = "()[]{}"
Output: true
 * 
 * Input: s = "(]"
Output: false
 */

import java.util.Stack;

public class validParanthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else{
                if(!stack.isEmpty()){
                    char peeked = stack.peek();
                    if(ch == ')' && peeked == '('){
                        stack.pop();
                    }else if(ch == '}' && peeked == '{'){
                        stack.pop();
                    }else if(ch == ']' && peeked == '['){
                        stack.pop();
                    }else{
                        return false;
                    }
                }else{
                    stack.push(ch);
                }
            }
        }

        if(stack.isEmpty()) return true;
        else return false;
    }
    public static void main(String[] args) {
        String s = "(){}[]}";
        System.out.println(isValid(s));
    }
}

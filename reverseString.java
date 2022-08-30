/* 344. Reverse String
 * Write a function that reverses a string. The input string is given as an array of characters s.
   You must do this by modifying the input array in-place with O(1) extra memory.
 * Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
 * 
 * Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 */

public class reverseString{
    public static void reverseStr(char[] s){
        int len = s.length;
        for(int i=0; i<len/2; i++){
            char temp = s[i];
            s[i] = s[len-1-i];
            s[len-1-i] = temp;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseStr(s);
        for(char ch : s){
            System.out.print("\"" + ch + "\",");
        }
    }
}
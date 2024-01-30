/*1768. Merge Strings Alternately
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
Return the merged string.
 * 
 * Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
 * 
 * Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s
 * 
 * Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q 
merged: a p b q c   d
 *
 */

package Hard75;

public class mergeStrings {
    public static String solution(String word1, String word2){
        int i1 = 0, i2 = 0, len1 = word1.length(), len2 = word2.length();
        String result = "";
        while(i1 < len1 || i2 < len2){
            if(i1 < len1) result += word1.charAt(i1++);
            if(i2 < len2) result += word2.charAt(i2++);
        }
        return result;
    }
    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";
        String result = solution(word1, word2);
        System.out.println(result);
    }
}

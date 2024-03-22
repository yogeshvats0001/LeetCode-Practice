/* 2942. Find Words Containing Character
 * You are given a 0-indexed array of strings words and a character x.
Return an array of indices representing the words that contain the character x.
Note that the returned array may be in any order.
 * 
 * Input: words = ["leet","code"], x = "e"
Output: [0,1]
Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.
 * 
 * Input: words = ["abc","bcd","aaaa","cbc"], x = "a"
Output: [0,2]
Explanation: "a" occurs in "abc", and "aaaa". Hence, we return indices 0 and 2.
 */

import java.util.ArrayList;
import java.util.List;

public class findWordsContainingChar {
    public static List<Integer> findWordsContaining(String[] words, char x){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < words.length; i++){
            int index = words[i].indexOf(x);
            if(index != -1){
                result.add(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String[] words = new String[]{"abc","bcd","aaaa","cbc","aa"};
        char x = 'a';
        List<Integer> result = findWordsContaining(words, x);
        System.out.println(result);        
    }
}

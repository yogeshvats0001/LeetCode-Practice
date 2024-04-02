/* 2351. First Letter to Appear Twice
 * Given a string s consisting of lowercase English letters, return the first letter to appear twice.
 * 
Note:
A letter a appears twice before another letter b if the second occurrence of a is before the second occurrence of b.
s will contain at least one letter that appears twice.
 * 
 * Input: s = "abccbaacz"
Output: "c"
Explanation:
The letter 'a' appears on the indexes 0, 5 and 6.
The letter 'b' appears on the indexes 1 and 4.
The letter 'c' appears on the indexes 2, 3 and 7.
The letter 'z' appears on the index 8.
The letter 'c' is the first letter to appear twice, because out of all the letters the index of its second occurrence is the smallest.
 * 
 * Input: s = "abcdd"
Output: "d"
Explanation:
The only letter that appears twice is 'd' so we return 'd'.
*/

import java.util.HashMap;

public class firstLetterTwiceStr {
    static char checkTwice(String str){
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                return ch;
            }else{
                map.put(ch, 1);
            }
        }

        return '-';
    }

    public static void main(String[] args) {
        String str = "abccbaacz";
        System.out.println("First letter which occurs twice : " + checkTwice(str));
    }
}

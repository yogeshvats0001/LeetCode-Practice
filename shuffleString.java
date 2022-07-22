/* 1528. Shuffle String
 * You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
 Return the shuffled string.

 *Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.

 *Input: s = "abc", indices = [0,1,2]
Output: "abc"
Explanation: After shuffling, each character remains in its position.
 */

import java.util.HashMap;

public class shuffleString {
    //Method1) Use of hashmaps of Java
    public static String restoreStringUsingHashMap(String s, int[] indices){
        HashMap<Integer,Character> map = new HashMap<Integer, Character>();
        //creating a map
        for(int i=0; i<indices.length; i++){
            map.put(indices[i], s.charAt(i));
        }

        //create a string with respect to key-value pair
        int index = 0;
        String str = "";
        while(index < indices.length){
            str += map.get(index);
            index++;
        }
        return str;
    }

    //Method2) Use of Arrays, String manipulations.
    public static String restoreStringUsingArrayString(String s, int[] indices){
        // create char array as we can't change String due to immutable nature.
        char[] charArr = new char[indices.length];
        for(int i=0; i<indices.length; i++){
            int index = indices[i];
            charArr[index] = s.charAt(i);
        }

        String str = String.valueOf(charArr);
        return str;
    }

    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        String resultUsingHashMap = restoreStringUsingHashMap(s, indices);
        System.out.println("Using HashMap: "+ resultUsingHashMap);
        String resultUsingArrayString = restoreStringUsingArrayString(s, indices);
        System.out.println("Using Array-String: " + resultUsingArrayString);
    }
}


/*Note: 
 * 1. Method2 is preferrable over Method1.
 * 2. On concatenation of String and character, will convert that character to string itself. Otherwise use Character.toString(ch);
 * 3. In String, manipulation of elements are quite difficult so we can apply an approach to convert that string to char[] array.
 * 4. Way to play between String str  and char[] charArr: 
   str = String.valueOf(charArr);  -> it will convert the characters in one String like {'y','o','g','i'} into "yogi".

   where as Arrays.toString(charArr) -> it will return a string representation of the content of the specified array like {'a','b','c'} into "[a,b,c]". Just enclosed in "[]".
 */


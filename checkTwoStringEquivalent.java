/* 1662. Check If Two String Arrays are Equivalent
 * Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
   A string is represented by an array if the array elements concatenated in order forms the string.
 * 
 * Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.
 * 
 * Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false
 */

public class checkTwoStringEquivalent {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2){
        String concat1 = "";
        for(String element : word1){
            concat1 += element;
        }

        String concat2 = "";
        for(String element : word2){
            concat2 += element;
        }

        return concat1.equals(concat2);
    }

    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a","bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
}

// Note: .equals() is used to compare the string's content.

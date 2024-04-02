/*387. First Unique Character in a String
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 * 
 * Input: s = "leetcode"
Output: 0
 * 
 * Input: s = "loveleetcode"
Output: 2
 * 
 * Input: s = "aabb"
Output: -1
 * 
 */


public class firstUniqueCharStr {

    static int findUnique(String str){
        // to check argument is not empty.
        if(str == null || str.length() == 0){
            return -1;
        }

        // create a array with index as the ascii value of the character (useful while dealing with character).
        int[] charArray = new int[256];

        // initializing the charArray with the number of occurence. string.toCharArray() useful for converting string into charArray.
        for(char ch : str.toCharArray()){
            charArray[ch] = charArray[ch] + 1;
        }

        // start checking from the starting index of string.
        for(int i = 0 ; i < str.length(); i++){
            if(charArray[str.charAt(i)] == 1){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String str = "loveleetcode";
        System.out.println("First Unique Character in the string at : " + findUnique(str));
    }
}

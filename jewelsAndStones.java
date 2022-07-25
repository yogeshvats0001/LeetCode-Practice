/* 771. Jewels and Stones
 * You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
   Letters are case sensitive, so "a" is considered a different type of stone from "A".

 * Input: jewels = "aA", stones = "aAAbbbb"
Output: 3

 * Input: jewels = "z", stones = "ZZ"
Output: 0

All the characters of jewels are unique.
 */

public class jewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones){
        int count = 0;
        for(int i=0; i<jewels.length(); i++){
            char charJewels = jewels.charAt(i);
            for(int j=0; j<stones.length(); j++){
                char charStones = stones.charAt(j);
                if(charJewels == charStones){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }
}


//Note: In case of primitive datatype, we can use '==' operator for checking the same value of left and right operators. In case of String, we need .equals() operator for checking the content.
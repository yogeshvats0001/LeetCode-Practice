/*1313. Decompress Run-Length Encoded List
 * We are given a list nums of integers representing a list compressed with run-length encoding.
 * Consider each adjacent pair of elements [freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).  For each such pair, there are freq elements with value val concatenated in a sublist. Concatenate all the sublists from left to right to generate the decompressed list.
 * Return the decompressed list.
 * 
 * Input: nums = [1,2,3,4]
 * Output: [2,4,4,4]
 * Explanation: The first pair [1,2] means we have freq = 1 and val = 2 so we generate the array [2].
   The second pair [3,4] means we have freq = 3 and val = 4 so we generate [4,4,4].
 */

 import java.util.*;
public class decompressRunLengthList {
    public static int[] decompress(int[] nums){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i=i+2){
            int freq = nums[i];
            int value = nums[i+1];
            for(int j=0; j<freq; j++){
                list.add(value);
            }
        }

        //convert arraylist to int[]
        int[] resultArr = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            resultArr[i] = list.get(i);
        }
        return resultArr;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = decompress(nums);
        for(int element : result){
            System.out.print(element + " ");
        }
    }
}


/*Note: Since we require size of array at initial stage i.e., at the time of initializing the array. So we cant use that in this problem. Therefore we use an appraoch by the use of ArrayList which provides an advantage over array.

And there is direct method to convert ArrayList -> int[].
.toArray -> converts an ArrayList to Integer[] not int[]
 */

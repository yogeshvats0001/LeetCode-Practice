/*1389. Create Target Array in the Given Order
 * Given two arrays of integers nums and index. Your task is to create target array under the following rules:
   Initially target array is empty.
   From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
   Repeat the previous step until there are no elements to read in nums and index.
   Return the target array.
   It is guaranteed that the insertion operations will be valid.
 *Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]
 */

import java.util.ArrayList;

public class createTargetArray {
    public static int[] createTarget(int[] nums, int[] index){
        ArrayList<Integer> myList = new ArrayList<>();
        int len = nums.length;
        for(int i=0; i<len; i++){
            myList.add(index[i], nums[i]);
        }
        int[] target = new int[len];
        for(int j=0; j<len; j++){
            target[j] = myList.get(j);
        }
        return target;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] resultArr = createTarget(nums, index);
        for(int element : resultArr){
            System.out.print(element + " ");
        }
    }
}

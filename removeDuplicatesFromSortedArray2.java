/*80. Remove Duplicates from Sorted Array II
 * Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.
   Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
   Return k after placing the final result in the first k slots of nums.
   Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
 * 
 * Input: nums = [0,0,1,1,1,1,2,3,3]
 * Output: 7, nums = [0,0,1,1,2,3,3,_,_]
 * Explanation: Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
   It does not matter what you leave beyond the returned k (hence they are underscores).
 */

public class removeDuplicatesFromSortedArray2 {
    public static int removeDuplicate(int[] nums){
        //basic check for the edge cases.
        if(nums.length <= 2) return nums.length;

        int count = 1, validIndex = 1;
        for(int i=1; i<nums.length; i++){
            //check the count of particular element with respect to its previous element, starting from 1th pos.
            if(nums[i] == nums[i-1]){
                count++;
            }else{
                count = 1;
            }

            //check whether the count of particular element is less than 2(atmost 2) or not
            if(count <= 2){
                nums[validIndex++] = nums[i]; 
            }
        }

        return validIndex;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3, 3, 4};
        int result = removeDuplicate(nums);
        for(int i=0; i<result; i++){
            System.out.print(nums[i] +  " ");
        }
    }
}

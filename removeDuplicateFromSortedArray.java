/*26. Remove Duplicates from Sorted Array
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
 Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
 Return k after placing the final result in the first k slots of nums.
 Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

 *Input: nums = [0,0,1,1,1,2,2,3,3,4]
 *Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
 *Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
 It does not matter what you leave beyond the returned k (hence they are underscores).
 */


public interface removeDuplicateFromSortedArray {
    public static int removeDuplicates(int[] nums){
        int i=1, j=0;
        while(i < nums.length){
            if(nums[i] > nums[j]){
                j++;
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
            i++;
        }
        return j+1;
    }

    public static void main(String[] args) {
        int[] nums = { 0,0,1,1,1,2,2,3,3,4};
        int requiredLen = removeDuplicates(nums);
        for(int i=0; i<requiredLen; i++){
            System.out.print(nums[i]+ " ");
        }
    }
}


//Note: As we just want front array elements in sorted form, not the rest. So, we can think of interchanging required elements instead of shifting whole array in a sorted way as resultant aray would be { 0 1 2 3 4 0 2 1 3 1 }.
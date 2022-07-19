/*4. Median of Two Sorted Arrays 
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 *  The overall run time complexity should be O(log (m+n)).
 * 
 * Example 1:
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
 *Example 2:
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
*/

import java.util.*;
public class medianOfTwoSortedArray {
    public static double median(int[] nums1, int[] nums2){
        //Step1: Concatenate the nums1 and nums2 arrays.
        int mergedLen = nums1.length + nums2.length;
        int[] mergedArr = new int[mergedLen];
        int mergedIndex = 0;
        for(int element1 : nums1){
            mergedArr[mergedIndex++] = element1;
        }
        for(int element2 : nums2){
            mergedArr[mergedIndex++] = element2; 
        } 

        //Step2 : Sort the resultant array.
        Arrays.sort(mergedArr);

        //Step3 : Find median
        double resultValue;

        if(mergedLen%2 == 0){
            resultValue =  (mergedArr[mergedLen/2 - 1] + mergedArr[mergedLen/2]) / 2.0;
        }else{
            resultValue = mergedArr[mergedLen/2];
        }

        return resultValue;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        double result = median(nums1, nums2);
        System.out.println(result);
    }
}

/*Steps:
 * 1. concatenate the elements of nums1 and nums2 into third array.
 * 2. Sort that resultant array.
 * 3. Find median as per length of the array
 */

/*2535. Difference Between Element Sum and Digit Sum of an Array
 * You are given a positive integer array nums.

The element sum is the sum of all the elements in nums.
The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
Return the absolute difference between the element sum and digit sum of nums.

Note that the absolute difference between two integers x and y is defined as |x - y|.
 * 
 * Example 1:

Input: nums = [1,15,6,3]
Output: 9
Explanation: 
The element sum of nums is 1 + 15 + 6 + 3 = 25.
The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16.
The absolute difference between the element sum and digit sum is |25 - 16| = 9.
 * 
 * Example 2:

Input: nums = [1,2,3,4]
Output: 0
Explanation:
The element sum of nums is 1 + 2 + 3 + 4 = 10.
The digit sum of nums is 1 + 2 + 3 + 4 = 10.
The absolute difference between the element sum and digit sum is |10 - 10| = 0.
*/

public class diffElemSumDigitSum {

    public static int calcDigitSum(int num){
        if(num == 0) return 0;
        return num%10 + calcDigitSum(num/10);
    }

    public static int differenceOfSum(int[] nums, int index){
        if(index == nums.length) return 0;
        if(nums[index]/10 != 0){
            int digitSum = calcDigitSum(nums[index]);
            int diff = Math.abs(digitSum - nums[index]);
            return diff + differenceOfSum(nums, index + 1);
        }
        return differenceOfSum(nums, index + 1);
    }

    public static int differenceOfSum(int[] nums){
        return differenceOfSum(nums, 0);
    }
    public static void main(String[] args) {
        //Hard coded input
        int[] nums = new int[]{1,15,6,3};
        // int[] nums = new int[]{1,2,3,4};
        System.out.println(differenceOfSum(nums));
    }
}

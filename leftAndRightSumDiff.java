/*2574. Left and Right Sum Differences
 * Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:

answer.length == nums.length.
answer[i] = |leftSum[i] - rightSum[i]|.
Where:

leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
Return the array answer.
 * 
 * Example 1:

Input: nums = [10,4,8,3]
Output: [15,1,11,22]
Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].

 * Example 2:

Input: nums = [1]
Output: [0]
Explanation: The array leftSum is [0] and the array rightSum is [0].
The array answer is [|0 - 0|] = [0].
 * 
 */


public class leftAndRightSumDiff {
    public static int sumLeft(int[] nums, int i){
        if(i < 0) return 0;
        return nums[i] + sumLeft(nums, i - 1);
    }

    public static int sumRight(int[] nums, int j){
        if(j >= nums.length) return 0;
        return nums[j] + sumRight(nums, j+1);
    }   

    public static int[] leftRightDifference(int[] nums){
        int[] resultArr = new int[nums.length];
        for(int index = 0; index < nums.length; index++){
            int leftSum = sumLeft(nums, index-1);
            int rightSum = sumRight(nums, index + 1);
            resultArr[index] = Math.abs(leftSum - rightSum);
        }
        return resultArr;
    }

    public static void main(String[] args) {
        //Kindly change below for sample input
        int[] nums = new int[]{10,4,8,3};
        int[] result = leftRightDifference(nums);

        for(int element : result){
            System.out.println(element);
        }
    }
}

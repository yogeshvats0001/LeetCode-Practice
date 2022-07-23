/*1. Two Sum
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
   You may assume that each input would have exactly one solution, and you may not use the same element twice.
   You can return the answer in any order.
 * Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * Input: nums = [3,3], target = 6
Output: [0,1]
 */

public class twoSum {
    public static int[] sumPair(int[] nums, int target){
        for(int i=0; i<nums.length-1; i++){
            int second = target - nums[i];
            for(int j = i+1; j<nums.length; j++){
                if(nums[j] == second){
                    return new int[] {i,j};
                }
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] resultArr = sumPair(nums, target);
        for(int element : resultArr ){
            System.out.print(element + " ");
        }
    }
}

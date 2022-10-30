/* 35. Search Insert Position
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order. You must write an algorithm with O(log n) runtime complexity.
 * 
 * Input: nums = [1,3,5,6], target = 5
Output: 2

 *Input: nums = [1,3,5,6], target = 7
Output: 4
 * 
 */

public class searchInsertPositionArray{
    public static int solution(int[] nums, int target){
        for(int i=0; i< nums.length; i++){
            if(nums[i] >= target){
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        int target = 5;
        int result = solution(nums, target);
        System.out.println(result);
    }
}
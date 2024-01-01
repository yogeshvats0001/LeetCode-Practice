/*2656. Maximum Sum With Exactly K Elements
 * 
 * You are given a 0-indexed integer array nums and an integer k. Your task is to perform the following operation exactly k times in order to maximize your score:
Select an element m from nums.
Remove the selected element m from the array.
Add a new element with a value of m + 1 to the array.
Increase your score by m.
Return the maximum score you can achieve after performing the operation exactly k times.
 *
 * Input: nums = [1,2,3,4,5], k = 3
Output: 18
Explanation: We need to choose exactly 3 elements from nums to maximize the sum.
For the first iteration, we choose 5. Then sum is 5 and nums = [1,2,3,4,6]
For the second iteration, we choose 6. Then sum is 5 + 6 and nums = [1,2,3,4,7]
For the third iteration, we choose 7. Then sum is 5 + 6 + 7 = 18 and nums = [1,2,3,4,8]
So, we will return 18.
It can be proven, that 18 is the maximum answer that we can achieve.
 * 
 * Input: nums = [5,5,5], k = 2
Output: 11
Explanation: We need to choose exactly 2 elements from nums to maximize the sum.
For the first iteration, we choose 5. Then sum is 5 and nums = [5,5,6]
For the second iteration, we choose 6. Then sum is 5 + 6 = 11 and nums = [5,5,7]
So, we will return 11.
It can be proven, that 11 is the maximum answer that we can achieve.
 * 
 */


public class maxSumWithKElements {
    public static int solution(int[] arr, int k){
        int maxi = Integer.MIN_VALUE;
        for(int element : arr){
            if(element > maxi){
                maxi = element;
            }
        }

        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += maxi + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int k = 3;
        System.out.println("Maximum sum of largst K elements : " + solution(arr, k));
    }
}

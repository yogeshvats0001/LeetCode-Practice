/*1920. Build Array from Permutation
Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).


Input: nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]*/

public class arrayFromPermutation {
    //Method1. Iterative Way
    public static int[] permutation(int[] nums){
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    //Method2. Recursive Way (Since answer depends upon the smaller and smaller part of the array)
    public static int[] permutationRecursion(int[] nums, int[] newArr, int index){
        //BC
        if(index == nums.length) return newArr;
        //MC => f(n) = g(g(n))
        newArr[index] = nums[nums[index]];
        //RC
        return permutationRecursion(nums, newArr, index+1);
    }

    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        //Method1. Iteration
        // int[] result = permutation(nums);
        // for(int i : result){
        //     System.out.print(i + " ");
        // }

        //Method2. Recursion
        int[] newArr = new int[nums.length];
        nums = permutationRecursion(nums, newArr, 0);
        for(int element : nums){
            System.out.print(element + " ");
        }
    }
}


//Java Note: We can use for(int i=0; i<nums.length; i++) for index oriented solutions And for(int i : nums) for getting just element of an array irrespective of index information.
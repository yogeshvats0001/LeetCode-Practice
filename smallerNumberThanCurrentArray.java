// 1365. How Many Numbers Are Smaller Than the Current Number
// Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

// Input: nums = [8,1,2,2,3]
// Output: [4,0,1,1,3]

public class smallerNumberThanCurrentArray{
    public static int[] smallerArray(int[] nums){
        int[] resultArray = new int[nums.length];
        int counter = 0;
        for(int i=0; i<nums.length; i++){
            int currentValue = nums[i];
            int smallerValue = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[j] < currentValue){
                    smallerValue++;
                }
            }
            resultArray[counter++] = smallerValue;
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] result = smallerArray(nums);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
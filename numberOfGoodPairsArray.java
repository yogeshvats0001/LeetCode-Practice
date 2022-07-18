/*1512. Number of Good Pairs
*Given an array of integers nums, return the number of good pairs.
*A pair (i, j) is called good if nums[i] == nums[j] and i < j.
*
*Input: nums = [1,2,3,1,1,3]
*Output: 4
*Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
*/


public class numberOfGoodPairsArray {
    public static int goodPairs(int[] nums){
        int countValue = 0;
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    countValue++;
                }
            }
        }
        return countValue;
    }   

    public static void main(String[] args) {
        //input(Hard coded) : We can use Scanner class for getting inputs from users. But for simplicity, we are using hard coded value.
        int[] nums = {1,2,3,1,1,3};
        int result = goodPairs(nums);
        System.out.println(result);

    }
}



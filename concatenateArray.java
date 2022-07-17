// Write a program to Concatenate the array.
// Input:
// {1,2,1,3}

// Output:
// {1,2,1,3,1,2,1,3}



public class concatenateArray{
    public static int[] solution(int[] nums){
        int len = nums.length;
        int[] ans = new int[2*len];
        // ans = nums; -> wrong step as it will reassign the address of nums array to new ans array.
        int pointer = 0;
        int turn = 1;
        while(turn < 3){
            for(int i =0; i<nums.length;i++){
                ans[pointer++] = nums[i];
            }
            turn++;
        }
        return ans;
    }

    public static void main(String[] args) {
        //inputs (Hard Coded)
        int[] nums = {1,2,1,3};
        int[] res = solution(nums);
        System.out.println("res length : "+res.length);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]  + " ");
        }
    }
}
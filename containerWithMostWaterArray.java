/*11. Container With Most Water
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 Find two lines that together with the x-axis form a container, such that the container contains the most water.
 Return the maximum amount of water a container can store.
 Notice that you may not slant the container.

 *Input: height = [1,8,6,2,5,4,8,3,7]
 *Output: 49
 *Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container    can contain is 49.
 */


public class containerWithMostWaterArray {
    //Method1. Using two for loops
    public static int solution(int[] heights){
        int length, width;
        int maxArea = Integer.MIN_VALUE;
        for(int i=0; i<heights.length-1; i++){
            for(int j=i+1; j<heights.length; j++){
                length = j-i;
                if(heights[i] > heights[j]){
                    width = heights[j];
                }else{
                    width = heights[i];
                }

                int innerArea = length * width;
                if(innerArea > maxArea){
                    maxArea = innerArea;
                }
            }
        }
        return maxArea;
    }

    //Method2. Using left and right pointers
    public static int solution2(int[] heights){
        int length, width, maxArea = Integer.MIN_VALUE;
        int left = 0, right = heights.length - 1;
        while(left < right){
            width = right - left;

            if(heights[left] > heights[right]){
                length = heights[right];
                right--;
            }else{
                length = heights[left];
                left++;
            }

            int innerArea = length * width;

            if(innerArea > maxArea){
                maxArea = innerArea;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] nums = {1,8,6,2,5,4,8,3,7};
        int resultArea = solution(nums);
        int resultArea2 = solution2(nums);
        System.out.println(resultArea);
        System.out.println(resultArea2);
    }
}


/*Note: Complexity of Method1 is O(n^2) i.e., quadratic complexity which is okay for small inputs but not for bigger ones.
 * Whereas Method2 is of O(n) since we are using single while loop and it's an optimized way of solving such problem.
*/

/*1470. Shuffle the Array
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 * 
 * Input: nums = [2,5,1,3,4,7], n = 3 
 * Output: [2,3,5,4,1,7] 
 * Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
 */


public class shuffleTheArray {
    public static int[] shuffle(int[] nums, int n){
        int[] resultArr = new int[nums.length];
        int indexArr = 0;
        for(int i=0; i<n; i++){
            resultArr[indexArr] = nums[i];
            indexArr = indexArr + 2;
        }

        //as indexArr was 4 due to above for loop.
        indexArr = 1;
        for(int j=n; j<nums.length; j++){
            resultArr[indexArr] = nums[j];
            indexArr = indexArr + 2;
        }

        return resultArr;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int separatingPoint = 3;
        int[] result = shuffle(nums, separatingPoint);
        for(int i : result){
            System.out.print(i + " ");
        }
    }
}

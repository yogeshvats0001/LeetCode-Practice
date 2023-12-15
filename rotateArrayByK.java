/*189. Rotate Array Given an integer array nums, rotate the array to the right by k steps, where k is non-negative. 
 * 
 * Medium
 * 
 * Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
 * 
 * Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
*/


public class rotateArrayByK {
    static int[] solution(int[] arr, int k){
        int[] temp = new int[arr.length];

        for(int i = 0; i<arr.length; i++){
            temp[(i+k) % arr.length] = arr[i];
        }

        return temp;
    }
    public static void main(String[] args) {
        int k = 2;
        int[] nums = new int[]{11, 12, 13, 14};
        System.out.println("Before Rotating: ");
        for(int element : nums){
            System.out.println(element);
        }
        nums = solution(nums, k);
        System.out.println("After Rotating: ");
        for(int element : nums){
            System.out.println(element);
        }
    }
}

//NOTE: modulus --> % n is always between 0 to (n-1)
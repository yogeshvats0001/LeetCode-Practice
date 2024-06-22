/*136. Single Number
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.
 * 
 * Input: nums = [2,2,1]
Output: 1
 * 
 * Input: nums = [4,1,2,1,2]
Output: 4
 * 
 * Input: nums = [1]
Output: 1
 * 
 */



public class singleUniqueElement {
    public static int findUnique(int[] arr) {
        int single = arr[0];
        for (int i = 1; i < arr.length; i++) {
            single ^= arr[i];
        }
        return single;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 2, 1, 3, 3, 1 };
        int result = findUnique(arr);
        if (result != 0) {
            System.out.println("Unique element in the given array: " + result);
        } else{
            System.out.println("No Unique element in the given array");
        }
    }
}

//Note: Property of XOR that, XOR of two unique elements is always zero.
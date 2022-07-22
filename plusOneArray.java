/* 66. Plus One 
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.Increment the large integer by one and return the resulting array of digits.
 * 
 * Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

 * Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
*/

public class plusOneArray{
    public static int[] plusOne(int[] digits){
        for(int i=digits.length-1; i>=0; i--){
            //for less than 9.
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }

            //for equal to 9.
            digits[i] = 0;
        }

        //for all 9s in the given array.
        int[] resultArr = new int[digits.length + 1];
        resultArr[0] = 1;
        return resultArr;
    }

    public static void main(String[] args) {
        int[] digits = {9,9,9,9};
        int[] result = plusOne(digits);
        for(int element : result){
            System.out.print(element +  " ");
        }
    }
}
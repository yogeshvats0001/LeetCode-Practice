/**2652. Sum Multiples
 * Given a positive integer n, find the sum of all integers in the range [1, n] inclusive that are divisible by 3, 5, or 7.
 *
 * Example 1:

Input: n = 7
Output: 21
Explanation: Numbers in the range [1, 7] that are divisible by 3, 5, or 7 are 3, 5, 6, 7. The sum of these numbers is 21.

 * Example 2:

Input: n = 10
Output: 40
Explanation: Numbers in the range [1, 10] that are divisible by 3, 5, or 7 are 3, 5, 6, 7, 9, 10. The sum of these numbers is 40.
 * 
 */

public class sumMultiplies{
    public static int sumOfMultiples(int n){
        if(n < 3) return 0;
        if(n % 3 == 0 || n % 5 == 0 || n % 7 == 0) return n + sumOfMultiples(n - 1);
        return sumOfMultiples(n - 1);
    }

    public static void main(String[] args){
        //below value of n can be anything (currently hard coded)
        int n = 10;
        int sum = sumOfMultiples(n);
        System.out.println(sum);
    }
}
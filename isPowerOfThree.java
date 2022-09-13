/*326. Power of Three
 * Given an integer n, return true if it is a power of three. Otherwise, return false.
 An integer n is a power of three, if there exists an integer x such that n == 3x
 * 
 * Input: n = 27
Output: true
Explanation: 27 = 33
 * 
 * Input: n = 0
Output: false
Explanation: There is no x where 3x = 0.
 */

import java.util.*;
public class isPowerOfThree {
    static Scanner scan = new Scanner(System.in);

    public static boolean solve(int num, int p){
        double res = Math.pow(3, p);
        //BC
        if(res > num) return false;

        //MC
        if(res == num) return true;

        //RC
        return solve(num, p+1);
    }
    public static boolean solve(int num){
        return solve(num, 0);
    }

    public static void main(String[] args) {
        int num = scan.nextInt();
        System.out.println(solve(num));
    }
}

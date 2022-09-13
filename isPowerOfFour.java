/* 342. Power of Four
 * Given an integer n, return true if it is a power of four. Otherwise, return false.
   An integer n is a power of four, if there exists an integer x such that n == 4x.
 * 
 * Input: n = 16
Output: true
 * 
 * Input: n = 5
Output: false
 */

import java.util.Scanner;

public class isPowerOfFour {
    static Scanner scan = new Scanner(System.in);

    public static boolean solve(int num, int p){
        double res = Math.pow(4, p);
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

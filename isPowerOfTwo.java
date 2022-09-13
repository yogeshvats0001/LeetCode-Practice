
/*231. Power of Two
 * Given an integer n, return true if it is a power of two. Otherwise, return false.
 An integer n is a power of two, if there exists an integer x such that n == 2x.
 * 
 * Input: n = 1
Output: true
Explanation: 20 = 1
 * 
 * Input: n = 3
Output: false
 */
import java.util.Scanner;
import java.lang.Math;

public class isPowerOfTwo {
    public static Scanner scan = new Scanner(System.in);

    public static boolean solve(int num, int p){
        double res = Math.pow(2, p);

        //BC
        if(res > num) return false;

        //MC
        if(res == num) return true;

        //RC
        return solve(num, p+1);
    }

    public static boolean solve(int num) {
        return solve(num, 0);
    }

    public static void main(String[] args) {
        int num = scan.nextInt();
        System.out.println(solve(num));
    }
}

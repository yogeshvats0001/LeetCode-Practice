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

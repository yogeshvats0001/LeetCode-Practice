// 1672. Richest Customer Wealth
// You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

// Input:
// {{1,2,3},{3,2,1}}

// Output:
// 6


public class richestCustomerWealthArray {
    public static int maxValueCustomer(int[][] accounts){
        int maxValue = Integer.MIN_VALUE;
        for(int i=0; i<accounts.length; i++){
            int innerSum = 0;
            for(int j=0; j<accounts[i].length; j++){
                innerSum += accounts[i][j];
            }

            //to check max value of requirement instead of making array of values for each customer
            if(innerSum > maxValue){
                maxValue = innerSum;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maxValueCustomer(accounts));
    }
}

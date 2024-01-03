package matrix.richestcustomerwealth;

public class RichestCustomerWealth {

    /*
    You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i customer has in the j bank.
    Return the wealth that the richest customer has.
    A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
     */

    public static int maximumWealth(int[][] accounts) {
        int sum = 0;
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
                if (sum > max) {
                    max = sum;
                }
                System.out.print(accounts[i][j] + " ");
            }
            sum = 0;
            System.out.println();
        }
        return max;
    }
}

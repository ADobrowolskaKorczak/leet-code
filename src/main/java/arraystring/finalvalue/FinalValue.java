package arraystring.finalvalue;

/*
Input: operations = ["--X","X++","X++"]
Output: 1
Explanation: The operations are performed as follows:
Initially, X = 0.
--X: X is decremented by 1, X =  0 - 1 = -1.
X++: X is incremented by 1, X = -1 + 1 =  0.
X++: X is incremented by 1, X =  0 + 1 =  1.
 */


public class FinalValue {

    public static int finalValueAfterOperations(String[] operations) {
        int k = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("X++") || operations[i].equals("++X")) {
                k++;
            } else {
                k--;
            }
        }
        return k;
    }
}

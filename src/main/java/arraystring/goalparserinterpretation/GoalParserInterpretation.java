package arraystring.goalparserinterpretation;

/*
You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or
"(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the
string "al". The interpreted strings are then concatenated in the original order.
Given the string command, return the Goal Parser's interpretation of command.

Input: command = "G()(al)"
Output: "Goal"
Explanation: The Goal Parser interprets the command as follows:
G -> G
() -> o
(al) -> al
The final concatenated result is "Goal".


 */

public class GoalParserInterpretation {

    public static String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        String[] ar = command.split("");
        for (int i = 0; i < command.length(); i++) {
            if (ar[i].equals("G")) {
                sb.append("G");
            } else if(ar[i].equals("(")) {
                if (ar[i+1].equals(")")) {
                    sb.append("o");
                } else {
                    sb.append("al");
                }
            }
        }
        return sb.toString();
    }

}

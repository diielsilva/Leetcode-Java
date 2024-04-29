
public class Solution {

    public String interpret(String command) {
        StringBuilder builder = new StringBuilder();

        for (int a = 0; a < command.length(); a++) {

            if (command.charAt(a) == '(' && command.charAt(a + 1) == ')') {
                builder.append("o");
            } else if (command.charAt(a) == '(' && command.charAt(a + 1) != ')') {
                builder.append("al");
            } else if (command.charAt(a) == 'G') {
                builder.append("G");
            }

        }

        return builder.toString();
    }

}

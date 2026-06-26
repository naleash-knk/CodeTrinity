import java.util.*;

public class ExpressionCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().strip();

        char[] charr = str.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < charr.length; i++) {

            if (charr[i] == ' ') {
                continue;
            }

            if (Character.isLetter(charr[i])) {
                System.out.print(charr[i] + " ");
            }

            else if (charr[i] == '(') {
                stack.push(charr[i]);
            }

            else if (charr[i] == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    System.out.print(stack.pop() + " ");
                }

                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }

            else if (charr[i] == '+' || charr[i] == '-') {

                while (!stack.isEmpty() && stack.peek() != '(') {
                    System.out.print(stack.pop() + " ");
                }

                stack.push(charr[i]);
            }

            else if (charr[i] == '*' || charr[i] == '/') {

                while (!stack.isEmpty() &&
                        (stack.peek() == '*' || stack.peek() == '/')) {

                    System.out.print(stack.pop() + " ");
                }

                stack.push(charr[i]);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        sc.close();
    }
}
import java.util.*;

public class ExpressionEvaluator {

    static int calculate(String op, int a, int b){
        switch(op){
            case "+" -> {
                return a + b;
            }
            case "-" -> {
                return a - b;
            }
            case "*" -> {
                return a * b;
            }
            case "/" -> {
                return a / b;
            }
        }
        return 0;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String[] strarr = sc.nextLine().split(" ");

        Stack<Integer> stack = new Stack<>();

        for(String token : strarr){

            if(!"+-*/".contains(token)){
                stack.push(Integer.valueOf(token));
            }
            else{
                int b = stack.pop();
                int a = stack.pop();

                stack.push(calculate(token, a, b));
            }
        }

        System.out.println(stack.pop());

        sc.close();
    }
}
import java.util.*;

public class StreamlineExpressionEvaluator {
    static String streamExpressionEvaluator(String s){
        char[] charr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        String restring = "";
        for(int i=s.length()-1;i>=0;i--){
            if(Character.isAlphabetic(charr[i])){
                restring = charr[i]+restring;
            }
            if(charr[i]==')'){
                stack.push(charr[i]);
            }
            if(charr[i]=='('){
                while(!stack.isEmpty()&&stack.peek()!=')'){
                    restring = stack.pop()+restring;
                }
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }

            if(charr[i]=='+'||charr[i]=='-'){
                while(!stack.isEmpty()&&(stack.peek()=='*'||stack.peek()=='/')){
                    restring=stack.pop()+restring;
                }
                stack.push(charr[i]);
            }
            if(charr[i]=='*'||charr[i]=='/'){
                stack.push(charr[i]);
            }
        }
        while(!stack.isEmpty()){
            restring=stack.pop()+restring;
        }
        
        return restring;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(streamExpressionEvaluator(s));
        sc.close();
    }
}

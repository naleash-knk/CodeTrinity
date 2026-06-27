
import java.util.*;

public class BalanceParanthesis {
    
    static int balanceParathesis(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')'){
                if(!stack.isEmpty()&&stack.peek()=='('){
                    stack.pop();
                }
                else{
                    stack.push(s.charAt(i));
                }
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        
        return stack.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }
        for(String s:arr){
            System.out.println(balanceParathesis(s));
        }
        sc.close();
    }
}
import java.util.*;

public class ValidParathesis {
    
    static int validParentheses(String s){
        char[] charr = s.toCharArray();
        Stack<Character> stack = new Stack();
        int max = Integer.MIN_VALUE;
        int count =0;
        for(char c:charr){
            if(c==')'){
                if(stack.isEmpty()){
                    if(count > max){
                        max = count;
                        count=0;
                    }
                }
                if(!stack.isEmpty()&&stack.peek()=='('){
                    count+=2;
                    stack.pop();
                }
            }
            else{
                stack.push(c);
            }
        }
        if(count > max){
                max = count;
                count=0;
        }
       return max;
        
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
            System.out.println(validParentheses(s));
        }
        sc.close();
    }
}
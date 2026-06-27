import java.util.*;

public class RedundantBrackets{
    static boolean redundantChecker(String s){
        char[] charr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char c : charr){
            if(c==' '||Character.isAlphabetic(c)){
                continue;
            }
            if(c==')'){
                if(stack.peek()!='('){
                    while(!stack.isEmpty()&&stack.peek()!='('){
                        stack.pop();
                    }
                    if(!stack.isEmpty()){
                        stack.pop();
                    }
                }
                else{
                    return false;
                }
                continue;
            }
            stack.push(c);
        }

        if(stack.isEmpty()){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] strarr = new String[n];
        for(int i=0;i<n;i++){
            strarr[i]=sc.nextLine();
            
        }
        
        for(String s:strarr){
            Boolean res = redundantChecker(s);
            if(!res){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        sc.close();
    }
}
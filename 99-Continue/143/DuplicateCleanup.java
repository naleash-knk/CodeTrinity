import java.io.*;
import java.util.*;

public class DuplicateCleanup {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
       Stack<Character> stack = new Stack<>();
       
       for(int i=0;i<str.length();i++){
            if(!stack.isEmpty()&&stack.peek()==str.charAt(i)){
                stack.pop();
            }
            else{
                stack.push(str.charAt(i));
            }
       }
       
       if(stack.isEmpty()){
        System.out.println("Empty String");
       }
       else{
        for(char c:stack){
            System.out.print(c);
        }
       }
       sc.close();
       return;
    }
}
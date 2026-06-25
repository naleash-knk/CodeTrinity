import java.util.*;

public class MathematicalExpression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] charr = str.toCharArray();
        Stack<Integer> stack = new Stack<>();
        
        int num=0;
        char sign = '+';
        
        for(int i=0;i<charr.length;i++){
            if(Character.isDigit(charr[i])){
                num=num*10+Integer.parseInt(charr[i]+"");
            }
            if("+-*/".contains(charr[i]+"") || i==charr.length-1){
                if(sign=='+'){
                    stack.push(num);
                }
                else if(sign=='-'){
                    stack.push(-1*num);
                }
                else if(sign=='*'){
                    int a = stack.pop();
                    stack.push(a*num);
                }
                else if(sign=='/'){
                    int numerator = stack.pop();
                    stack.push((int)numerator/num);
                }
                num=0;
                sign=charr[i];
            }
        }
        
        int result =0;
        for(int i:stack){
            result+=i;
        }
        System.out.println(result);
        sc.close();
    }
}
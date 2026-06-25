import java.util.*;

class Node{
    char val;
    Node next;
    Node(char val){
        this.val = val;
    }
}

public class ValidParathesis {
    static Node stack = null;
    
    static void push(char val){
        if(stack==null){
            stack=new Node(val);
            return;
        }
        Node newNode = new Node(val);
        newNode.next = stack;
        stack = newNode;
    }
    
    static void pop(){
       stack=stack.next;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();

        
        for(char ch:arr){
            if(ch=='('){
                push(ch);
            }
            else if(ch=='{'){
                push(ch);
            }
            else if(ch=='['){
                push(ch);
            }
            
            if(stack==null && (ch==')'||ch=='}'||ch==']')){
                System.out.println(false);
                sc.close();
                return;
            }
            
            if(ch==')'){
                if(stack==null || stack.val!='('){
                    System.out.print(false);
                    sc.close();
                    return;
                }
                pop();
            }
            
            
            if(ch==']'){
                if(stack==null || stack.val!='['){
                    System.out.print(false);
                    sc.close();
                    return;
                }
                pop();
            }
            
            if(ch=='}'){
                if(stack==null || stack.val!='{'){
                    System.out.print(false);
                    sc.close();
                    return;
                }
                pop();
            }
            
        }
        
        System.out.println(stack==null);
        sc.close();
    }
}
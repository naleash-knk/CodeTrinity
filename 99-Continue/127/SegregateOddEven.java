import java.util.*;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

public class SegregateOddEven {
    static Node head = null;

    static void insertAtEnd(Node head, int val){
        Node current = head;
        while(current.next!=null){
            current =current.next;
        }
        current.next = new Node(val);
    }
    
    static Node segregateEvenOdd(){
        Node even = null;
        Node odd = null;
  
        Node current = head;
        
        while(current!=null){
            if(current.val%2==0){
                if(even==null){
                    even = new Node(current.val);
                }
                else{
                    insertAtEnd(even, current.val);
                }
            }
            else{
                if(odd==null){
                    odd = new Node(current.val);
                }
                else{
                    insertAtEnd(odd, current.val);
                }
            }
            current = current.next;
        }
        
        if(even==null){
            return odd;
        }
        if(odd==null){
            return even;
        }
        
        Node crt = even;
        while(crt.next!=null){
            crt=crt.next;
        }
        crt.next = odd;
        return even;

    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       for(int i=0;i<n;i++){
        int val = sc.nextInt();
        if(head == null){
            head = new Node(val);
        }
        else{
            insertAtEnd(head, val);
        }
       }
       if(head==null){
        System.out.println("List is empty");
        sc.close();
        return;
       }
       Node iter = segregateEvenOdd();
       while(iter!=null){
        System.out.print(iter.val+" ");
        iter=iter.next;
       }
       sc.close();
    }
}


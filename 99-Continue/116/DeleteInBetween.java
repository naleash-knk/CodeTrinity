import java.util.*;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}

public class DeleteInBetween{
    
    static void insertAtEnd(Node head, int val){
        Node current = head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=new Node(val);
    }
    
    static Node deleteInBetween(Node head, int ind){
        if(head==null){
            return head;
        }
        Node current =head;
        
        if(ind==1){
            return head.next;
        }
        while(current!=null && ind>2){
            current = current.next;
            ind--;
        }
        
        
    if(current == null || current.next == null){
        return head;
    }
        
        current.next = current.next.next;
        
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            if(head==null){
                head = new Node(val);
            }
            else{
                insertAtEnd(head,val);
            }
        }
        
        int ind = sc.nextInt();
        
        if(ind < 1 || ind > n || head == null){
            System.out.print("List is empty");
            sc.close();
            return;
        }
        head = deleteInBetween(head, ind);
        
        Node iter = head;
        while(iter!=null){
            System.out.print(iter.val+" ");
            iter=iter.next;
        }
        sc.close();
    }
}
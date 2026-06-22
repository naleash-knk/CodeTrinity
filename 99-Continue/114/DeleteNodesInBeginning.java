import java.util.*;

class Node{
    Node next;
    int val;
    Node(int val){
        this.val = val;
    }
}


public class DeleteNodesInBeginning {
    
    static void insertAtEnd(Node head, int val){
        Node current = head;
        while(current.next!=null){
            current=current.next;
        }
        current.next = new Node(val);
    }
    
    static Node deleteNodes(Node head, int ind){
        Node current = head;
        while(current!=null &&ind>0){
            current=current.next;
            ind--;
        }
        return current;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            if(head == null){
                head=new Node(val);
            }
            else{
                insertAtEnd(head, val);
            }
        }
        
        int ind = sc.nextInt();
        
        
        head = deleteNodes(head,ind);
        
        if(head==null){
            System.out.print("List is empty");
            sc.close();
            return;
        }
        
        Node iter = head;
        
        while(iter!=null){
            System.out.print(iter.val+" ");
            iter=iter.next;
        }
        sc.close();
        
    }
}
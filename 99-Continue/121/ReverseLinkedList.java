import java.util.*;

class Node{
    String val;
    Node next;
    Node(String val){
        this.val =val;
    }
}

public class ReverseLinkedList {
    static void insertAtEnd(Node head, String val){
        Node current = head;
        while(current.next!=null){
            current=current.next;
        }
        current.next = new Node(val);
    }
    
    static Node insertAtBeginning(Node head,String val){
        if(head==null){
            head = new Node(val);
            return head;
        }
        Node newNode = new Node(val);
        newNode.next=head;
        return newNode;
    }
    
    static Node reverseLinkedList(Node head){
        if(head.next==null){
            return head;
        }
        Node current = head;
        Node revhead = null;
        while(current.next!=null){
            revhead=insertAtBeginning(revhead, current.val);
            current = current.next;
        }
        revhead=insertAtBeginning(revhead, current.val);
        return revhead;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Node head = null;
        for(int i=0;i<n;i++){
            String val = sc.nextLine();
            if(head==null){
                head = new Node(val);
            }
            else{
                insertAtEnd(head,val);
            }
        }
        if(head==null){
            System.out.print("List is empty");
            sc.close();
            return;
        }
        head = reverseLinkedList(head);
        
        Node iter = head;
        while(iter!=null){
            System.out.print(iter.val+" ");
            iter=iter.next;
        }
        sc.close();
    }
}
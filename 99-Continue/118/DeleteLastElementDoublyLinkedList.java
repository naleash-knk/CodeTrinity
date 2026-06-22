import java.util.*;

public class DeleteLastElementDoublyLinkedList {
    
    static void insertAtEndDLL(Node head, int val){
        Node current = head;
        while(current.next!=null){
            current=current.next;
        }
        Node newNode = new Node(val);
        newNode.prev = current;
        current.next = newNode;
    }
    
    static void deleteLastElement(Node head){
        Node current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.prev.next =null;
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
                insertAtEndDLL(head, val);
            }
        }
        
        if(head == null || n==1){
            System.out.println("List is empty");
            sc.close();
            return;
        }

        deleteLastElement(head);
        
        Node iter = head;
        while(iter!=null){
            System.out.print(iter.val+" ");
            iter=iter.next;
        }
        
        sc.close();
    }
}

class Node{
    int val;
    Node next;
    Node prev;
    Node(int val){
        this.val=val;
    }
}
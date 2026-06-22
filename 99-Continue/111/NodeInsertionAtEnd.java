import java.util.*;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
    
}

public class NodeInsertionAtEnd {
    
    static void insertAtEnd(Node head, int val){
        Node current = head;
        while(current.next!=null){
            current=current.next;
        }
        current.next = new Node(val);
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
                insertAtEnd(head, val);
            }
        }
        
        Node iter = head;
        while(iter!=null){
            System.out.print(iter.val+" ");
            iter=iter.next;
        }
        
        sc.close();
    }
}
import java.util.*;

class Node{
    int val;
    Node next;
    Node(int n){
        this.val = n;
        this.next=null;
    }
}

public class InsertionLinkedList {

    static void insertAtEnd(Node head, int n){
        Node current = head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=new Node(n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println();
            sc.close();
            return;
        }
        Node head = null;
        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            if(head==null){
                head=new Node(k);
            }
            else{
                insertAtEnd(head, k);
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

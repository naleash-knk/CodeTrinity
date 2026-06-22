import java.util.*;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

public class LinkedListFromMiddleExtractor {
    
    static void insertAtEnd(Node head, int val){
        Node current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next = new Node(val);
    }
    
    static Node deleteFromBeginning(Node head,int mid){
        Node current = head;
        while(current!=null&&mid>1){
            current=current.next;
            mid--;
        }
        return current.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mid = n%2!=0 ? (n-1)/2:(n+1)/2;
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
        if(mid<1 || mid>n || mid==n){
            System.out.print("List is empty");
            sc.close();
            return;
        }
        head = deleteFromBeginning(head, mid);
        
        Node iter = head;
        while(iter!=null){
            System.out.print(iter.val+" ");
            iter=iter.next;
        }
        sc.close();
    }
}
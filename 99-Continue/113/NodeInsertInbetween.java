import java.util.*;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}

public class NodeInsertInbetween{
     static void insertAtEnd(Node head, int val){
        Node current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next=new Node(val);
    }
    
     static Node insertInBetween(Node head, int ind, int val){
        if(ind==1){
            Node newNode = new Node(val);
            newNode.next = head;
            return newNode;
        }
        Node current = head;
        while(ind>2){
            current=current.next;
            ind--;
        }
        
        Node newNode = new Node(val);
        newNode.next = current.next;
        current.next = newNode;
        
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
        int val = sc.nextInt();
        head = insertInBetween(head, ind, val);
        
        Node iter = head;
        
        while(iter!=null){
            System.out.print(iter.val+" ");
            iter=iter.next;
        }
        sc.close();
        
    }
}
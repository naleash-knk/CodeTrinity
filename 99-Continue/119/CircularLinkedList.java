import java.util.*;

public class CircularLinkedList {
    
    static void insertAtEnd(Node head, int val){
        Node current = head;
        while(current.next!=head){
            current = current.next;
        }
        Node newNode = new Node(val);
        newNode.next = head;
        current.next =newNode;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Node head = null;
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            if(head == null){
                Node newNode = new Node(val);
                head = newNode;
                head.next=head;
                
            }else{
                insertAtEnd(head, val);
            }
        }
        
        Node iter = head;
        
        while(iter.next!=head){
            System.out.print(iter.val+" ");
            iter = iter.next;
        }
        System.out.print(iter.val+" ");

        sc.close();
    }
}

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
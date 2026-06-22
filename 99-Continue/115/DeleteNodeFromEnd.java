import java.util.*;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}

public class DeleteNodeFromEnd {
    static void insertAtEnd(Node head,int val){
        Node current = head;
        while(current.next!=null){
            current=current.next;
        }
        current.next = new Node(val);
    }
    
    static void deleteFromEnd(Node head,int len){
        Node current = head;
        while(len>1){
            current=current.next;
            len--;
        }
        
        current.next = null;
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
        int del_n = sc.nextInt();
        int len = n-del_n;
        if(len<=0){
            System.out.print("List is empty");
            sc.close();
            return;
        }
        deleteFromEnd(head, len);
        
        Node iter = head;
        while(iter!=null){
            System.out.print(iter.val+" ");
            iter = iter.next;
        }
        sc.close();
    }
}
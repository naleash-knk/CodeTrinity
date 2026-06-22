import java.util.*;

class Node{
    Node next;
    int val;
    Node(int val){
        this.next = null;
        this.val=val;
    }
}

public class NodeInsertBegin {
    static Node insertAtBegin(Node head, int val){
        Node newNode = new Node(val);
        newNode.next = head;
        return newNode;
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
                head = insertAtBegin(head,val);
            }
        }
        
        Node iter = head;
        while(iter!=null){
            System.out.print(iter.val+" ");
            iter = iter.next;
        }
        
        sc.close();
        
    }
}
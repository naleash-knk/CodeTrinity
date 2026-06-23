import java.util.*;

class Node{
    int val;
    Node next;
    Node prev;
    Node(int val){
        this.val = val;
    }
}

public class DeleteNodeFromLast {
    static Node head = null;
    static Node tail = null;
    static void insertAtEnd(Node head,int val){
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    static void deleteNodeFromLast(Node tail, int ind){
        Node current = tail;
        while(current.prev!=null && ind>1){
            current=current.prev;
            ind--;
        }
        if (head == tail) {
            head = tail = null;
        }
        else if (current == head) {
            head = head.next;
            head.prev = null;
        }
        else if (current == tail) {
            tail = tail.prev;
            tail.next = null;
        }
        else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            if(head==null && tail==null){
                head = new Node(val);
                tail=head;
            }
            else{
                insertAtEnd(head, val);
            }
        }
        int ind = sc.nextInt();
    
        if(ind<1 || ind>=n || head == null){
            System.out.println("List is empty");
            sc.close();
            return;
        }
        deleteNodeFromLast(tail, ind);
        Node iter = head;
        while(iter!=null){
            System.out.print(iter.val+" ");
            iter=iter.next;
        }
        sc.close();
    }
}
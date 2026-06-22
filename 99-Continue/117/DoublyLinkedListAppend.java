import java.util.*;


public class DoublyLinkedListAppend {
    static void insertAtEnd(Node head, int val){
        Node current = head;
        while(current.next!=null){
            current=current.next;
        }
        Node newNode = new Node(val);
        newNode.prev = current;
        current.next = newNode;
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
        Node iter = head;
        while(iter.next!=null){
            System.out.print(iter.val+" ");
            iter=iter.next;
        }
        System.out.println(iter.val+" ");
        while(iter.prev!=null){
            System.out.print(iter.val+" ");
            iter=iter.prev;
        }
        System.out.print(iter.val);

        sc.close();
    }
}


class Node{
    int val;
    Node prev;
    Node next;
    Node(int val){
        this.val = val;
        this.prev = null;
        this.next=null;
    }
}
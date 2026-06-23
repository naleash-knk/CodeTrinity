import java.util.*;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

public class RemoveDupliatesFromLinkedList {
    static Node head = null;
    
    static void insertAtEnd(int val){
        Node current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next = new Node(val);
    }
    
    static void removeDuplicates(){
        Node current = head;
        List<Integer> lst = new ArrayList<>();
        lst.add(current.val);
        while(current.next!=null){
            if(!lst.contains(current.next.val)){
                lst.add(current.next.val);
                current=current.next;
            }
            else{
                if(current.next.next!=null){
                current.next=current.next.next;
                }
                else{
                    current.next=null;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            if(head==null){
                head = new Node(val);
            }
            else{
                insertAtEnd(val);
            }
        }
        removeDuplicates();
        Node iter = head;
        while(iter!=null){
            System.out.print(iter.val+" ");
            iter=iter.next;
        }
        sc.close();
    }
}
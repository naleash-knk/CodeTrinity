import java.util.*;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

public class CommonIdentifier {
    static Node head1=null;
    static Node head2=null;
    
    static void insertAtEnd(Node head,int val){
        Node current = head;
        while(current.next!=null){
            current=current.next;
        }
        current.next = new Node(val);
    }
    
    static void commonIdentifier(Node head1,Node head2){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        Node current1 = head1;
        Node current2 = head2;
        
        while(current1!=null){
            set1.add(current1.val);
            current1=current1.next;
        }
        while(current2!=null){
            set2.add(current2.val);
            current2=current2.next;
        }
        
        set1.retainAll(set2);
        
        if(set1.isEmpty()){
            System.out.println("No Intersection");
        }
        else{
            for(Integer i:set1){
                System.out.print(i+" ");
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            if(head1==null){
                head1=new Node(val);
            }
            else{
                insertAtEnd(head1, val);
            }
        }
        int m = sc.nextInt();
        for(int i=0;i<m;i++){
            int val = sc.nextInt();
            if(head2==null){
                head2=new Node(val);
            }
            else{
                insertAtEnd(head2, val);
            }
        }
        commonIdentifier(head1, head2);
    }
}
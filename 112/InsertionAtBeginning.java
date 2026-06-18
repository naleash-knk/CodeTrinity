import java.util.*;

class Node{
    Node next;
    int val;
    Node(int n){
        this.next = null;
        this.val = n;
    }
}

public class InsertionAtBeginning {
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
            head = insertBegin(head,k);
        }

        Node iter = head;

        while(iter!=null){
            System.out.print(iter.val+" ");
            iter=iter.next;
        }
        sc.close();

    }

    static Node insertBegin(Node head,int n){
        Node newNode = new Node(n);
        newNode.next = head;

        return newNode;
    }
}
    

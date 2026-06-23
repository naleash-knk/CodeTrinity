import java.util.*;

public class PalindromeChecker {
    static Node head=null;
    static Node tail=null;
    
    static void insertAtEnd(int val){
        Node newNode= new Node(val);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    
    static boolean palindromeChecker(Node head){
        Node current1 = head;
        Node current2 = tail;
        while(current1!=null && current2!=null){
            if(current1.val!=current2.val){
                return false;
            }
            current1=current1.next;
            current2=current2.prev;
        }
        
        if(current1!=null || current2!=null){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            insertAtEnd(val);
        }
        if(palindromeChecker(head)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
        sc.close();
    }
}

 class Node{
    int val;
    Node next;
    Node prev;
    Node(int val){
        this.val = val;
    }
}
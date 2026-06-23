import java.util.*;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next=null;
    }
}

public class SortAndMergeLinkedListNodes {
    
    static Node head1=null;
    static Node head2=null;
    static int[] arr;
    
    static void insertAtEnd(Node head, int val){
        Node newNode = new Node(val);
        Node current = head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }
    
    static Node mergeLinkedList(Node head1, Node head2){
        Node current1 = head1;
        Node current2 = head2;
        int i=0;
        while(current1.next!=null&&i<arr.length){
            arr[i]=current1.val;
            i++;
            current1=current1.next;
        }
        arr[i]=current1.val;
        i++;
        while(current2.next!=null&&i<arr.length){
            arr[i]=current2.val;
            i++;
            current2=current2.next;
        }
        arr[i]=current2.val;
        i++;
        
        Arrays.sort(arr);
        
        Node result = null;
        for(int j=0;j<arr.length;j++){
            if(result==null){
                result = new Node(arr[j]);
            }
            else{
                insertAtEnd(result, arr[j]);
            }
        }
        
        return result;
        
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            if(head1==null){
                head1 = new Node(val);
            }
            else{
                insertAtEnd(head1, val);
            }
        }
        
        int m = sc.nextInt();
        for(int i=0;i<m;i++){
            int val=sc.nextInt();
            if(head2==null){
                head2 = new Node(val);
            }
            else{
                insertAtEnd(head2, val);
            }
        }
        arr = new int[n+m];
        Node iter = mergeLinkedList(head1, head2);
        while(iter!=null){
            System.out.print(iter.val+" ");
            iter=iter.next;
        }
        sc.close();
    }
}
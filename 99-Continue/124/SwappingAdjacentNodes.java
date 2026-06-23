import java.util.*;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class SwappingAdjacentNodes {

    static Node head = null;
    static Node tail = null;

    static void insertAtEnd(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    static Node swapAdjacentElements(Node head) {
        Node current = head;

        while (current != null && current.next != null) {
            int temp = current.val;
            current.val = current.next.val;
            current.next.val = temp;

            current = current.next.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            insertAtEnd(val);
        }

        head = swapAdjacentElements(head);

        Node iter = head;

        while (iter != null) {
            System.out.print(iter.val + " ");
            iter = iter.next;
        }

        sc.close();
    }
}
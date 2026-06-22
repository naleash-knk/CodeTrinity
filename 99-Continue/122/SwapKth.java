import java.util.*;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class SwapKth {

    static void insertAtEnd(Node head, int val) {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(val);
    }

    static void swapKth(Node head, int n, int k) {

        if (k < 1 || k > n) {
            return;
        }

        int fromEnd = n - k + 1;

        if (k == fromEnd) {
            return;
        }

        Node first = head;
        for (int i = 1; i < k; i++) {
            first = first.next;
        }

        Node second = head;
        for (int i = 1; i < fromEnd; i++) {
            second = second.next;
        }

        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null;

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();

            if (head == null) {
                head = new Node(val);
            } else {
                insertAtEnd(head, val);
            }
        }

        int k = sc.nextInt();

        swapKth(head, n, k);

        Node current = head;
        while (current != null) {
            System.out.print(current.val+" ");
            current = current.next;
        }

        sc.close();
    }
}
import java.util.*;

class Node {
    int val;
    Node prev;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class AddTwoLinkedList {

    static Node head1 = null;
    static Node tail1 = null;
    static Node head2 = null;
    static Node tail2 = null;

    public static void insertAtEnd_1(int val) {
        Node newNode = new Node(val);
        if (head1 == null) {
            head1 = tail1 = newNode;
            return;
        }
        tail1.next = newNode;
        newNode.prev = tail1;
        tail1 = newNode;
    }

    public static void insertAtEnd_2(int val) {
        Node newNode = new Node(val);
        if (head2 == null) {
            head2 = tail2 = newNode;
            return;
        }
        tail2.next = newNode;
        newNode.prev = tail2;
        tail2 = newNode;
    }

    static void addNodes() {
        String res = "";
        Node current1 = tail1;
        Node current2 = tail2;

        int carry = 0;

        while (current1 != null || current2 != null) {

            int sum = carry;

            if (current1 != null) {
                sum += current1.val;
                current1 = current1.prev;
            }

            if (current2 != null) {
                sum += current2.val;
                current2 = current2.prev;
            }

            res = (sum % 10) + " " + res;
            carry = sum / 10;
        }

        if (carry > 0) {
            res = carry + " " + res;
        }

        System.out.println(res.trim());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int val = sc.nextInt();
            insertAtEnd_1(val);
        }

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            insertAtEnd_2(val);
        }
        if (tail1 == null && tail2 == null) {
            System.out.println("List is Empty");
            sc.close();
            return;
        }

        addNodes();

        sc.close();
    }
}
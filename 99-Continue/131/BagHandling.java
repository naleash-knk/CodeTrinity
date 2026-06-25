import java.util.*;

public class BagHandling {
    static Node head = null;;

    static void push(int val) {
        if (head == null) {
            head = new Node(val);
            return;
        }
        if (size() > 100) {
            System.out.println("Stack Overflow");
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(val);
    }

    static void pop() {
        if (head == null) {
            System.out.println("Stack Underflow");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    static int peak() {
        if (head == null) {
            return -1;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.val;
    }

    static int size() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    static boolean isEmpty() {
        if(head == null) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> outputs = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String query = sc.nextLine().trim();
            String[] querarr = query.split(" ");
            switch (querarr[0]) {
                case "Push":
                    push(Integer.parseInt(querarr[1]));
                    break;
                case "Pop":
                    pop();
                    break;
                case "Top":
                    if (peak() == -1) {
                        outputs.add("Stack Underflow");
                    } else {
                        outputs.add(peak() + "");
                    }
                    break;
                case "Size":
                    outputs.add(size() + "");
                    break;
                case "IsEmpty":
                    outputs.add(isEmpty() + "");
                    break;
            }
        }
        for (String str : outputs) {
            System.out.println(str);
        }
        sc.close();
    }
}


class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}
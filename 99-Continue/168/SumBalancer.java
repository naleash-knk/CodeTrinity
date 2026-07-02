import java.util.*;

public class SumBalancer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = sc.nextLine().split(" ");

        BinaryTree tree = new BinaryTree();
        tree.buildTree(arr);

        System.out.println(tree.sumBalancer() ? "Yes" : "No");

        sc.close();
    }
}

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

class BinaryTree {

    Node root;

    Node buildTree(String[] arr) {

        if (arr.length == 0)
            return null;

        root = new Node(Integer.parseInt(arr[0]));

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;

        while (!queue.isEmpty() && i < arr.length) {

            Node current = queue.poll();

            if (i < arr.length && !arr[i].equals("null")) {
                current.left = new Node(Integer.parseInt(arr[i]));
                queue.offer(current.left);
            }
            i++;

            if (i < arr.length && !arr[i].equals("null")) {
                current.right = new Node(Integer.parseInt(arr[i]));
                queue.offer(current.right);
            }
            i++;
        }

        return root;
    }

    boolean sumBalancer() {
        return check(root).isSumTree;
    }

    private Pair check(Node node) {

        if (node == null)
            return new Pair(true, 0);

        if (node.left == null && node.right == null)
            return new Pair(true, node.data);

        Pair left = check(node.left);
        Pair right = check(node.right);

        boolean ok = left.isSumTree &&
                     right.isSumTree &&
                     node.data == left.sum + right.sum;

        return new Pair(ok, node.data + left.sum + right.sum);
    }

    class Pair {
        boolean isSumTree;
        int sum;

        Pair(boolean isSumTree, int sum) {
            this.isSumTree = isSumTree;
            this.sum = sum;
        }
    }
}
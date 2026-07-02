import java.util.*;

public class LCA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String s = sc.nextLine();
        String[] arr = s.split(" ");

        BinaryTree tree = new BinaryTree();
        tree.buildTree(arr);

        String s2 = sc.nextLine();
        String[] sarr = s2.split(" ");

        System.out.println(tree.leastCommanAncestor(sarr));

        sc.close();
    }
}

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {

    Node root;

    BinaryTree() {
        root = null;
    }

    Node buildTree(String[] arr) {

        if (arr.length == 0 || arr[0].equals("null"))
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

    int leastCommanAncestor(String[] arr) {

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        Node ans = lca(root, a, b);

        return ans == null ? -1 : ans.data;
    }

    Node lca(Node root, int a, int b) {

        if (root == null)
            return null;

        if (root.data == a || root.data == b)
            return root;

        Node left = lca(root.left, a, b);
        Node right = lca(root.right, a, b);

        if (left != null && right != null)
            return root;

        return (left != null) ? left : right;
    }
}
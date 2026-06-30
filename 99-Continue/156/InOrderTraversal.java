import java.util.*;

public class InOrderTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        BinaryTree tree = new BinaryTree();
        tree.buildTree(n, sc);
        tree.inOrderTraversal(tree.root);
        sc.close();
    }
}

class BinaryTree{
    Node root;
    BinaryTree(){
        this.root = null;
    }
    
    Node buildTree(int n, Scanner sc) {
        String[] strarr = sc.nextLine().split(" ");

        if (strarr.length == 0)
            return null;

        root = new Node(Integer.parseInt(strarr[0]));

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;

        while (!queue.isEmpty() && i < strarr.length) {

            Node current = queue.poll();

            if (i < strarr.length) {
                if (!strarr[i].equals("null")) {
                    current.left = new Node(Integer.parseInt(strarr[i]));
                    queue.offer(current.left);
                }
                i++;
            }

            if (i < strarr.length) {
                if (!strarr[i].equals("null")) {
                    current.right = new Node(Integer.parseInt(strarr[i]));
                    queue.offer(current.right);
                }
                i++;
            }
        }

        return root;
    }
    
    void inOrderTraversal(Node root){
        if(root!=null){
            inOrderTraversal(root.left);
            System.out.print(root.val+" ");
            inOrderTraversal(root.right);
        }
    }
}

class Node{
    Node left,right;
    int val;
    Node(int val){
        this.val = val;
    }
}
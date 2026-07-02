import java.util.*;

public class DepthBinaryTree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        tree.buildTree(s.split(" "),sc);
        System.out.println(tree.depthFinder());
        sc.close();
        
    }
}

class BinaryTree{
    Node root;
    BinaryTree(){
        this.root = null;
    }
    
    Node buildTree(String[] arr,Scanner sc){
        if(arr.length==0 || arr[0].equals("null")){
            return root;
        }
        root = new Node(Integer.parseInt(arr[0]));
        int i=1;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()&&i<arr.length){
            Node current = queue.poll();
            if(i<arr.length){
                if(!arr[i].equals("null")){
                    current.left = new Node(Integer.parseInt(arr[i]));
                    queue.offer(current.left);
                }
                i++;
            }
            if(i<arr.length){
                if(!arr[i].equals("null")){
                    current.right = new Node(Integer.parseInt(arr[i]));
                    queue.offer(current.right);
                }
                i++;
            }
        }
        
        return root;
    }
    
    int depthFinder() {
    if (root == null)
        return 0;

    Queue<Node> queue = new LinkedList<>();
    queue.offer(root);

    int depth = 0;

    while (!queue.isEmpty()) {

        int size = queue.size();

        while (size-- > 0) {
            Node current = queue.poll();

            if (current.left != null)
                queue.offer(current.left);

            if (current.right != null)
                queue.offer(current.right);
        }

        depth++;
    }

    return depth;
}
}

class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
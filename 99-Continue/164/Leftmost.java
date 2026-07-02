import java.util.*;

public class Leftmost {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        BinaryTree tree = new BinaryTree();
        tree.buildTree(arr);
        System.out.println(tree.leftMost());
        sc.close();
    }
}

class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
}

class BinaryTree{
    Node root;
    BinaryTree(){
        this.root = null;
    }
    
    Node buildTree(String[] arr){
        if(arr.length==0){
            return root;
        }
        root = new Node(Integer.parseInt(arr[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int i=1;
        while(!queue.isEmpty()&&i<arr.length){
            Node current = queue.poll();
            if(i<arr.length && !arr[i].equals("null")){
                current.left = new Node(Integer.parseInt(arr[i]));
                queue.offer(current.left);
            }
            i++;
            if(i<arr.length && !arr[i].equals("null")){
                current.right = new Node(Integer.parseInt(arr[i]));
                queue.offer(current.right);
            }
            i++;
        }
        return root;
    }
    
    int leftMost(){
        if(root==null){
            return 0;
        }
        Node current = root;
        
        while(current.left!=null){
            current=current.left;
        }
        return current.data;
    }
}
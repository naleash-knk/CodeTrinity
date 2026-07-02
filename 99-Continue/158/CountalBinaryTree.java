import java.util.*;

public class CountalBinaryTree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BinaryTree tree  = new BinaryTree();
        tree.buildTree(n, sc);
        System.out.println(tree.countNodes());
        sc.close();
    }
}

class Node{
    Node left, right;
    int data;
    Node(int val){
        this.data = val;
    }
}

class BinaryTree{
    Node root;
    BinaryTree(){
        this.root = null;
    }
    
    Node buildTree(int n, Scanner sc){
        if(n==0){
            return root;
        }
        root = new Node(sc.nextInt());
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int i =1;
        while (!queue.isEmpty() && i<n){
            Node current = queue.poll();
            
            if(i<n){
                current.left = new Node(sc.nextInt());
                queue.offer(current.left);
                i++;
            }
            if(i<n){
                current.right = new Node(sc.nextInt());
                queue.offer(current.right);
                i++;
            }
        }
   
        return root;
    }
    
    int countNodes(){
        int count=0;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        count++;
        while(!queue.isEmpty()){
            Node current = queue.poll(); 
            if(current.left!=null){
                queue.offer(current.left);
                count++;
            }
            if(current.right!=null){
                queue.offer(current.right);
                count++;
            }
        }
        return count;
    }
}


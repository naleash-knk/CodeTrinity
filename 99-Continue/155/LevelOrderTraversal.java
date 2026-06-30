import java.util.*;

public class LevelOrderTraversal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BinaryTree tree = new BinaryTree();
        
        tree.buildTree(n, sc);
        tree.levelOrderTraversal();
        sc.close();
    }
}

class Node{
        Node left,right;
        int data;
        Node(int val){
            this.data = val;
        }
    }
    
    class BinaryTree{
        Node root;
        BinaryTree(){
            root = null;
        }
        
        Node buildTree(int n,Scanner sc){
            if(n==0){
                return null;
            }
            
            root = new Node(sc.nextInt());
            int count = 1;
            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);
            
            while(count<n){
                Node current = queue.poll();
                if(count<n){
                    current.left = new Node(sc.nextInt());
                    queue.offer(current.left);
                    count++;
                }
                if(count<n){
                    current.right = new Node(sc.nextInt());
                    queue.offer(current.right);
                    count++;
                }
            }
            return root;
        }
        
        void levelOrderTraversal(){
            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);
            while(!queue.isEmpty()){
                Node current = queue.poll();
                System.out.print(current.data+" ");
                if(current.left!=null){
                    queue.offer(current.left);
                }
                if(current.right!=null){
                    queue.offer(current.right);
                }
            }
        }
    }
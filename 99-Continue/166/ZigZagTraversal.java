
import java.util.*;

public class ZigZagTraversal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String[] strarr = s.split(" ");
        BinaryTree tree = new BinaryTree();
        tree.buildTree(strarr);
        tree.printTree();
        sc.close();
    }
}

class Node{
    int data;
    Node left,right;
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
        int i =1;
        while(!queue.isEmpty() && i<arr.length){
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
    
    void printTree(){
        if(root==null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        System.out.print(root.data);
        while(!queue.isEmpty()){
            System.out.println();
            int size = queue.size();
                while(size-->0){
                Node current = queue.poll();
               
                if(current.right!=null){
                    if(current.left!=null){
                        queue.offer(current.left);
                    }
                    System.out.print(current.right.data+" ");
                }
                 if(current.left!=null){
                    if(current.right!=null){
                        queue.offer(current.right);
                    }
                    System.out.print(current.left.data+" ");
                }
            }
            System.out.println();
            int size0 = queue.size();
                while(size0-->0){
                Node current = queue.poll();
                 if(current.left!=null){
                    queue.offer(current.left);
                    System.out.print(current.left.data+" ");
                }
                
                if(current.right!=null){
                    queue.offer(current.right);
                    System.out.print(current.right.data+" ");
                }
            }
           
        }
    }
}
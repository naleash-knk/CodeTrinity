import java.util.*;

public class RightTraversal {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       sc.nextLine();
       String s = sc.nextLine();
       String[] strarr = s.split(" ");
       BinaryTree tree = new BinaryTree();
       tree.buildTree(strarr);
       tree.rightTraversal();
       sc.close();
    }
}

class Node{
    int data;
    Node left, right;
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
        
        Queue<Node> queue = new LinkedList<>();
        root = new Node(Integer.parseInt(arr[0]));
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
    
    void rightTraversal(){
        if(root==null){
            return;
        }
        
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        System.out.print(root.data+" ");
        while(!queue.isEmpty()){
            int size=queue.size();
            int val = -1;
            while(size-->0){
                Node current = queue.poll();
                if(current.left!=null){
                    queue.offer(current.left);
                    val = current.left.data;
                }
                if(current.right!=null){
                    queue.offer(current.right);
                    val=current.right.data;
                }
            }
            if(val!=-1){
                System.out.print(val+" ");
            }
            
        }
    }
}











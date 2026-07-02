import java.util.*;

public class PreOrderTraversal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        String[] strarr = str.split(" ");
        
        BinaryTree tree = new BinaryTree();
        tree.buildTree(strarr);
        tree.preOrderTraversal(tree.root);
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
        this.root = null;
    }
    
    Node buildTree(String[] arr){
        if(arr.length==0){
            return null;
        }
        root = new Node(Integer.parseInt(arr[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int i=1;
        while(!queue.isEmpty()&&i<arr.length){
            Node current = queue.poll();
            if(current.left==null){
                if(Integer.parseInt(arr[i])!=-1){
                    current.left = new Node(Integer.parseInt(arr[i]));
                    queue.offer(current.left);
                }
                i++;  
            }
            if(current.right==null){
                if(Integer.parseInt(arr[i])!=-1){
                    current.right = new Node(Integer.parseInt(arr[i]));
                    queue.offer(current.right);
                }
                i++;
            }
        }
        return root;
    }
    
    void preOrderTraversal(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }
    
}

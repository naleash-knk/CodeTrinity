import java.util.*;

public class LeftHander {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       sc.nextLine();
       String s = sc.nextLine();
       String[] strarr = s.split(" ");
       BinaryTree tree = new BinaryTree();
       tree.buildTree(strarr);
       System.out.println(tree.sumLefter());
       sc.close();
    }
}

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=this.right=null;
    }
}

class BinaryTree{
    Node root;
    BinaryTree(){
        this.root=null;
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
    
    int sumLefter(){

        int sum=0;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            Node current = queue.poll();
            if(current.left!=null){
                queue.offer(current.left);
                if(current.left.left==null && current.left.right==null){
                    sum+=current.left.data;
                }
            }
            if(current.right!=null){
                queue.offer(current.right);
               
            }
        }
        return sum;
    }
}
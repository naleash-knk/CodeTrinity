import java.util.*;

public class RTL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        List<Integer> lst = new ArrayList<>();
        BinaryTree tree = new BinaryTree();
        tree.buildTree(arr);
        tree.rootToLeafSum(tree.root, "",lst);
        int sum = 0;
        for(int i:lst){
            sum+=i;
        }
        System.out.println(sum);
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
        if(arr.length ==0){
            return root;
        }
        Queue<Node> queue = new LinkedList<>();
        root=new Node(Integer.parseInt(arr[0]));
        queue.offer(root);
        int i = 1;
        while(!queue.isEmpty()&&i<arr.length){
            Node current = queue.poll();
            if(i<arr.length&&!arr[i].equals("null")){
                current.left = new Node(Integer.parseInt(arr[i]));
                queue.offer(current.left);
            }
            i++;
            if(i<arr.length&&!arr[i].equals("null")){
                current.right = new Node(Integer.parseInt(arr[i]));
                queue.offer(current.right);
            }
            i++;
        }
        return root;
    }
    
    
    
    void rootToLeafSum(Node root,String s,List<Integer> lst){
        if(root==null) return;
        s+=root.data;
        if(root.left!=null){
            rootToLeafSum(root.left,s,lst);
        }
        if(root.right!=null){
            rootToLeafSum(root.right,s,lst);
        }
        
        if(root.left==null && root.right==null){
           lst.add(Integer.parseInt(s));
        }
        
    }
}
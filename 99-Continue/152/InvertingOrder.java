import java.util.*;

public class InvertingOrder {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> queue = new LinkedList<>();
        for(int i=0;i<n;i++){
            int k = sc.nextInt();
            queue.offer(k);
        }
        while(!queue.isEmpty()){
            System.out.print(queue.removeLast()+" ");
        }
        sc.close();
    }
}
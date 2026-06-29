import java.util.*;

public class OrderProcessingSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            switch(s.split(" ")[0]){
                case "push"->{
                    pq.offer(Integer.parseInt(s.split(" ")[1]));
                    System.out.println("Order added: "+s.split(" ")[1]);
                }
                case "peek"->{
                    System.out.println("Next order: "+pq.peek());
                }
                case "pop"->{
                    System.out.println("Order processed: "+pq.poll());
                }
                case "empty"->{
                    System.out.println("Is queue empty: "+pq.isEmpty());
                }
            }
        }
        sc.close();
    }
}
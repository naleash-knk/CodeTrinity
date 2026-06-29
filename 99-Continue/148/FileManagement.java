import java.util.*;

public class FileManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            
            switch(s.split(" ")[0]){
                case "push"->{
                    pq.offer(Integer.parseInt(s.split(" ")[1]));
                    System.out.println("Pushed: "+s.split(" ")[1]);
                }
                case "top"->{
                    System.out.println("Top version: "+pq.peek());
                }
                case "pop"->{
                    System.out.println("Popped: "+pq.poll());
                }
                case "empty"->{
                    System.out.println("Is stack empty: "+pq.isEmpty());
                }
            }
            
        }
        sc.close();
    }
}
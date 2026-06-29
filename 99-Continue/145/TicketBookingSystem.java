import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class TicketBookingSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Queue<String> queue = new ArrayBlockingQueue<>(size);
        
        int n= sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            
            switch(s.split(" ")[0]){
                case "ENQUEUE" -> {
                    if (!queue.offer(s.split(" ")[1])) {
                        System.out.println("Queue is full. Cannot add " + s.split(" ")[1]);
                    }
                }
                case "DISPLAY" -> {
                    if(queue.isEmpty()){
                        System.out.println("Queue is empty.");
                    }
                    else{
                        System.out.print("Current Queue: ");
                        for(String q:queue){
                            System.out.print(q+" ");
                        }
                        System.out.println();
                    }
                }
                case "DEQUEUE" -> {
                    if(queue.isEmpty()){
                        System.out.println("Served Customer: Queue is empty. No customer to serve.");
                    }
                    else{
                        System.out.println("Served Customer: "+queue.poll());
                    }
                }
            }
        }
        sc.close();
    }
}
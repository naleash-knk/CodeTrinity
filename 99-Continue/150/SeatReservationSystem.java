import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class SeatReservationSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        Queue<Integer> queue = new ArrayBlockingQueue<>(size);
        int n =sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            switch(s.split(" ")[0]){
                case "enqueue"->{
                    if(queue.size()<size){
                        queue.offer(Integer.parseInt(s.split(" ")[1]));
                        System.out.println("Booked seat: "+s.split(" ")[1]);
                    }
                    else{
                        System.out.println("Booking failed");
                    }
                }
                case "dequeue"->{
                    if(queue.isEmpty()){
                        System.out.println("No booking to cancel");
                    }
                    else{
                        System.out.println("Canceled seat: "+queue.poll());
                    }
                }
                case "front"->{
                    if(queue.isEmpty()){
                        System.out.println("No bookings");
                    }
                    else{
                    System.out.println("Next seat to be canceled: "+queue.peek());
                    }
                }
                case "isEmpty"->{
                    System.out.println(queue.isEmpty());
                }
                case "isFull"->{
                    if(queue.size()==size){
                        System.out.println(true);
                    }
                    else{
                        System.out.println(false);
                    }
                }
            }
        }
        sc.close();
    }
}
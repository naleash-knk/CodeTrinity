import java.util.*;

public class CustomerSupportSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();
        int n = sc.nextInt();
        sc.nextLine();
        String[] strarr = new String[n];
        for(int i=0;i<n;i++){
            strarr[i]= sc.nextLine();
        }
        for(String s:strarr){
             switch(s.split(" ")[0]){
                case "INVALIDCOMMAND" -> {
                    System.out.println("Invalid command.");
                }
                case "ENQUEUE" -> {
                    queue.offer(s.split(" ")[1]);
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
                        System.out.println("Queue is empty.");
                    }
                    else{
                        System.out.println("Processed Ticket: "+queue.poll());
                    }
                }
            }
        }
        sc.close();
    }
}
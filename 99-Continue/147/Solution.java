
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,List<String>> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = sc.nextInt();
        sc.nextLine();
        
        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            
            switch(s.split(" ")[0]){
                case "ENQUEUE"->{
                    int key = Integer.parseInt(s.split(" ")[2]);
                    pq.offer(key);
                    if(map.containsKey(key)){
                        List<String> ls = map.get(key);
                        ls.add(s.split(" ")[1]);
                        map.put(key,ls);
                    }
                    else{
                        List<String> ls = new ArrayList<>();
                        ls.add(s.split(" ")[1]);
                        map.put(key,ls);
                    }
                }
                case "DISPLAY"->{
                    if(pq.isEmpty()){
                        System.out.println("Queue is empty.");
                    }
                    else{
                        System.out.print("Current Queue: ");
                        PriorityQueue<Integer> temp =new PriorityQueue<>(pq);
                        while(!temp.isEmpty()){
                            int q=temp.poll();
                            List<String> ls=map.get(q);
                            for(String name:ls)
                                System.out.print(name+"("+q+") ");
                            }
                        }
                    System.out.println();
                }
                case "DEQUEUE"->{
                    if(pq.isEmpty()){
                        System.out.println("Queue is empty.");
                    }
                    else{
                        int val = pq.poll();
                        List<String> ls = map.get(val);
                        System.out.println("Treated Patient: "+ls.get(0));
                        ls.remove(0);
                        map.put(val,ls);
                    }
                }
            }
            
            
            
        }
        sc.close();
    }
}
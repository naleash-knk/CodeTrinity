import java.util.*;

public class BinaryCodeGeneration {
    
    static String binaryGenerator(int n){
        Queue<Integer> queue = new LinkedList<>();
        while(n>0){
            int bit = n%2;
            queue.offer(bit);
            n/=2;
        }
        String result = "";
        while(!queue.isEmpty()){
            result=queue.poll()+result;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i!=1){
                System.out.print(", ");
            }
            System.out.print(binaryGenerator(i));
        }
        sc.close();
        
    }
}
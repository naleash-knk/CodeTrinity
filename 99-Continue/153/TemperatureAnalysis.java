import java.util.*;

public class TemperatureAnalysis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        LinkedList<Integer> ls = new LinkedList<>();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        
        int n = sc.nextInt();
        for(int i:arr){
            if(ls.size()<n){
                ls.addLast(i);
            }
            if(ls.size()==n){
                System.out.print(Collections.max(ls)+" ");
                ls.removeFirst();
            }
        }
        sc.close();
    }
}
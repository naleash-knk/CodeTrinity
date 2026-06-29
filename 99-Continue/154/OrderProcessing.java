import java.util.*;

public class OrderProcessing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ls = new LinkedList<>();
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int n = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(ls.size()<n){
                ls.addFirst(arr[i]);
            }
            else{
                ls.addLast(arr[i]);
            }
        }
        
        for(int i :ls){
            System.out.print(i+" ");
        }
        sc.close();
    }
}
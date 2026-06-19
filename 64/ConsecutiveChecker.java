import java.util.*;

public class ConsecutiveChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        int a = arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]!=a){
                System.out.println(0);
                return;
            }
            a++;
        }

        System.out.println(1);
        sc.close();
    }
    
}

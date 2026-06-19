import java.util.*;

public class ThreeModChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%3==0){
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}

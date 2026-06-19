import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n-1];

        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }

        

        for(int i=1;i<=n-1;i++){
            boolean check = false;
            for(int j=0;j<n-1;j++){
                if(arr[j]==i){
                    check=true;
                    break;
                }
            }
            if(!check){
                System.out.println(i);
                sc.close();
                return;
            }
        }

        sc.close();
    }
}

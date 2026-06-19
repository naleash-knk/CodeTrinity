import java.util.*;

public class InsertingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n+1];
        
        for(int i=0;i<n+1;i++){
            arr[i]=sc.nextInt();
        }
        
        int i=0;
        int j=n;
        while(i<n+1 && j>=0){
            if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                continue;
            }
            i++;
        }
        
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        
        sc.close();
        
    }
    
}

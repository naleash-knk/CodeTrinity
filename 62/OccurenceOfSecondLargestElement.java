import java.util.*;

public class OccurenceOfSecondLargestElement {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n   = sc.nextInt();
      int[] arr = new int[n];

      int l = Integer.MIN_VALUE;
      int sl = Integer.MAX_VALUE;
    
      for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>l){
                sl=l;
                l=arr[i];
            }
            else if(arr[i]>sl && arr[i]!=l){
                sl=arr[i];
            }
      }

      int count=0;
      for(int i=0;i<n;i++){
        if(arr[i]==sl){
            count++;
        }
      }

      System.out.println(count);
      sc.close();


    }
    
}

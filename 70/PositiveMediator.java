import java.util.*;

public class PositiveMediator {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);   
      int n = sc.nextInt();
      int[] arr = new int[n];
      int pos =0;
      for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
        if(arr[i]>0){
          pos++;
        }
      }

      if(pos==0){
        System.out.println(-1);
        sc.close();
        return;
      }

      int[] posarr = new int[pos];
      int j=0;
      for(int i=0;i<n;i++){
        if(arr[i]>0){
          posarr[j]=arr[i];
          j++;
        }
      }

      System.out.println(posarr[pos/2]);
      
      sc.close();

    }
}

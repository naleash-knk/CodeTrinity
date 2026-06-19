import java.util.*;

public class MaxSumOfArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int l = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

            if(arr[i]>l){
                sl=l;
                l=arr[i];
            }
            else if(arr[i]>sl){
                sl=arr[i];
            }
        }

        if(sl==Integer.MIN_VALUE){
            System.out.println(0);
            sc.close();
            return;
        }

        System.out.println(l+sl);
        sc.close();

    }
    
}

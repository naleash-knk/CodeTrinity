import java.util.*;

public class WheatherForecast {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        Stack<Integer> stack = new Stack<>();
        int[] resarr = new int[n];
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[i]>arr[stack.peek()]){
                resarr[stack.peek()]=i-stack.pop();
            }
            stack.push(i);
        }
        
        for(int i=0;i<resarr.length;i++){
            System.out.print(resarr[i]+" ");
        }
        
        sc.close();
    }
}
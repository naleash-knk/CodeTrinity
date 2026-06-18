import java.util.*;

public class InvertedTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String star = "* ";
        for(int i=n;i>=1;i--){
            for(int j=0;j<i;j++){
                System.out.print(star);
            }
            System.out.println();
        }
        sc.close();
    }
    
}

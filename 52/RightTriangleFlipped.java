import java.util.*;

public class RightTriangleFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String star = "* ";
        
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print("  ");
            }
            System.out.println(star);
            star+="* ";
        }
        sc.close();
    }
    
}

import java.util.Scanner;

public class HollowSquare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i>=2 && i<n && j>=2 && j<n){
                    System.out.print("  ");
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}

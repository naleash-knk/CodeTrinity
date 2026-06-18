import java.util.Scanner;

public class Timer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int width = (2*n)-1;

        for(int i=width;i>0;i-=2){
            int spacer = (int)(width-i)/2;
            for(int j=0;j<spacer;j++){
                System.out.print("  ");
            }
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            for(int j=0;j<spacer;j++){
                System.out.print("  ");
            }
            System.out.println();
        }

        for(int i=3;i<=width;i+=2){
            int spacer = (int)(width-i)/2;
            for(int j=0;j<spacer;j++){
                System.out.print("  ");
            }
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            for(int j=0;j<spacer;j++){
                System.out.print("  ");
            }
            System.out.println();
        }

        sc.close();
        
    }
}

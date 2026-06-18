import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String star = "* ";

        int j=0;
        for(int i=n;i>=1;i--){
            for(int k=0;k<j;k++){
                System.out.print("  ");
            }
            j++;
            for(int z=0;z<i;z++){
                System.out.print(star);
            }
            System.out.println();
        }
        sc.close();
    }
}
    


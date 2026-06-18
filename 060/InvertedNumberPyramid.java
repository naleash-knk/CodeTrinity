import java.util.Scanner;

public class InvertedNumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = (n*(n+1))/2;
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(num);
                if(j!=i-1){
                    System.out.print("*");
                }
                num--;
            }
            System.out.println();
        }
        sc.close();
    }
}

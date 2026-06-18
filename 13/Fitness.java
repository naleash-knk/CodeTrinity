import java.util.Scanner;

public class Fitness {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((int)(n*60));
        sc.close();
    }
}

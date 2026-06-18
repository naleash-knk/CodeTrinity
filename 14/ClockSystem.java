import java.util.Scanner;

public class ClockSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a*b;
        int res = product%12;
        if(res==0 && product!=0){
            res=12;
        }
        System.out.println(res);
        sc.close();
    }
}
    

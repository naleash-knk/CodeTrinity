import java.util.*;

public class CarpetCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int bre = sc.nextInt();

        System.out.printf("""
The required length is %d m
The required area of carpet is %d sqm
                """,(2*(len+bre)), (len*bre));

        sc.close();
    }
}
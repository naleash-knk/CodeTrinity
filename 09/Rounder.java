import java.util.*;

public class Rounder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        int c = (int)(Math.ceil(n));
        int f = (int)(Math.floor(n));


        System.out.println((int)n);
        System.out.println(c);
        System.out.println(f);

        sc.close();
    }
}
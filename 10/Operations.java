import java.util.*;

public class Operations{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float fn = sc.nextFloat();
        float sn = sc.nextFloat();

        System.out.printf("""
            Square Root of first number: %.1f
            First number raised to the power of second number: %.1f
            Absolute value of first number: %.1f
            Absolute value of second number: %.1f
                """,Math.sqrt(fn),Math.pow(fn, sn),fn,sn);
        sc.close();

    }
}

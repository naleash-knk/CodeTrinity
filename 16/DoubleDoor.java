import java.util.*;

public class DoubleDoor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Four Digit Integer");
        String s = sc.nextLine();
        int first = Integer.parseInt(s.charAt(0)+"");
        int second = Integer.parseInt(s.charAt(3)+"");

        System.out.println(first+second);
        sc.close();
    }
}


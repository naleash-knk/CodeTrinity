import java.util.*;

public class Greetings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Welcome, "+ name);
        sc.close();
    }
}
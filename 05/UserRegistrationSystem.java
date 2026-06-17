import java.util.*;

public class UserRegistrationSystem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();

        System.out.println("User Details: ");
        System.out.printf("""
                Name: %s
                Age: %d
                """,name,age);
        sc.close();
    }
}
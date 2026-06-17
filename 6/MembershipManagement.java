import java.util.*;

public class MembershipManagement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String member = sc.nextLine();
        String subscription = sc.nextLine();

        System.out.printf("""
            Member Name: %s
            Selected Membership: %s
            """,member,subscription);
        
        sc.close();
    }
}
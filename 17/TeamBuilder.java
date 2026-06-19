import java.util.*;

public class TeamBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int friends = sc.nextInt();
        int team = sc.nextInt();

        int leftOut = friends%team;
        int teamMembers = (friends-leftOut)/team;

        System.out.printf("The number of friends in each team is %d and left out is %d",teamMembers,leftOut);
        sc.close();
    }
}

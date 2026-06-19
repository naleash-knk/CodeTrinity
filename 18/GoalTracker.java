import java.util.*;

public class GoalTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int targetSteps = sc.nextInt();
        int completedSteps = sc.nextInt();
        int noOfDays = sc.nextInt();

        int yetToComplete = targetSteps-completedSteps;

        int averageIncrementStepsPerDay = yetToComplete/noOfDays;
        System.out.println(averageIncrementStepsPerDay);
        sc.close();
    }
}

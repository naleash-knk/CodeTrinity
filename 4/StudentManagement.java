import java.util.*;

public class StudentManagement {
    public static double truncate(float val){
        int temp = (int)(val*100);
        double result = (double)temp/100;
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age = sc.nextInt();
        float cgpa = sc.nextFloat();
        char grade = sc.next().charAt(0);

        System.out.printf("""
                Name: %s
                Age: %d
                CGPA: %.2f
                Grade: %c
                """, name, age, truncate(cgpa), grade);

        sc.close();
    }
}
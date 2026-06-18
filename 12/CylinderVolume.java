import java.util.*;

public class CylinderVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int h = sc.nextInt();
        float pi = 3.14f;

        System.out.println((int)Math.ceil(pi*r*r*h));
        sc.close();
    }
}
    


import java.util.*;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        
        int[][] mat_a = new int[row][col];
        int[][] mat_b = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat_a[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat_b[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print((mat_a[i][j]+mat_b[i][j])+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

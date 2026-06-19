import java.util.*;

public class ProfitAnalyzer {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int copiesSold = sc.nextInt();
        int costPerCopy = sc.nextInt();
        int costSpentPerCopy = sc.nextInt();

        int revenue =(copiesSold*costPerCopy);
        int totalCost = (copiesSold*costSpentPerCopy)+100;

        System.out.println(revenue-totalCost);
        sc.close();
    }
    
}



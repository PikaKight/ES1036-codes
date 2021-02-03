import java.util.Scanner;

public class mealCalculator {
    public static void main(String[] args){
        String fullName = "Marcus Tuen Muk";
        System.out.println(fullName);

        Scanner inputScan = new Scanner(System.in);
        double mealCost = inputScan.nextDouble();

        System.out.printf("$%.2f/person", (mealCost/5.0));
    }
}

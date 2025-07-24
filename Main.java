import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variable Initialization
        boolean valid = false;
        DecimalFormat formatter = new DecimalFormat("##.##");
        int month = 0;
        Scanner input = new Scanner(System.in);
        
        // Month Input
        while(!valid) {
            System.out.print("Enter the # of months AFTER June 2025: ");
            try {
                if(month >= 0) {
                    month = Integer.parseInt(input.nextLine());
                    valid = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input.");
            }
        }
        
        // Math Variables
        double debt1 = 5 * Math.pow(1.07, month);
        double debt2 = 15 * Math.pow(1.07, month - 2);
        System.out.println("Amount Due:\n$" + formatter.format(debt1 + debt2));
    }
}

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variable Initialization
        boolean valid = false;
        DecimalFormat formatter = new DecimalFormat("##.##");
        int month = 0;
        Scanner input = new Scanner(System.in);
        String minimumMonth;
        
        // Code Input
        System.out.print("Enter Code: ");
        String code = input.nextLine();
        CodeManager manager = new CodeManager(code.toUpperCase());
        minimumMonth = manager.getMinimum();
       
        // Month Input
        while(!valid) {
            System.out.println("Enter # of months after " + minimumMonth);
            String i = input.nextLine();
            try {
                if(Integer.parseInt(i) > 0) {
                    month = Integer.parseInt(i);
                    valid = true;
                }
            } catch(NumberFormatException e) {
                System.out.println("Invalid Input.");
            }
        }
        
        // Output
        CodeManager debtManager = new CodeManager(month, code);
        System.out.println("Amount Due:\n$" + formatter.format(debtManager.totalDebt()));
    }
}

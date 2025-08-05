public class CodeManager {
    private String code;
    private String minimumMonth;
    private int minimum;
    private int month;
    
    public CodeManager(String c) {
        code = c;
        
        if(code.equals("A0001")) {
            minimumMonth = "March 2025";
            minimum = 2;
        }
        if(code.equals("L0001")) {
            minimumMonth = "September 2023";
            minimum = 21;
        }
        if(code.equals("N0001")) {
            minimumMonth = "August 2025";
            minimum = 0;
        }
    }
    
    public CodeManager(int m, String c) {
        month = m;
        code = c;
    }
    
    public String getMinimumMonth() {
        return minimumMonth;
    }
    
    public int getMinimum() {
        return minimum;
    }
    
    public double totalDebt() {
        if(code.equals("A0001")) {
            double debt1 = 5 * Math.pow(1.07, month);
            double debt2 = 15 * Math.pow(1.07, month - 2);
            return (debt1 + debt2);
        }
        if(code.equals("L0001")) {
            double debt1 = 19.75 * Math.pow(1.07, month);
            double debt2 = 4 * Math.pow(1.07, month - 22);
            return (debt1 + debt2);
        }
        if(code.equals("N0001")) {
            double debt1 = 12.07 * Math.pow(1.07, month);
            return debt1;
        }
        return -1;
    }
}

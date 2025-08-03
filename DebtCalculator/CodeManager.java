public class CodeManager {
    private String code;
    private String minimum;
    private int month;
    
    public CodeManager(String c) {
        code = c;
        
        if(code.equals("A0001")) minimum = "March 2025";
        if(code.equals("L0001")) minimum = "September 2023";
    }
    
    public CodeManager(int m, String c) {
        month = m;
        code = c;
    }
    
    public String getMinimum() {
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
        return -1;
    }
}

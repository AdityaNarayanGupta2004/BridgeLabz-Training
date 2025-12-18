public class CalculateProfitLoss {
    public static void main(String[] args) {
        int cp = 129;
        int sp = 191;
        int profit = sp-cp;
        double profitper = (profit/cp)*100;
        System.err.println("The Cost Price is INR"+ cp +" and Selling Price is "+ sp);
        System.out.print("The profit is INR "+ profit+ "and the profit percentage is "+ profitper+"%");
    }
}

package Arrays;

public class stockBuySell {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int prices[] = { 7, 1, 5, 3, 6, 4 };
		 //String x ="A Bnjak";
	     System.out.print(maxProfit(prices));

	}
	 public static int maxProfit(int[] prices)
	    {
	        int n = prices.length;
	        int cost = 0;
	        int maxCost = 0;
	 
	        if (n == 0) {
	            return 0;
	        }
	 
	        int min_price = prices[0];
	 
	        for (int i = 0; i < n; i++) {
	 
	            min_price = Math.min(min_price, prices[i]);
	 
                cost = prices[i] - min_price;
	 
	            maxCost = Math.max(maxCost, cost);
	        }
	        return maxCost;
	    }
	   
	
}

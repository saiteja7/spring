
public class MaximumStock {

	public static void main(String[] args) {
		int [] prices = {7,1,5,3,6,4};
		
		//System.out.println(maxProfitSum(prices));
		System.out.println(maxProfit(prices));
	}
	
	public static int maxProfit(int[] a) {
		int minNumber = a[0];
		int profit =0;
		
		for(int i=0;i<a.length;i++) {
			minNumber = Math.min(a[i], minNumber);
			profit = Math.max(profit, a[i]- minNumber);
		}
		
		return profit;
	}
}

import java.util.Arrays;

public class MaximumProfit {

	public static void main(String[] args) {
		
		// [123,87,563,87,23,678,89,456]
		//find the days where you can buy and sell the stocks and your profit is maximum
		
		int[] numbers = {123,87,563,87,23,678,89,456};
		System.out.println(getSmallest(numbers, 8));
		
	}
	
//	public static int maxProfit(int[] prices) {
//		int profit = Integer.MIN_VALUE;
//		for(int i=0;i<prices.length;i++) {
//			for(int j=i+1;j<prices.length;j++) {
//				int diff = prices[i]-prices[j];
//				profit = Math.
//			}
//		}
//		
//		return 0;
//	}
//	
	public static int getSmallest(int[] numbers, int n) {
		
//	    for(int i = 0;i<numbers.length;i++) {
//	    	for(int j=i+1;j<numbers.length;j++) {
//	    		if(numbers[i]>numbers[j]) {
//	    			int temp =numbers[i];
//	    			numbers[i]=numbers[j];
//	    			numbers[j]=temp;
//	    		}
//	    	}
//	    }
		
//		
		int start =0;
		int end=numbers.length;
		while(start < end) {
			
		}
		
		return numbers[n-1];
	}
}

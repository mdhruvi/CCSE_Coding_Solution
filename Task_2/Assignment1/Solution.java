/**
 * 
 */
package Assignment1;

/**
 * @author dhruvimodi
 *
 */
public class Solution {

	/**
	 * 
	 */
	public Solution() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Minimum value is set at index 0, and maximumProfit is initialized at 0. 
	 * Every current transaction is calculated by subtraction of current stock price and minimum value
	 * To achieve Max profit by selling stock, then we find the maximum.
	 * 
	 * 
	 * Time Complexity : O(n)
	 * Space Complexity : O(1)
	 */
	public static int maxProfit(int[] prices) {
        int minValue = prices[0], maxProfit = 0;
        
        for(int i = 0; i < prices.length; i++){
            minValue = Math.min(minValue, prices[i]); // Calculate minimum value to buy stocks
            int profit = prices[i] - minValue; // Calculate the current transaction
            maxProfit = Math.max(maxProfit, profit); // Calculate maximum profit achieved by the transaction
        }
        
        // Return the maximum profit
        return maxProfit;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prices[] = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));

	}

}
